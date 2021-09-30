package helloworldmvc.model;

/**
 * Interfaz del modelo
 * 
 * @author Daniel Brizuela y Jonathan Viñan
 */
public interface Model {
/**
 * Metodo que se encarga de recibir el string
 * 
 * @return devuelve un string leido de un archivo de propiedades o de la base de datos
 */
    public String getGreeting();
}