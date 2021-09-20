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
 * @author 2dam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        View vista;
        ViewFactory vistaF = new ViewFactory();
        vista = vistaF.getView();
        
        Model modelo;
        ModelFactory modeloF = new ModelFactory();
        modelo = modeloF.getModel();
        
        Controller control = new Controller(vista, modelo);
        control.run();
        

    }

}
