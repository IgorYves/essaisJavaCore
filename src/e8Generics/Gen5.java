package e8Generics;

class Gen5 {

	public static void main(String[] args) {
		Integer[] inums = {5,8,1,7,6,8,2};
		Character[] cnums = {'f','e','s','k'};
		C<Integer> iobj = new C<Integer>(inums);
		C<Character> cobj = new C<Character>(cnums);
		System.out.println("max inums " + iobj.max());
		System.out.println("min inums " + iobj.min());
		System.out.println("max cnums " + cobj.max());
		System.out.println("min cnums " + cobj.min());
	}

}

interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
}

class C<T extends Comparable<T>> implements MinMax{
	T[] vals;
	C(T[] o){vals = o;}

	@Override
	public T min() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if(vals[i].compareTo(v) < 0)v = vals[i];
		}
		return v;
	}
	@Override
	public T max() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if(vals[i].compareTo(v) > 0)v = vals[i];
		}
		return v;
	}
}