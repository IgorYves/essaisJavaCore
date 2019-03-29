package tpjavabean.factorielle;

public class FactorialNotNumberException extends Exception {
	@Override
	public String toString(){return "votre entrée n'est pas un nombre, recommencez SVP";}
}
