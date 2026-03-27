package gonzalez.roberto.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBD {
    private Connection conexion;
    private Statement statement;

    public AccesoBD(String direccion, String usuario, String contrasenia) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(direccion, usuario, contrasenia);
    }

    public void ejecutarStatement(String statement) throws SQLException {
        this.statement = conexion.createStatement();
        this.statement.executeUpdate(statement);
    }
}
