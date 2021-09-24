/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelFactoryTest {

    /*
    *Hace una prueba si el objeto no es nulo y si es un Model
    */
    @Test
    public void testNotNullAndModelReturn() {
        //objeto a testear
        ModelFactory modelF = new ModelFactory();
        Model modelo = null;
        
        
        assertNotNull("El objeto es nulo",modelF);
        assertEquals(modelo, modelF.getModel());
    }
    
}
