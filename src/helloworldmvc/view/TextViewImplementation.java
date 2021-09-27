package helloworldmvc.view;

/**
 *
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class TextViewImplementation implements View {

    /**
     * 
     * @param saludo recibe el string que contiene un saludo
     */
    @Override
    public void showGreeting(String saludo) {
        System.out.println(saludo);
    }
}