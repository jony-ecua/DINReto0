package helloworldmvc.model;

/**
 *
 * @author Daniel Brizuela y Jonathan Viñan
 */
public class ModelFactory {

    /**
     * retorna la implementacion del modelo correspondiente
     *
     * @return modelo devuelve la implementacion del modelo
     * @param modelType recoge un string "F" o "DB"
     */
    public Model getModel(String modelType) {
        Model modelo = null;

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
