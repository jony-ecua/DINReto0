package helloworldmvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author Derlis Daniel Brizuela Gimenez y Jonathan
 */
public class BDModelImplementation implements Model {

    //atributos para conectar a base de datos desde archivo configuracion
    private Connection con;
    private PreparedStatement stmt;
    private ResourceBundle configFile;
    private String driverDB;
    private String urlBD;
    private String userDB;
    private String passDB;

    //Sentencia sql a ejecutar para buscar el saludo
    private final String SELECTgreeting = "SELECT * FROM saludo";

    //Conexion a BD
    public BDModelImplementation() {
        this.configFile = ResourceBundle.getBundle("file.config");
        this.driverDB = configFile.getString("driver");
        this.urlBD = configFile.getString("con");
        this.userDB = configFile.getString("DBUSER");
        this.passDB = configFile.getString("DBPASS");
    }

    private void openConnection() {
        try {
            con = DriverManager.getConnection(this.urlBD, this.userDB, this.passDB);
        } catch (SQLException e) {
            System.out.println("Error al intentar abrir la base de datos");
        }
    }

    /**
     *
     * @throws SQLException suelta una exception si ocurre un error al cerrar la
     * BD
     */
    private void closeConnection() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (con != null) {
            con.close();
        }

    }

    /**
     * metodo que busca el saludo y lo guarda en un resultset para poder
     * mostrarlo
     *
     * @return devuelve un string (greeting) guardado en la variable saludo
     */
    @Override
    public String getGreeting() {
        String saludo = "";
        ResultSet rs = null;

        this.openConnection();

        try {
            stmt = con.prepareStatement(SELECTgreeting);

            rs = stmt.executeQuery();

            while (rs.next()) {
                saludo = rs.getString("greeting");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        try {
            this.closeConnection();
        } catch (SQLException ex) {

        }

        return saludo;
    }
}
