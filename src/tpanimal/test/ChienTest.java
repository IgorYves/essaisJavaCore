package tpanimal.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpanimal.metier.Chien;

class ChienTest {
	Chien chien;
	
	@BeforeEach
	void setUp() throws Exception {
		chien = new Chien("Medor");
	}

	@AfterEach
	void tearDown() throws Exception {
		chien = null;
	}

	@Test
	void test() {
		assertEquals("Je suis un animal de nom Medor. Je suis un mamifere. Je suis un chien.", 
				chien.toString(), "le toString de Chien(\"Medor\") n'est pas conforme");
	}

}
