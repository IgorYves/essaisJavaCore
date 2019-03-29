/**
 * 
 */
package projet01;

/**
 * @author HUGOT Yves (igor) aka _yamster
 *
 */
public class TempTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArr = {555,896,5,82,3,22,1};


		int temp, current=0, min=0, minval;
		do {
			System.out.println("current-"+current);
			minval = intArr[current];
			min=current;
			for (int i=current+1; i<intArr.length; i++) {
				if(minval>intArr[i]){
					min=i;
					minval = intArr[i];
					System.out.println("i-"+i);
				};
			};
			System.out.println("-----------------");
			System.out.println("min-"+min+"\tminval-"+minval+"\tcur-"+current);
			if(min>current){
				temp = intArr[current];
				intArr[current] = intArr[min];
				intArr[min] = temp;
			};

			System.out.print("Integer Array[]={");
			for (int i=0; i<intArr.length; i++) {
				System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
			};
			System.out.print("}\n");
			System.out.println("-----------------");

			current++;
		}while(current<intArr.length);


		System.out.print("Integer Array[]={");
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + ((i == (intArr.length - 1))?"":","));
		};
		System.out.print("}\n");

	}

}
