/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.view;

import helloworldmvc.model.Model;

/**
 *
 * @author 2dam
 */
public class TextViewImplementation implements View{

    @Override
    public void showGreeting(String saludo) {
        System.out.println(saludo);
    }
}
