public class Suscripcion {

    private TipoSuscripcion tipo;
    private double costo;
    private int periodicidad;

    //constructor
    public Suscripcion(TipoSuscripcion tipo, double costo, int periodicidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidad = periodicidad;
    }

    //getters

    public TipoSuscripcion getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    //setters


    public void setTipo(TipoSuscripcion tipo) {
        this.tipo = tipo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    //equals()
    public boolean equals(Suscripcion suscripcionComparar){
        return tipo == suscripcionComparar.tipo && periodicidad == suscripcionComparar.periodicidad;
    }

    //toString()
    public String toString(){
        return "\nTipo: " + tipo +
                "\nPeriodicidad: " + periodicidad +
                "\nCosto: " + costo + "\n";
    }
}

