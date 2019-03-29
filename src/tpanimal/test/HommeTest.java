package tpanimal.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpanimal.metier.Homme;

class HommeTest {
	Homme homme;
	
	@BeforeEach
	void setUp() throws Exception {
		homme = new Homme();
	}

	@AfterEach
	void tearDown() throws Exception {
		homme = null;
	}

	@Test
	void test() {
		assertEquals("Je suis un animal. Je suis un mamifere. Je suis un homme.", 
				homme.toString(), "le toString de Chien(\"Medor\") n'est pas conforme");
	}

}
