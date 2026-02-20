public class Enemigo {
    protected String nombre;
    protected int puntosVida;
    protected int puntosExp;

    public Enemigo(String nombre, int puntosVida, int puntosExp) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosExp = puntosExp;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getPuntosExp() {
        return puntosExp;
    }

    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setPuntosExp(int puntosExp) {
        this.puntosExp = puntosExp;
    }

    //equals

    public boolean equals(Enemigo enemigo){
        return nombre.equals(enemigo.nombre);
    }

    //toString

    public String toString() {
        return "Enemigo{" +
                "nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida +
                ", puntosExp=" + puntosExp +
                '}';
    }
}
