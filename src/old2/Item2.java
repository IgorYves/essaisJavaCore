package old2;
public class Item2
{
	public static void main (String[] args)
	{
	int a=1;
	int b=1;	
	System.out.println("*********************************");
	System.out.println("\"" + a + " + " + b + " = " + (a+b) + "\"");//on corrige le string d'affichage
	//no modif debut
	byte c=50;
	byte d=70;
	byte e;
	//no modif fin
	e=(byte)(c+d);//on fais cast en type byte
	System.out.println("*********************************");
	System.out.println(e + "\t(valeur de e)");
	System.out.println("*********************************");
	System.out.println((float)(20.1+16.8));//on fais cast en type float
	System.out.println("*********************************");
	System.out.println("affichage conforme a la demande");
	System.out.print("*********************************");
	}
}