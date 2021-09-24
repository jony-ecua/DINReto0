package helloworldmvc.viewswing;

import helloworldmvc.view.View;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class SwingViewImplementation extends JFrame implements View {

    /**
     * Recoge el saludo desde la clase Controller y lo muestra en una ventana
     * swing
     *
     * @param saludo recoge el saludo desde la clase Controller
     */
    @Override
    public void showGreeting(String saludo) {
        JOptionPane.showMessageDialog(this, saludo);
    }

}
