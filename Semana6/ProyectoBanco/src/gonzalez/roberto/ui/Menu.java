package gonzalez.roberto.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import static gonzalez.roberto.tl.Controlador.registrarCliente;

public class Menu {
    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void menuPrincipal() throws IOException, SQLException, ClassNotFoundException {
        byte opcion;
        while (true) {
            System.out.println("\n--- Menú principal ---");
            System.out.println("1) Registrarse como cliente");
            System.out.println("2) Ingresar como cliente");
            System.out.println("0) Salir");
            System.out.print("Ingrese su elección: ");
            opcion = Byte.parseByte(entrada.readLine());
            if (opcion == 0) {
                System.out.println("Gracias por utilizar nuestro programa :)");
                break;
            } else if (opcion == 1) registrarCliente();
//            else if (opcion == 2) ingresarCliente();
            else System.out.println("Opción inválida.");
        }
    }
}
