package helloworldmvc.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase que ejecutara una prueba a la factoria de la vista para que no devuelva un objeto nulo
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class ViewFactoryTest {

    /**
    * Hace una prueba para saber si el objeto no es nulo y si lo devuelto es un Model
    */
    @Test
    public void testViewReturn() {
        //objeto a testear
        ViewFactory viewF = new ViewFactory();

        assertNotNull("El objeto es nulo", viewF);
    }

}
