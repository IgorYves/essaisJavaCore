package old2;
import java.lang.Math;
public class Item4
{
	public static void main (String[] args)
	{
		System.out.println("\n*********************************");
		System.out.println("debut fonctions math");
		System.out.println("*********************************");
		System.out.println("racine carree de 4 = " + (int)Math.sqrt(4));
		System.out.println("cos pi/2 = " + (int)Math.cos((Math.PI/2)) + " <-- resultat de calcule (cast)");
		System.out.println("\t(" + Math.cos((Math.PI/2)) + " selon java)");
		
		System.out.print("[enter] pour continuer");
		System.console().readLine();
		System.out.println("*********************************");
		
		float x, y;
		x=(float)Math.random();
		y=(float)Math.random();
		System.out.println("parmis 2 nombres aleatoires \n" + x + " et " + y + " plus grand est " + Math.max(x,y));
		
		System.out.print("[enter] pour continuer");
		System.console().readLine();
		System.out.println("*********************************");
		
		x=(float)Math.random();
		y=(float)Math.random();
		x*=1000;
		y*=1000;
		System.out.println("parmis 2 nombres aleatoires \n" + (int)x + " et " + (int)y + " plus grand est " + Math.max((int)x,(int)y));
		
		System.out.print("[enter] pour continuer");
		System.console().readLine();
		System.out.println("*********************************");
		
		x=(float)Math.random();
		y=(float)Math.random();
		x*=10000;
		y*=10000;
		System.out.println("parmis 2 nombres aleatoires \n" + (int)x + " et " + (int)y + " plus grand est " + Math.max((int)x,(int)y));
		
		
		System.out.println("*********************************");
		System.out.println("fin fonctions math");
		System.out.println("*********************************");
		
		System.out.print("[enter] pour continuer");
		System.console().readLine();
		
		System.out.println("\n\n*********************************");
		System.out.println("debut 5 nombres entiers aleatoires");
		System.out.println("*********************************");
		double rand;
		int rand2, rand3;
		for (int i=1; i<6; i++)
		{
			rand = Math.random();
			rand *=100;
			rand2 = (int)rand;
			rand3 = 1+rand2%10;
			System.out.print(rand3);
			System.out.print("\t");
		};
		System.out.println("\n*********************************");
		System.out.println("fin 5 nombres entiers aleatoires");
		System.out.println("*********************************");
	};
};