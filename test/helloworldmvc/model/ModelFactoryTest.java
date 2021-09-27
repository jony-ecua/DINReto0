package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class ModelFactoryTest {

    /*
    *Hace una prueba para saber si el objeto no es nulo y si lo devuelto es un Model
    */
    @Test
    public void testNotNullAndModelReturn() {
        //objeto a testear
        ModelFactory modelF = new ModelFactory();
        
        assertNull("El objeto es nulo",modelF);
    }
    
}
