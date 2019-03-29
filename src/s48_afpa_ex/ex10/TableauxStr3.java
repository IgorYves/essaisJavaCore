package s48_afpa_ex.ex10;

import java.util.Arrays;

///////////////////////copie de reference

class TableauxStr3 {
	public static void main(String[] args) {
		echo();
		echo("initialisation du tableau avec 10 strings");
		echo("tableau tab1 :");
		String[] tab1 = {"a","KLM","b","8","AirFrance","Dod","kIvI","une chaine","true","z"};
		echoArr (tab1);
		echo();
		
		String[] tab2 = new String[10];
		for (int i = 0; i < tab1.length; i++) {tab2[i] = tab1[i];}
		echo("copie du tab1 dans tab2");
		echo("tableau tab2 :");
		echoArr (tab2);
		echo();
		
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = "A" + tab1[i].substring(1);
		}
		echo("modification de premier caractere des elements de tab1");
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
