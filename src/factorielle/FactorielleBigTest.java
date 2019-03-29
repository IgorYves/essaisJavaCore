package factorielle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FactorielleBigTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetFactorialString1() throws Exception {
		assertEquals(new BigInteger("1"), FactorielleBig.getFactorial("0"), 
						"!!! Erreur1");
	}

	@Test
	void testGetFactorialString2() throws Exception {
		assertEquals(new BigInteger("1"), FactorielleBig.getFactorial("1"), 
						"!!! Erreur2");
	}

	@Test
	void testGetFactorialString3() throws Exception {
		assertThrows(MyException1.class, 
						()->FactorielleBig.getFactorial("-1"),
						"!!! Erreur3");
	}

	@Test
	void testGetFactorialString4() throws Exception {
		assertEquals(new BigInteger("51090942171709440000"), 
						FactorielleBig.getFactorial("21"), 
						"!!! Erreur4");
	}

	@Test
	void testGetFactorialString5() throws Exception {
		assertThrows(MyException3.class, 
						()->FactorielleBig.getFactorial(""),
						"!!! Erreur5");
	}

	@Test
	void testGetFactorialString6() throws Exception {
		assertEquals(new BigInteger("720"), 
						FactorielleBig.getFactorial("6"), 
						"!!! Erreur6");
	}
	
	@Test
	void testGetFactorialString7() throws Exception {
		assertEquals(new BigInteger("6227020800"), 
						FactorielleBig.getFactorial("13"), 
						"!!! Erreur7");
	}
	
	@Test
	void testGetFactorialString8() throws Exception {
		assertEquals(new BigInteger("265252859812191058636308480000000"), 
						FactorielleBig.getFactorial("30"), 
						"!!! Erreur8");
	}
}
