public class Parlante {
    private String nombre;

    public Parlante(String nombre) {
        this.nombre = nombre;
    }

    //relacion de dependencia
    public void repruducir(Cancion cancion){
        System.out.println(this.nombre + " esta reproduciendo: " + cancion.getNombre() + " de " + cancion.getArtista());
    }
}
