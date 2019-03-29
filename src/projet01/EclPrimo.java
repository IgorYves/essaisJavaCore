package projet01;

import java.util.Scanner;

// arraySort

public class EclPrimo {
	public static void main (String args[]) {
		System.out.print("entrez vos nombres : ");
		Scanner inputScanner = new Scanner(System.in);
		String usrInputStr = inputScanner.nextLine();
		inputScanner.close();
		String[] usrInputStrArr = usrInputStr.split(" ");
		
		int[] usrInputIntArr;
		usrInputIntArr = new int[usrInputStrArr.length];
		for (int i=0; i<usrInputStrArr.length; i++) {
			usrInputIntArr[i] = Integer.parseInt(usrInputStrArr[i]);
		};
		
		int[] intArr = usrInputIntArr;
		for (int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		};
		
		System.out.println("-----------------");
		for (int i=1, j, tmp; i<usrInputIntArr.length; i++) {
			j = i;
			while(j>0 && usrInputIntArr[j-1]>usrInputIntArr[j]) {
				tmp = usrInputIntArr[j-1];
				usrInputIntArr[j-1] = usrInputIntArr[j];
				usrInputIntArr[j] = tmp;
				j--;
			};
		};
		
		for (int i=0; i<usrInputIntArr.length; i++) {
			System.out.println(usrInputIntArr[i]);
		};
		
		
	}
}
