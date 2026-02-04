import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int cedula;
    private char sexo;
    private String ubicacion;

    //constructores
    public Cliente(String nombre, String apellidos, int cedula, char sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    public Cliente(String nombre, String apellidos, int cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    public Cliente() {
    }

    //getters
    public String getNombre(){
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

//    equals
    public boolean equals(Cliente clienteComparar){
        return apellidos.equals(clienteComparar.apellidos) && cedula == clienteComparar.cedula;
    }


    //metodos
    public void suscribirse(Suscripcion suscripcion){
        System.out.println(this.nombre + " " + this.apellidos + " adquirió una suscripción " + suscripcion.getTipo());
    }
}
