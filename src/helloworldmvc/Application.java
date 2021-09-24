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

        //La factoria devuelve una implementacion de la vista a la interfaz vista al igual que el modelo
        View vista;
        ViewFactory vistaF = new ViewFactory();
        vista = vistaF.getView();

        Model modelo;
        ModelFactory modeloF = new ModelFactory();
        modelo = modeloF.getModel();

        //el controlador se encarga de conectar el modelo con la vista para para pasar el saludo y mostrarlo al arrancar el programa (run)
        Controller control = new Controller(vista, modelo);
        control.run();

    }

}
