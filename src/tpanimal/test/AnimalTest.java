package tpanimal.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tpanimal.metier.Animal;

class AnimalTest {
	Animal animal;
	
	@BeforeEach
	void setUp() throws Exception {
		animal = new Animal();
	}

	@AfterEach
	void tearDown() throws Exception {
		animal = null;
	}

	@Test
	void test() {
		assertEquals("Je suis un animal.", 
				animal.toString(), "le toString de Animal() n'est pas conforme");
	}

}
