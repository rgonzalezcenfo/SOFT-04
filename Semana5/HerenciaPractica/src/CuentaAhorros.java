public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(String numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }

    public void retirar(double cantidad) {
        if (saldo > 100 && saldo - cantidad >= 100) {
            super.retirar(cantidad);
        } else {
            System.out.println("No existen fondos suficientes para poder realizar este retiro");
        }
    }
}
