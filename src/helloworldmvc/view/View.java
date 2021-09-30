package helloworldmvc.view;

/**
 * Interfaz de la vista
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public interface View {
/**
 * Metodo que se encarga de mostar el saludo
 * 
 * @param saludo parametro que contiene un string
 */
    public void showGreeting(String saludo);
}