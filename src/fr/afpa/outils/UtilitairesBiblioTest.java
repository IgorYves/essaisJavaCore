package fr.afpa.outils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

class UtilitairesBiblioTest {

	
	@Test
	void testIsPretEnRetardDateDateInt1() {
		Date date2test = new Date();
		assertEquals(false, 
				UtilitairesBiblio.isPretEnRetard(new Date(date2test.getTime() - 1*(1000*60*60*24))),
				"!!! Erreur 1");
		date2test = null;
	}
	
	@Test
	void testIsPretEnRetardDateDateInt2() {
		Date date2test = new Date();
		assertEquals(false, 
				UtilitairesBiblio.isPretEnRetard(new Date(date2test.getTime() - 8*(1000*60*60*24))),
				"!!! Erreur 2");
		date2test = null;
	}
	
	@Test
	void testIsPretEnRetardDateDateInt3() {
		Date date2test = new Date();
		assertEquals(false, 
				UtilitairesBiblio.isPretEnRetard(new Date(date2test.getTime() - 15*(1000*60*60*24))),
				"!!! Erreur 3");
		date2test = null;
	}
	
	@Test
	void testIsPretEnRetardDateDateInt4() {
		Date date2test = new Date();
		assertEquals(true, 
				UtilitairesBiblio.isPretEnRetard(new Date(date2test.getTime() - 16*(1000*60*60*24))),
				"!!! Erreur 4");
		date2test = null;
	}
	
	@Test
	void testIsPretEnRetardDateDateInt5() {
		Date date2test = new Date();
		assertEquals(true, 
				UtilitairesBiblio.isPretEnRetard(new Date(date2test.getTime() - 20*(1000*60*60*24))),
				"!!! Erreur 5");
		date2test = null;
	}
	
	
	

}
