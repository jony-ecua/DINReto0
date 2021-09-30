package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase que ejecutara una prueba a la implementacion de la base de datos para saber si el string que retorna es correcto
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class BDModelImplementationTest {
    
   /**
    * Hace una prueba para saber si el saludo devuelto desde la BD es el correcto
    */
    @Test
    public void testGetGreetingBD() {
        //Se crea el objeto para el test
        BDModelImplementation greet = new BDModelImplementation();
        String saludoEsperado = "Hola Mundo MVC desde BD";
        
        //llamar al metodo "getGreeting"
        String saludo = greet.getGreeting();
        
        //comprobar que el saludo retorna lo que debe con assert
        assertEquals("El saludo no es igual",saludoEsperado, saludo);
    }
    
}
