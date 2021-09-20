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
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class Controller{
    
    //Se instancian las interfaces para poder usar sus respectivos metodos
    private Model modeloC;
    private View vistaC;

    //el contructor recoge tanto la vista como el modelo desde el main
    public Controller(View vista, Model modelo) {
        this.modeloC = modelo;
        this.vistaC = vista;
        
    }
    
    //Arranca el programa para mostrar el saludo
    public void run(){
        String saludo = modeloC.getGreeting();
        vistaC.showGreeting(saludo);
    }
}
