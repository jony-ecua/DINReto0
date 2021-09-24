package helloworldmvc.model;

import java.util.ResourceBundle;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class ModelFactory {

    /**
     * retorna la implementacion del modelo correspondiente
     *
     * @return modelo devuelve la implementacion del modelo
     */
    public Model getModel() {
        Model modelo = null;
        //Lee el archivo ce configuracion y guarda el string el string en una variable
        ResourceBundle configFile = ResourceBundle.getBundle("file.config");
        String modelType = configFile.getString("Model_Type");

        if (modelType.equals("F")) {
            FileModelImplementation modeloFile = new FileModelImplementation();
            modelo = modeloFile;
        } else if (modelType.equals("DB")) {
            BDModelImplementation modeloDB = new BDModelImplementation();
            modelo = modeloDB;
        } else {
            System.out.println("ERROR, tipo de modelo no válido");
        }

        return modelo;
    }
}
