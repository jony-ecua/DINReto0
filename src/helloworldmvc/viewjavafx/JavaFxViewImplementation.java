package helloworldmvc.viewjavafx;

import helloworldmvc.view.View;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase que ejecutara la ventana de JavaFX
 *
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class JavaFxViewImplementation extends Application implements View {

    private String saludo;

    /**
     * Metodo que arranca la ventana
     * 
     * @param primaryStage Parametro para que la que la ventana se ejecute en
     * primer plano
     *
     * @throws FileNotFoundException Controla si existe el fichero de
     * propiedades
     * @throws IOException Controla la E/S
     */
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException {

        try {
            //carga el FXML y el Controller
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml"));
            Parent root = (Parent) loader.load();
            FXML_Controller viewController = ((FXML_Controller) loader.getController());
            viewController.setGreeting(saludo);
            viewController.setStage(primaryStage);
            viewController.iniciarStage();
            

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            System.out.println("Error JavaFX");;
        }
    }
    /**
     * 
     * @throws Exception suelta una excepcion si no recibe el saludo
     */
    @Override
    public void init() throws Exception {
        this.saludo = getParameters().getRaw().get(0);
    }

    @Override
    public void showGreeting(String greeting) {
        launch(greeting);

    }

}
