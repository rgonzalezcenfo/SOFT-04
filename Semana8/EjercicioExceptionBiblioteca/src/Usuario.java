import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nombre;
    private ArrayList<Material> prestamos;

    //constructor

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        prestamos = new ArrayList<>();
    }


    //getter y setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Material> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Material> prestamos) {
        this.prestamos = prestamos;
    }

    //metodos

    public void prestarMaterial(Material material) throws MaterialNoDisponibleException, MaximoPrestamosException {
        if(cantidadPrestamos() >= 3) {
            throw new MaximoPrestamosException("No es permitido tener más de 3 prestamos");
        } else {
            material.prestar();
            prestamos.add(material);
        }
    };

    public void devolverMaterial(Material material){
        material.devolver();
    }

    public int cantidadPrestamos(){
        return prestamos.toArray().length;
    }

}
