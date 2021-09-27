package helloworldmvc.viewswing;

import helloworldmvc.view.View;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class SwingViewImplementation extends JFrame implements View {

    /**
     * Recoge el saludo desde la clase Controller y lo muestra en una ventana
     * swing
     *
     * @param saludo recibe el saludo desde la clase Controller
     */
    @Override
    public void showGreeting(String saludo) {
        JOptionPane.showMessageDialog(null, saludo);
    }
    
}
