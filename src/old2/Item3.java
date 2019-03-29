package old2;
public class Item3
{
	public static void main (String[] args)
	{
	int a=1;
	int b=1;	
	System.out.println("*********************************");
	System.out.println("\"" + a + " + " + b + " = " + (a+b) + "\"");
	System.out.println("*********************************");
	//no modif debut
	byte c=70;
	byte d=70;
	byte e;
	//no modif fin
	/*
	la somme de c et d sort de champs de valeurs de type byte,
	il n'est pas possible de l'affecter 'a une variable type byte
	(perte d'information, resultat aleatoire)
	je n'ai pas trouve' moyens de changer type de variable
	ni de le detruire et declarer/affecter 'a nouveau (en int)
	j'ai passe' par une autre variable pour afficher le resultat
	*/
	//e=(byte)(c+d);
	int e2;
	e2=c+d;
	System.out.println(e2 + "\t(valeur de e2)");
	System.out.println("*********************************");
	System.out.println((float)(20.1+16.8));
	System.out.print("*********************************");
	}
}