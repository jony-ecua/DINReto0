/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.model.ModelFactory;
import helloworldmvc.view.View;
import helloworldmvc.view.ViewFactory;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Saludo en vista de Texto, se crea un objeto implementacion (vistaF) desde la factoria para la vista y lo mismo para el modelo
        View vista;
        ViewFactory vistaF = new ViewFactory();
        vista = vistaF.getView();
        
        Model modelo;
        ModelFactory modeloF = new ModelFactory();
        modelo = modeloF.getModel();
        
        //el controlador se encarga de conectar el modelo con la vista para pasarle el saludo y arrancar el programa (run())
        Controller control = new Controller(vista, modelo);
        control.run();
        

    }

}
