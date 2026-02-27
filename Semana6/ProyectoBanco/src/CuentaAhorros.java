public class CuentaAhorros extends Cuenta{

    private final String ID;
    private static int contador = 0;

    //constructoes

    public CuentaAhorros(double tasaInteres) {
        contador++;
        this.ID = "CA-" + contador;
        this.tasaInteres = tasaInteres;
        this.saldo = 100;
    }

    public CuentaAhorros(double tasaInteres, double saldoInicial) {
        contador++;
        this.ID = "CA-" + contador;
        this.tasaInteres = tasaInteres;
        this.saldo = saldoInicial;
    }

    //toString
    public String toString() {
        return "Cuenta de Ahorros: " + ID;
    }

    //getter

    public String getID() {
        return ID;
    }

    public static int getContador() {
        return contador;
    }

    //metodos

    public void retirar(double montoRetiro){
        if(this.saldo - montoRetiro < 100){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= montoRetiro;
        }
    }

    public void depositar(double montoDeposito){
        saldo += montoDeposito;
    }

    public void generarIntereses(){
        saldo += tasaInteres*saldo;
    }
}
