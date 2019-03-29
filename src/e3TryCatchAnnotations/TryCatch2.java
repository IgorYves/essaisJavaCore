package e3TryCatchAnnotations;

/**
 * Class TryCatch2 pour faire des essais de try/catch
 *  
 * @author yves hugot
 * @version 2
 */

@Annot1("test")
@Annot2
@Annot3(3)
@Annot4(value=3, str="bla")
@UnMarker
@YHDescr(descr="description de classe TryCatch2")
@YHDescr2()
@YHAnnotation(str="example1", val=15)
@YHAnnotation(str="example2")
@YHAnnotation(val=25)
class TryCatch2 {
	/**
	 * metode main lance l'exception et si besoin fait appel
	 * 			des metodes metode() surchargées (dans autres versions)
	 * 
	 * @param args[] n'est pas utilisé
	 * @exception lance exeption NombreHabitantException
	 */
	public static void main(String[] args) {
		try {
			throw new NombreHabitantException();
		}
		catch(NombreHabitantException ex) {
			System.out.println("dans catch ");
		}
		finally {
			System.out.println("dans fianlly");
		}
		System.out.println("apres fianlly");
	}
	
	/**
	 * metode imprime son nom
	 * @param  pas de parametres
	 * @return pas de retour
	 */
	@YHDescr(descr="description de TryCatch2.metode")
	@YHDescr2()
	@YHAnnotation(str="YHAnnotation de TryCatch2.metode", val=2)
	public void metode(){
		System.out.println("metode()");
	}
	
	/**
	 * metode imprime son nom et des parametres
	 * @param deux parametres, integer et double
	 * @return pas de retour
	 */
	@YHAnnotation(str="YHAnnotation de TryCatch2.metode avec params", val=3)
	public void metode(int i, double d){
		System.out.println("metode()" + i + " " + d);
	}
}


@YHAnnotation(str="bla bla", val=25)
class NombreHabitantException extends Exception{ 
	public NombreHabitantException(){
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
	}  
}