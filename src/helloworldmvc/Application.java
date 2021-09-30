package helloworldmvc;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.model.ModelFactory;
import helloworldmvc.view.View;
import helloworldmvc.view.ViewFactory;
import java.util.ResourceBundle;

/**
 * Clase que ejecutara el programa
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class Application {

    /**
     * Main de la aplicacion.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Lee el archivo de configuracion y guarda el string en una variable
         */
        ResourceBundle configFile = ResourceBundle.getBundle("file.config");
        String modelType = configFile.getString("Model_Type");
        String viewType = configFile.getString("View_Type");

        /**
         * La factoria devuelve una implementacion de la vista a la interfaz vista al igual que el modelo 
         */
        View vista;
        ViewFactory vistaF = new ViewFactory();
        vista = vistaF.getView(viewType);

        Model modelo;
        ModelFactory modeloF = new ModelFactory();
        modelo = modeloF.getModel(modelType);

        /**
         * el controlador se encarga de conectar el modelo con la vista para para pasar el saludo y mostrarlo al arrancar el programa (run)
         */
        Controller control = new Controller(vista, modelo);
        control.run();

    }

}
