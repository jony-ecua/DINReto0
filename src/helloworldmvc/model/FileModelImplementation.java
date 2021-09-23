/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class FileModelImplementation implements Model{
    
    private ResourceBundle greetingFile;
    private String saludo;

    @Override
    public String getGreeting() {
        //Leer archivo de propiedades "greeting" y guardar el String en la variable "saludo"
        this.greetingFile = ResourceBundle.getBundle("file.greeting");
        this.saludo = greetingFile.getString("greeting");
        return saludo;   
    }
    
}
