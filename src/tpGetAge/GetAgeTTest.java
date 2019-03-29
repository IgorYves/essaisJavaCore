package tpGetAge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class GetAgeTTest {

	@Test
	void testGetAgeTestable1() {
		assertEquals(18, 
			GetAgeT.getAgeTestable(new GregorianCalendar(2000, 11, 16).getTime(), 
									new GregorianCalendar(2018, 11, 17).getTime()),
			"!!! Erreur 1");
	}
	
	@Test
	void testGetAgeTestable2() {
		assertEquals(18, 
			GetAgeT.getAgeTestable(new GregorianCalendar(2000, 11, 17).getTime(), 
									new GregorianCalendar(2018, 11, 17).getTime()),
			"!!! Erreur 2");
	}
	
	@Test
	void testGetAgeTestable3() {
		assertEquals(17, 
			GetAgeT.getAgeTestable(new GregorianCalendar(2000, 11, 20).getTime(), 
									new GregorianCalendar(2018, 11, 17).getTime()),
			"!!! Erreur 3");
	}
	
	@Test
	void testGetAgeTestable4() {
		assertEquals(17, 
			GetAgeT.getAgeTestable(new GregorianCalendar(2001, 11, 17).getTime(), 
									new GregorianCalendar(2018, 11, 17).getTime()),
			"!!! Erreur 4");
	}
	
	@Test
	void testGetAgeTestable5() {
		assertEquals(16, 
			GetAgeT.getAgeTestable(new GregorianCalendar(2002, 11, 17).getTime(), 
									new GregorianCalendar(2018, 11, 17).getTime()),
			"!!! Erreur 5");
	}
	
	@Test
	void testGetAgeTestable6() {
		assertEquals(15, 
			GetAgeT.getAgeTestable(new GregorianCalendar(2003, 11, 17).getTime(), 
									new GregorianCalendar(2018, 11, 17).getTime()),
			"!!! Erreur 6");
	}
	
	@Test
	void testGetAgeTestable7() {
		assertEquals(14, 
			GetAgeT.getAgeTestable(new GregorianCalendar(2004, 11, 17).getTime(), 
									new GregorianCalendar(2018, 11, 17).getTime()),
			"!!! Erreur 7");
	}
	
	
	

}
