/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author 2dam
 */
public class FileModelImplementationTest {
    
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
