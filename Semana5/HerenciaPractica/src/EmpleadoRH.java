public class EmpleadoRH extends Empleado{

    public EmpleadoRH(String nombre, String apellidos, String puesto, double HORAS_TRABAJADAS_DIA, double PAGO_HORA) {
        super(nombre, apellidos, puesto, HORAS_TRABAJADAS_DIA, PAGO_HORA);
    }

    public void contratarEmpleado(String nombre, String apellidos, String puesto, double horas_diarias, double pago_hora){
        Empleado emplado = new Empleado(nombre, apellidos, puesto, horas_diarias, pago_hora);
    }
}
