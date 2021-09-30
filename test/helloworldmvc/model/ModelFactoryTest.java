package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase que ejecutara una prueba a la factoria del modelo para que no devuelva un objeto nulo
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class ModelFactoryTest {

    /**
    * Hace una prueba para saber si el objeto no es nulo y si lo devuelto es un Model
    */
    @Test
    public void testModelReturn() {
        //objeto a testear
        ModelFactory modelF = new ModelFactory();

        assertNotNull("El objeto es nulo", modelF);
    }

}
