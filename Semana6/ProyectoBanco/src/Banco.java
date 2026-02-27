import javax.swing.text.html.parser.DocumentParser;
import java.lang.annotation.Documented;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Banco {
    private String nombre;
    private final String ID;
    private ArrayList<Cliente> clientes;

    //constructor

    public Banco(String ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
        clientes = new ArrayList<>();
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //equals
    public boolean equals(Banco banco){
        return Objects.equals(this.ID, banco.ID);
    }

    //toString
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    //metodos
    public void registarCliente(String nombre, String apellidos, String cedula, LocalDate fechaNacimiento, String ocupacion, String residencia){
        Cliente nuevoCliente = new Cliente(nombre, apellidos, cedula, fechaNacimiento, ocupacion, residencia);
        clientes.add(nuevoCliente);
    }
}
