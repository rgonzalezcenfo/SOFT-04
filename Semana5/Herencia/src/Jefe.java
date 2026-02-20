public class Jefe extends Enemigo{
    private String ubicacion;
    private String[] recompensas;

    //constructor
    public Jefe(String nombre, int puntosVida, int puntosExp, String ubicacion, String[] recompensas){
        super(nombre, puntosVida, puntosExp);
        this.ubicacion = ubicacion;
        this.recompensas = recompensas;
    }
}
