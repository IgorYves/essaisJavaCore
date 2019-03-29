package e3TryCatchAnnotations;

import java.lang.invoke.WrongMethodTypeException;

import javax.xml.crypto.NoSuchMechanismException;

class TryCatch {

	public static void main(String[] args) {
		try {
			t();
			System.out.println("dans main apres t()");
		}
		catch(NoSuchMechanismException ex) {
			System.out.println("dans catch 2 : " + ex.getMessage());
		}
		catch(YHException | YHException2 ex) {
			System.out.println("dans catch 2 : " + ex);
			System.out.println("dans catch 2 : " + ex.getCause());
		}
		catch(Exception ex) {
			System.out.println("dans catch 2 : " + ex.getMessage());
		}
		finally {
			System.out.println("dans fianlly ");
		}
		System.out.println("apres fianlly ");
		

	}
	private static void t() throws IllegalAccessException, YHException, YHException2 {
		try {
		//int a = 1/0;
		System.out.println("apres /0 t()");
		int[] i = {1};
		//int x = i[2];
		System.out.println("apres i[2] t()");
		
		//throw new WrongMethodTypeException("WMTE");
		//throw new NoSuchMechanismException("NSME");
		//throw new IllegalAccessException("IAE");
		//YHException e = new YHException(1);
		YHException2 e = new YHException2(1);
		e.initCause(new ArithmeticException(" cause"));
		throw e;
		}
		catch(ArithmeticException ex) {
			System.out.println("dans catch t() " + ex.getMessage());
		}
		catch(WrongMethodTypeException ex) {
			System.out.println("dans catch t() " + ex.getMessage());
		}
		finally {
			System.out.println("dans fianlly t() ");
		}
		System.out.println("apres fianlly t() ");
	}
}

class YHException extends Exception {
	private int i;
	YHException(int a){i = a;}
	@Override
	public String toString(){return "YHException[" + i + "]";}
}
class YHException2 extends Exception {
	private int i;
	YHException2(int a){i = a;}
	@Override
	public String toString(){return "YHException2[" + i + "]";}
}
