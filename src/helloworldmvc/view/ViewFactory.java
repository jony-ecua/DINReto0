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
public class ViewFactory {
    
    public View getView(){
        TextViewImplementation viewText = new TextViewImplementation();
        return viewText;
    }
    
}
