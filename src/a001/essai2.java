package a001;

/**
 * appel d'une methode statique de class abstract
 * @author admin
 *
 */
public class essai2 {

	public static void main(String[] args) {
		GrandPereAbstract.metodeStatic();
		
	}

}

abstract class GrandPereAbstract {
	static void metodeStatic() {System.out.println("metS grand-pere");}
	abstract void metodeAbstract();
}


