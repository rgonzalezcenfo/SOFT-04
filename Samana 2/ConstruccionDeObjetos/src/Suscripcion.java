public class Suscripcion {

    private TipoSuscripcion tipo;
    private double costo;
    private Periodicidad periodicidad;

    //constructor
    public Suscripcion(TipoSuscripcion tipo, double costo, Periodicidad preiodicidad) {
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

    public Periodicidad getPreiodicidad() {
        return periodicidad;
    }

    //setters


    public void setTipo(TipoSuscripcion tipo) {
        this.tipo = tipo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setPreiodicidad(Periodicidad preiodicidad) {
        this.periodicidad = preiodicidad;
    }

    //equals
    public boolean equals(Suscripcion suscripcionComparar){
        return tipo == suscripcionComparar.tipo && periodicidad == suscripcionComparar.periodicidad;
    }
}

