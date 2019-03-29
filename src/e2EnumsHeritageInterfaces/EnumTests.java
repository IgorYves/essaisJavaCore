package e2EnumsHeritageInterfaces;

enum JSemaine {
	Lundi(1), Mardi(2), Mercredi(3), Jeudi(4), Vendredi(5), Samedi(0), Dinamche(0), 
			Понедельник(1), EncoreéèêçàОдинЖур,
			AutreJour {@Override
				int eval(int x, int y) {return x+y;}
			},
			ЕщеВторойДень("описание второго дня");
	private int workDay;
	private String descr;
	int eval(int x, int y) {
		return 0;
	}
	static {
		System.out.println("static");
	}
	JSemaine() {
		workDay = -1;
		System.out.println("-1");
	}
	JSemaine(int i) {
		workDay = i;
		System.out.println(i);
	}
	JSemaine(String s) {
		descr = s;
		System.out.println(s);
	}
	int getWday() {
		return workDay;
	}
	String getDescr() {
		return descr;
	}
	static {
		System.out.println("static2");
	}
	
};

class EnumTests {

	public static void main(String[] args) {
		JSemaine js;
		js = JSemaine.Mercredi;

		if (js == JSemaine.Mercredi) {
			System.out.println("ok");
			System.out.println(js);
		}

		js = JSemaine.Понедельник;
		System.out.println(js + " jour travaillé " + js.getWday());
		System.out.println();
		
		for (JSemaine j : JSemaine.values()) {
			System.out.println(j + " jour travaillé " + j.getWday() + " " + j.getDescr() + " ordinal " + j.ordinal());
		}
		
		System.out.println(JSemaine.AutreJour.eval(5, 6));
		
		js = JSemaine.EncoreéèêçàОдинЖур;
		System.out.println(js);
		
		System.out.println("------------------------");
		String стринг = "это стринг";
		System.out.println(стринг);

		String たくみさんの本 = "c'est du chinoi, pardon, du japonais";
		System.out.println(たくみさんの本);

		int x = 1_____________________12______________345____________________28;
		System.out.println(x);
		
		System.out.println(js.ordinal());
		
		double i = 1;
		System.out.println(i/0);
		System.out.println(100d/0);
		
		long a = 0x0000aL;
		long b = 0xbL;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		System.out.println('\ua432');
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		String str5 = str3;
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str3 == str5);
		
		System.out.println();
		System.out.println("bla bla2".startsWith("bl"));
		System.out.println("bla bla2".endsWith("bla"));
		
		System.out.println();
		System.out.println("bla".compareTo("bla"));
		System.out.println("bla".compareTo("ala"));
		System.out.println("bla".compareTo("dla"));
		
		System.out.println();
		System.out.println("lorem ipsum dolor sit amet".indexOf("sum"));
		System.out.println((char)('a'+'b'));

	}

}
