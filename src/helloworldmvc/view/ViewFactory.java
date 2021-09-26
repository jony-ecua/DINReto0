package helloworldmvc.view;

import helloworldmvc.viewjavafx.JavaFxViewImplementation;
import helloworldmvc.viewswing.SwingViewImplementation;
import java.util.ResourceBundle;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class ViewFactory {

    /**
     * retorna la implementacion de la vista requerida
     *
     * @return vista devuelve la implementacion de la vista
     */
    public View getView() {
        View vista = null;
        //Lee el archivo ce configuracion y guarda el string el string en una variable
        ResourceBundle configFile = ResourceBundle.getBundle("file.config");
        String viewType = configFile.getString("View_Type");

        if (viewType.equals("T")) {
            TextViewImplementation viewText = new TextViewImplementation();
            vista = viewText;
        } else if (viewType.equals("S")) {
            SwingViewImplementation viewSwing = new SwingViewImplementation();
            vista = viewSwing;
        } else if (viewType.equals("J")) {
            JavaFxViewImplementation viewJavaFx = new JavaFxViewImplementation();
            vista = viewJavaFx;
        } else {
            System.out.println("ERROR, tipo de Vista no válida");
        }

        return vista;
    }

}
