package gonzalez.roberto.tl;

import gonzalez.roberto.bl.logic.GestorCliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;

public class Controlador {

    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void registrarCliente() throws IOException, SQLException, ClassNotFoundException {
        System.out.println("\n --- Resgistro de cliente ---");
        System.out.println("\n Ingrese su nombre completo");
        String nombre_completo = entrada.readLine();
        System.out.println("\n Ingrese su fechaNacimiento");
        java.time.LocalDate fechaNacimiento = LocalDate.parse(entrada.readLine());
        System.out.println("\n Ingrese su cedula");
        String cedula = entrada.readLine();
        System.out.println("\n Ingrese su ocupación");
        String ocupacion = entrada.readLine();
        System.out.println("\n Ingrese su residencia");
        String residencia = entrada.readLine();
        System.out.println("\n Ingrese su contraseña");
        String contrasenia = entrada.readLine();
        System.out.println(GestorCliente.registrarCliente(nombre_completo, cedula, fechaNacimiento, ocupacion, residencia, contrasenia));
    }
}
