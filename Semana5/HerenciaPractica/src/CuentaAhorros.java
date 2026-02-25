public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(String numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    public void retirar(double cantidad) {
        if (saldo > 100 && saldo - cantidad >= 100) {
            saldo = saldo - cantidad;
        } else {
            System.out.println("No existen fondos suficientes para poder realizar este retiro");
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
}
