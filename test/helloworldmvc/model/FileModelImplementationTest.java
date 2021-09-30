package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase que ejecutara una prueba a la implementacion del archivo de propiedades para saber si el string que retorna es correcto
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class FileModelImplementationTest {
    /**
    * Hace una prueba para saber si el saludo devuelto es el correcto
    */
    @Test
    public void testGetGreeting() {
        //Se crea el objeto para el test
        FileModelImplementation greet = new FileModelImplementation();
        String saludoEsperado = "Hola Mundo MVC";
        
        //llamar al metodo "getGreeting"
        String saludo = greet.getGreeting();
        
        //comprobar que el saludo retorna lo que debe con assert
        assertEquals("El saludo no es igual",saludoEsperado, saludo);
    }
}
