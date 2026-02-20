import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;
    private Mascota mascota;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //metodos pasaporte
    public void sacarPasaporte(String nacionalidad, String fechaEmision){
        pasaporte = new Pasaporte(nacionalidad, fechaEmision);
    }

    public void tomarVuelo(String destino){
        if (pasaporte != null) {
            if (this.pasaporte.estaVigente()){
                System.out.println(nombre + " " + apellidos + " toma un vuelo a " + destino);
            } else {
                System.out.println(nombre + " " + apellidos + " no puede tomar el vuelo, ya que su pasaporte no está vigente");
            }
        } else {
            System.out.println(nombre + " " + apellidos + " no puede tomar el vuelo, ya que no tiene pasaporte");
        }
    }

    public void vencePasaporte(){
            this.pasaporte.setEstaVigente(false);
    }

    //metodos mascota

    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void jugar(){
        if (mascota != null) {
            System.out.println(this.nombre + " " + this.apellidos + " juega con " + mascota.getNombre() + " su " + mascota.getEspecie());
        } else {
            System.out.println(this.nombre + " " + this.apellidos + " no tiene con quien jugar");
        }
    }

    //mwtodos maquina de soldar
    public void soldar(MaquinaSoldar maquinaSoldar, String material){
        maquinaSoldar.soldar(material);
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //equals
    public boolean equals(Persona persona) {
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos) && Objects.equals(pasaporte, persona.pasaporte);
    }

    //toString

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
