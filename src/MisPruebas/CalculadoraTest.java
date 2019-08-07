package MisPruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import MisClases.Calculadora;

class CalculadoraTest {

	static InputStream original; //metodos de entrada y salida de datos al programa para resetear el destino de entrada y salida de datos
	static PrintStream originalSalida;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inicio de todas las pruebas.");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Final de todas las pruebas.");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inicio de una prueba.");
		
		//Antes de empezar cada prueba decimos donde quiere que meta datos, en este caso dierectamente al programa
		original=System.in;
		originalSalida=System.out;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Final de una prueba.");
		//Cuando termina cada prueba decimos donde quiere que muestre los datos, en este caso por consola.
		System.setIn(original);
		System.setOut(originalSalida);
	}

	@Test
	@DisplayName("Prueba división")
	void test() {
		//fail("Not yet implemented");
		
		System.out.println("Test prueba división");
		assertEquals(0, Calculadora.division(0, 10));
		assertEquals(0, Calculadora.division(10, 0));
		assertEquals(0, Calculadora.division(0, 0));
	}
	
	@Test
	@DisplayName("Prueba de la suma")
	void test2() {
		
		System.out.println("Test prueba suma");
		
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
		
		System.out.println("Test prueba resta");
		
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
	
	@Test
	@DisplayName("Prueba de ficheros")
	void test4() throws IOException {
		
		//Esta parte es para introducir datos en el programa como si fuera el usuario
		String endl=System.getProperty("line.separator");
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String cadenaIntroducida=leerFichero("Entrada1.txt");
		ByteArrayInputStream in = new ByteArrayInputStream(cadenaIntroducida.getBytes());
		System.setIn(in);
		
		Calculadora.inicializarScaner(); //Se inicializa el scanner por si llamamos mas de una vez al metodo sumaNumeros.
		Calculadora.sumaNumeros();
		
		String cadenaSalida=leerFichero("Salida1.txt");
		
		assertEquals(cadenaSalida, out.toString());	
		
	}
	

	private String leerFichero(String nombre) throws IOException
	{
		FileReader miLectoFichero=null;
		String contenido="";
		try
		{
			miLectoFichero = new FileReader(new File(nombre));
			
			int caracterLeido=miLectoFichero.read();
			while(caracterLeido!=-1)
			{
				contenido+=((char) caracterLeido);
				caracterLeido=miLectoFichero.read();
			}
		}catch(EOFException e)
		{
			

		}
		return contenido;
	}
	
}
