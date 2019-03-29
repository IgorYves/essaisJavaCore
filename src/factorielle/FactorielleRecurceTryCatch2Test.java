/**
 * Tests de FactorielleRecurceTryCatch2
 */
package factorielle;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author admin
 *
 */
class FactorielleRecurceTryCatch2Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link factorielle.FactorielleRecurceTryCatch2#getFactorial(java.lang.String)}.
	 */
	@Test
	void testGetFactorialString1() throws Exception {
		assertEquals(1, FactorielleRecurceTryCatch2.getFactorial(0), "!!! Erreur1");
	}

	@Test
	void testGetFactorialString2() throws Exception {
		assertEquals(1, FactorielleRecurceTryCatch2.getFactorial(1), "!!! Erreur2");
	}

	@Test
	void testGetFactorialString3() throws Exception {
		assertThrows(MyException1.class, 
						()->FactorielleRecurceTryCatch2.getFactorial(-1),
						"!!! Erreur3");
	}

	@Test
	void testGetFactorialString4() throws Exception {
		assertThrows(MyException2.class, 
						()->FactorielleRecurceTryCatch2.getFactorial(21),
						"!!! Erreur4");
	}

	@Test
	void testGetFactorialString5() throws Exception {
		assertThrows(MyException3.class, 
						()->FactorielleRecurceTryCatch2.getFactorial(""),
						"!!! Erreur5");
	}

	@Test
	void testGetFactorialString6() throws Exception {
		assertEquals(720, FactorielleRecurceTryCatch2.getFactorial(6), 
						"!!! Erreur6");
	}
	
	@Test
	void testGetFactorialString7() throws Exception {
		assertEquals(6227020800L, FactorielleRecurceTryCatch2.getFactorial(13), 
						"!!! Erreur7");
	}

	

}
