package factorielle;

class FactorielleExceptions {

	public static void main(String[] args) {
		//fichier foure-tout pour des classes MyExceptionX
	}//fin main
}

class MyException1 extends Exception {
	private String message;
	MyException1(){message = "Nombre negative n'a pas de factorielle, recommencez SVP";}
	MyException1(String m){message = m;}
	@Override
	public String getMessage() {return message;}
}
class MyException2 extends Exception {
	private String message;
	MyException2(){message = "Votre nombre est trop grand pour java, recommencez SVP";}
	MyException2(String m){message = m;}
	@Override
	public String getMessage() {return message;}
}
class MyException3 extends Exception {
	private String message;
	MyException3(){message = "Votre entrée n'est pas un nombre, recommencez SVP";}
	MyException3(String m){message = m;}
	@Override
	public String getMessage() {return message;}
}

