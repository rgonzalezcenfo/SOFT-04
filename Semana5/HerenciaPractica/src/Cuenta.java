import java.util.Objects;

public class Cuenta {
    protected String numero;
    protected double saldo;
    protected String titular;

    public Cuenta(String numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    //metodos
    public void retirar(double cantidad){
        if ( 0 > saldo - cantidad){
            System.out.print("No hay saldo suficientes");
        } else {
            saldo = saldo - cantidad;
        }
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    //getters

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    //setter

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


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
