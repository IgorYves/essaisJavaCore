package e8Generics;

class Gen3 {

	public static void main(String[] args) {
		Integer[] iNums = {1,2,3,4,5,6,7,8,9,9};
		G3<Integer> iObj = new G3<Integer>(iNums);
		System.out.println("moyenne ints = " + iObj.average());
		
		Double[] iNums2 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.0};
		G3<Double> iObj2 = new G3<Double>(iNums2);
		System.out.println("moyenne doubles = " + iObj2.average());
		
		if(iObj.haveSameAvg(iObj2))System.out.println("meyennes sont egales");
		else System.out.println("meyennes sont differents");
	}
}

class G3<T extends Number>{
	T[] nums;
	G3(T[] o){nums = o;}
	double average() {
		double sum = 0.0;
		for(int i=0; i<nums.length; i++) {sum+=nums[i].doubleValue();}
		return sum/nums.length;
	}
	boolean haveSameAvg(G3<?> o) {
		if(average() == o.average())return true;
		else return false;
	}
}

//class G4<T extends UnClass & UneInterface>{}