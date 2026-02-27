import java.time.LocalDate;
import java.util.Objects;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String cedula;
    private LocalDate fechaNacimiento;
    private String ocupacion;
    private String residencia;
    private ArrayList<Cuenta> cuentas;


    //constructor
    public Cliente(String nombre, String apellidos, String cedula, LocalDate fechaNacimiento, String ocupacion, String residencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.ocupacion = ocupacion;
        this.residencia = residencia;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getResidencia() {
        return residencia;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //LocalDate.of(yyyy, mm, dd)
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    //equals
    public boolean equals(Cliente cliente) {
        return Objects.equals(cedula, cliente.cedula);
    }

    //toString
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", ocupacion='" + ocupacion + '\'' +
                ", residencia='" + residencia + '\'' +
                '}';
    }

    //metodos
    public void abrirCuentaAhorros(double tasaInteres){
        CuentaAhorros nuevaCuenta = new CuentaAhorros(tasaInteres);
        cuentas.add(nuevaCuenta);
    }

    public void abrirCuentaAhorros(double tasaInteres, double saldoInicial){
        CuentaAhorros nuevaCuenta = new CuentaAhorros(tasaInteres, saldoInicial);
        cuentas.add(nuevaCuenta);
    }

    public void abrirCuentaCredito(double tasaInteres, double limite){
        CuentaCredito nuevaCuenta = new CuentaCredito(tasaInteres, limite);

    }

    public void abrirCuentaDebito(double tasaInteres){
        CuentaDebito nuevaCuenta = new CuentaDebito(tasaInteres);
        cuentas.add(nuevaCuenta);
    }

    public void abrirCuentaDebito(double tasaInteres, double saldoInicial){
        CuentaDebito nuevaCuenta = new CuentaDebito(tasaInteres, saldoInicial);
        cuentas.add(nuevaCuenta);
    }
}
