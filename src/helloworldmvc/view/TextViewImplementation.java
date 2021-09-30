package helloworldmvc.view;

/**
 * Clase que se encarga de la visualizacion por consola
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class TextViewImplementation implements View {

    /**
     * Metodo que recibe el saludo y lo muestra por consola
     * 
     * @param saludo recibe el string que contiene un saludo
     */
    @Override
    public void showGreeting(String saludo) {
        System.out.println(saludo);
    }
}