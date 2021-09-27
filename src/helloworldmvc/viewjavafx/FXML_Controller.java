package helloworldmvc.viewjavafx;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Daniel Brizuela y Jonathan Viñán
 */
public class FXML_Controller {

    @FXML
    private Pane pane;
    @FXML
    private Label label;
    private String greeting;
    private Stage stage;

    /**
     *
     * @param pane establece el panel en la ventana
     */
    public void setPane(Pane pane) {
        this.pane = pane;
    }

    /**
     *
     * @param label
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     *
     * @param greeting
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     *
     * @param stage
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     *
     * @param event
     */
    @FXML
    public void onShowWindow(WindowEvent event) {

        label.setText(greeting);
    }

    public void iniciarStage() {
        stage.setOnShown(this::onShowWindow);
    }

}
