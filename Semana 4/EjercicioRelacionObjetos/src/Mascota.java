public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    //constructor

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }
}
