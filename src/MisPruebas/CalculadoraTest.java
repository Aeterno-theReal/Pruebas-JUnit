package MisPruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import MisClases.Calculadora;

class CalculadoraTest {

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
	@DisplayName("Prueba división")
	void test() {
		//fail("Not yet implemented");
		
		assertEquals(0, Calculadora.division(0, 10));
		assertEquals(0, Calculadora.division(10, 0));
		assertEquals(0, Calculadora.division(0, 0));
	}
	
	@Test
	@DisplayName("Prueba de la suma")
	void test2() {
		
		//Esta parte es para introducir datos en el programa como si fuera el usuario.
		String endl=System.getProperty("line.separator");
		String cadenaIntroducida="2"+endl+"2"+endl;
		ByteArrayInputStream in = new ByteArrayInputStream(cadenaIntroducida.getBytes());
		System.setIn(in);
		
		
		
		int suma=Calculadora.suma();
		assertEquals(4,suma);
	}

	@Test
	@DisplayName("Prueba de la resta")
	void test3() {
		//Esta parte es para introducir datos en el programa como si fuera el usuario
		String endl=System.getProperty("line.separator");
		String cadenaIntroducida="2"+endl+"2"+endl;
		ByteArrayInputStream in = new ByteArrayInputStream(cadenaIntroducida.getBytes());
		System.setIn(in);

		//Esta parte es para cuando en la salida del método tenemos algo que se muestra por consola en lugar de alguna variable.
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		Calculadora.resta();
		
		assertEquals("La resta es: 0"+endl, out.toString());
	}
}
