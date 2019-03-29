package s48_afpa_ex.ex10;

import java.util.Arrays;

///////////////////////copie de reference

class TableauxStrBff1 {
	public static void main(String[] args) {
		echo();
		echo("initialisation du tableau avec 10 strings");
		echo("tableau tab1 :");
		StringBuffer[] tab1 = {new StringBuffer("a"),
								new StringBuffer("KLM"),
								new StringBuffer("b"),
								new StringBuffer("8"),
								new StringBuffer("AirFrance"),
								new StringBuffer("Dod"),
								new StringBuffer("kIvI"),
								new StringBuffer("une chaine"),
								new StringBuffer("true"),
								new StringBuffer("z")};
		echoArr (tab1);
		echo();
		
		StringBuffer[] tab2 = new StringBuffer[10];
		tab2 = tab1;
		echo("copie du tab1 dans tab2");
		echo("tableau tab2 :");
		echoArr (tab2);
		echo();
		
		for (int i = 0; i < tab1.length; i++) {
			tab1[i] = tab1[i].replace(0,1,"A");
		}
		echo("modification de premier caractere des elements de tab1");
		echo("tableau tab1 :");
		echoArr (tab1);
		echo("tableau tab2 :");
		echoArr (tab2);
		echo();
		
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
	//Strings Buffers
	private static void echoArr(StringBuffer arr[]) {
		echo(0, "StringBuffer Array[]={\"");
		for (int i=0; i<arr.length; i++) {
			echo(0, arr[i] + ((i == (arr.length - 1))?"":"\",\""));
		};
		echo(0, "\"}\n");
		
	};
	
	

	
}
