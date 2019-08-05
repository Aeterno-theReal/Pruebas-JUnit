package MisPruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import MisClases.Coche;

class CocheTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test de creación") //Muestra el título en las pruebas
	void test() {
		//fail("Not yet implemented");
		Coche c=new Coche("Marca", "Modelo", 1900);
		
		assertEquals("Peugeot", c.getMarca());
		assertEquals("Modelo", c.getModelo());
		assertEquals(1900, c.getAnyo());
	}

	@Test
	void testDeCreacion() {
		//fail("Not yet implemented");
	}
	
	@Test
	void test3() {
		//fail("Not yet implemented");
	}
	
	@Test
	@Disabled //Con Disabled nos salta la prueba y no la realiza
	void test4() {
		//fail("Not yet implemented");
	}
}
