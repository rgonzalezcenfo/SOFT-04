import java.util.Objects;

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

    public int getEdad() {
        return edad;
    }


    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //equals

    public boolean equals(Mascota mascota) {
        return edad == mascota.edad && Objects.equals(nombre, mascota.nombre) && Objects.equals(especie, mascota.especie);
    }

    //toString

    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                '}';
    }
}
