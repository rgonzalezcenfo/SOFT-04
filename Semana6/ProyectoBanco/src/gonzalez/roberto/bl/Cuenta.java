package gonzalez.roberto.bl;

import java.util.Objects;

public abstract class Cuenta {
    protected double saldo;
    protected double tasaInteres;

    //getters

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return tasaInteres;
    }

    //setter
    public void setInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    //toString
    public abstract String toString();

    //métodos
    public abstract void retirar(double montoRetiro);

    public abstract void generarIntereses();

}
