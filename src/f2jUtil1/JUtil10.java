package f2jUtil1;

import java.util.Arrays;

class JUtil10 {

	public static void main(String[] args) {
		int arr[] = new int[20];
		for (int i=0; i<10; i++) {
			arr[i] = i * 2;
		}
		
		for (int i=10; i<20; i++) { 
			arr[i] = 25 - i; 
		}
		 
		
		for (int i : arr) {System.out.print(i + " ");}
		
		System.out.println("\n-----------");
		Arrays.sort(arr);
		for (int i : arr) {System.out.print(i + " ");}
		
		System.out.println("\n-----------");
		Arrays.fill(arr, 2, 4, 100);
		for (int i : arr) {System.out.print(i + " ");}
		
		System.out.println("\n-----------");
		Arrays.sort(arr);
		for (int i : arr) {System.out.print(i + " ");}
		
		System.out.println("\n-----------");
		System.out.println("1st pos de 10 : " + Arrays.binarySearch(arr, 10));
		System.out.println("1st pos de 5 : " + Arrays.binarySearch(arr, 5));
		
		
	}
}
