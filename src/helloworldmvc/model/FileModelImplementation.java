package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class FileModelImplementation implements Model {

    private ResourceBundle greetingFile;
    private String saludo;

    /**
     * Retorna un saludo desde un archivo de propiedades
     *
     * @return devuelve el saludo extraido del archivo de configuracion
     */
    @Override
    public String getGreeting() {
        //Leer archivo de propiedades "greeting" y guardar el String en la variable "saludo"
        this.greetingFile = ResourceBundle.getBundle("file.greeting");
        this.saludo = greetingFile.getString("greeting");
        return saludo;
    }

}
