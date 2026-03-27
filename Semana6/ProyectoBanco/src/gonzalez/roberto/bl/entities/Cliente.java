package gonzalez.roberto.bl.entities;

import java.time.LocalDate;
import java.util.Objects;
import java.util.ArrayList;

public class Cliente {
    private String nombre_completo;
    private String cedula;
    private LocalDate fechaNacimiento;
    private String ocupacion;
    private String residencia;
    private String contrasenia;
    private ArrayList<Cuenta> cuentas;


    //constructor


    public Cliente(String nombre_completo, String cedula, LocalDate fechaNacimiento, String ocupacion, String residencia, String contrasenia) {
        this.nombre_completo = nombre_completo;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.ocupacion = ocupacion;
        this.residencia = residencia;
        this.contrasenia = contrasenia;
    }



    //Getters
    public String getNombre_completo() {
        return nombre_completo;
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

    public String getContrasenia() {
        return contrasenia;
    }

    //Setters


    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
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

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //equals
    public boolean equals(Cliente cliente) {
        return Objects.equals(cedula, cliente.cedula);
    }

    //toString
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre_completo + '\'' +
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
