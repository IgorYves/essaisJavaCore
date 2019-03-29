package tpjavabean.factorielle;

public class FactorialTooBigException extends Exception {
	@Override
	public String toString(){return "votre nombre est trop grand pour java, recommencez SVP";}
}
