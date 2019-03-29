package s48_afpa_ex.ex10;

import java.util.Arrays;

///////////////////////copie de reference

class TableauxInt1 {
	public static void main(String[] args) {
		echo();
		echo("initialisation du tableau avec 10 int");
		echo("tableau tab1 :");
		int[] tab1 = {5,9,7,3,5,1,0,8,4,4};
		echoArr (tab1);
		echo();
		
		int[] tab2 = new int[10];
		tab2 = tab1;
		echo("copie du tab1 dans tab2");
		echo("tableau tab2 :");
		echoArr (tab2);
		echo();
		
		for (int i = 0; i < tab1.length; i++) {tab1[i] += 10;}
		echo("ajout +10 aux elements de tab1");
		echo("tableau tab1 :");
		echoArr (tab1);
		echo("tableau tab2 :");
		echoArr (tab2);
		echo();
		
		echo("tab1 trié :");
		Arrays.sort(tab1);
		echoArr (tab1);
		
		echo("-------------\n\tfin");
		
		
		
	}//fin main
	
	//raccourcis pour System.out.println();
	private static void echo() {
		System.out.println();
	};
	private static void echo(String str) {
		System.out.println(str);
	};
	private static void echo(int i, String str) {
		if(i == 0)System.out.print(str);
	};
	
	//print Array sur ecran sous forme {val, val, ...}
	//Integers
	private static void echoArr(int arr[]) {
		echo(0, "Integer Array[]={");
		for (int i=0; i<arr.length; i++) {
			echo(0, arr[i] + ((i == (arr.length - 1))?"":","));
		};
		echo(0, "}\n");
	};
	//Strings
	private static void echoArr(String arr[]) {
		echo(0, "String Array[]={\"");
		for (int i=0; i<arr.length; i++) {
			echo(0, arr[i] + ((i == (arr.length - 1))?"":"\",\""));
		};
		echo(0, "\"}\n");
		
	};
	
	

	
}
