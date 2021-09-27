package helloworldmvc.view;

import helloworldmvc.viewjavafx.JavaFxViewImplementation;
import helloworldmvc.viewswing.SwingViewImplementation;

/**
 *
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class ViewFactory {

    /**
     * retorna la implementacion de la vista requerida
     *
     * @return vista devuelve la implementacion de la vista
     * @param viewType recoge un string "T", "S" o "J"
     */
    public View getView(String viewType) {
        View vista = null;

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