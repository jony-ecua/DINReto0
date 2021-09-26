/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldmvc.viewjavafx;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Jonathan Viñán
 */
public class FXML_Controller {

    @FXML
    private Pane pane;
    @FXML
    private Label label;
    private String greeting;
    private Stage stage;

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void onShowWindow(WindowEvent event) {

        label.setText(greeting);
    }

    public void iniciarStage() {
        stage.setOnShown(this::onShowWindow);
    }

}
