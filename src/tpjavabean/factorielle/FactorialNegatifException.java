package tpjavabean.factorielle;

public class FactorialNegatifException extends Exception {
	@Override
	public String toString(){return "nombre negative n'a pas de factorielle, recommencez SVP";}
}
