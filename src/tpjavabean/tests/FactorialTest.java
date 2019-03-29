package tpjavabean.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpjavabean.factorielle.Factorial;
import tpjavabean.factorielle.FactorialNegatifException;
import tpjavabean.factorielle.FactorialNotNumberException;
import tpjavabean.factorielle.FactorialTooBigException;
import tpjavabean.factorielle.FactorialVideException;

class FactorialTest {
	Factorial factorial;
	
	@BeforeEach
	void setUp() throws Exception {
		factorial = new Factorial();
	}
	@AfterEach
	void tearDown() throws Exception {
		factorial = null;
		System.gc();
	}
/////////////////////////////////////////////////////
	@Test
	void testGetFactorialString() throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals("1", factorial.getFactorial("0"), "factoriel de \"0\" doit etre \"1\"");
	}
	@Test
	void testGetFactorialString2() throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals("1", factorial.getFactorial("1"), "factoriel de \"1\" doit etre \"1\"");
	}
	@Test
	void testGetFactorialString3() throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertThrows(FactorialNotNumberException.class, ()->factorial.getFactorial("-1"),
				"factoriel de \"-1\" doit lancer une exception \"FactorialNotNumberException\"");
	}
	@Test
	void testGetFactorialString4() throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals("2432902008176640000", factorial.getFactorial("20"), 
				"factoriel de \"20\" doit etre \"2432902008176640000\"");
	}
	@Test
	void testGetFactorialString5() throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertThrows(FactorialTooBigException.class, ()->factorial.getFactorial("21"),
				"factoriel de \"21\" doit lancer une exception \"FactorialTooBigException\"");
	}
/////////////////////////////////////////////////
	@Test
	void testGetFactorialLong()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals(1L, factorial.getFactorial(0L), "factoriel de 0L doit etre 1L");
	}
	@Test
	void testGetFactorialLong2()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals(1L, factorial.getFactorial(1L), "factoriel de 1L doit etre 1L");
	}
	@Test
	void testGetFactorialLong3()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertThrows(FactorialNegatifException.class, ()->factorial.getFactorial(-1L),
				"factoriel de -1L doit lancer une exception \"FactorialNegatifException\"");
	}
	@Test
	void testGetFactorialLong4()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals(2432902008176640000L, factorial.getFactorial(20L), 
				"factoriel de 20L doit etre 2432902008176640000L");
	}
	@Test
	void testGetFactorialLong5()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertThrows(FactorialTooBigException.class, ()->factorial.getFactorial(21L),
				"factoriel de -1L doit lancer une exception \"FactorialTooBigException\"");
	}
////////////////////////////////////////////////////
	@Test
	void testGetFactorialInt()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals(1L, factorial.getFactorial(0), "factoriel de (int)0 doit etre 1L");
	}
	@Test
	void testGetFactorialInt2()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals(1L, factorial.getFactorial(1), "factoriel de (int)1 doit etre 1L");
	}
	@Test
	void testGetFactorialInt3()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertThrows(FactorialNegatifException.class, ()->factorial.getFactorial(-1L),
				"factoriel de (int)-1 doit lancer une exception \"FactorialNegatifException\"");
	}
	@Test
	void testGetFactorialInt4()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertEquals(2432902008176640000L, factorial.getFactorial(20), 
				"factoriel de (int)20 doit etre 2432902008176640000L");
	}
	@Test
	void testGetFactorialInt5()  throws FactorialNotNumberException, 
										FactorialVideException, 
										FactorialTooBigException, 
										FactorialNegatifException 
	{
		assertThrows(FactorialTooBigException.class, ()->factorial.getFactorial(21),
				"factoriel de (int)21 doit lancer une exception \"FactorialTooBigException\"");
	}
////////////////////////////////////////////
}
