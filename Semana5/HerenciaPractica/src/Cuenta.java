import java.util.Objects;

public abstract class Cuenta {
    protected String numero;
    protected double saldo;
    protected String titular;

    public Cuenta(String numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    //metodos
    public abstract void retirar(double cantidad);


    //equals

    public boolean equals(Cuenta cuenta) {
        return Objects.equals(numero, cuenta.numero) && Objects.equals(titular, cuenta.titular);
    }

    //toString
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
