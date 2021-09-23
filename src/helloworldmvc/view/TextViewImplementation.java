/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class TextViewImplementation implements View{

    @Override
    public void showGreeting(String saludo) {
        System.out.println(saludo);
    }
}
