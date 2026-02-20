import java.util.Objects;

public class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido(){
        System.out.println("Sonido");
    }

    //equals
    public boolean equals(Animal animal){
        return this.nombre.equals(animal.nombre) && this.especie.equals(animal.especie);
    }

    //toString
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
