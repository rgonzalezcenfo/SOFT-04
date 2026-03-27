package gonzalez.roberto.bl.dao;

import gonzalez.roberto.bl.entities.Cliente;
import gonzalez.roberto.dl.Conector;

import java.io.IOException;
import java.sql.SQLException;

public class DAOCliente {
    private static String statement;
    private static String query;

    public static String insertarCliente(Cliente cliente) throws SQLException, IOException, ClassNotFoundException {
        statement = "INSERT INTO t_cliente VALUES ('" + cliente.getNombre_completo() + "', '"+ cliente.getCedula() + "', '" + cliente.getFechaNacimiento() +"', '" + cliente.getOcupacion() + "', '" + cliente.getResidencia() + "', '" + cliente.getContrasenia() + "');";
        Conector.getConexion().ejecutarStatement(statement);
        return "El cliente se registro con éxito";
    }
}
