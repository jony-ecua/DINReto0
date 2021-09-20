/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.controller;

import helloworldmvc.model.Model;
import helloworldmvc.view.View;

/**
 *
 * @author 2dam
 */
public class Controller{
    private Model modeloC;
    private View vistaC;

    public Controller(View vista, Model modelo) {
        this.modeloC = modelo;
        this.vistaC = vista;
        
    }
    public void run(View vista,Model modelo){
        String saludo = modelo.getGreeting();
        vista.showGreeting(saludo);
    }
}
