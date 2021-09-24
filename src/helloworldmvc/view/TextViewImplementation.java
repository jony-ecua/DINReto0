package helloworldmvc.view;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class TextViewImplementation implements View {

    @Override
    public void showGreeting(String saludo) {
        System.out.println(saludo);
    }
}
