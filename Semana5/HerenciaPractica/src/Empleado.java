import java.util.Objects;

public class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String puesto;
    protected final double HORAS_TRABAJADAS_DIA;
    protected final double  PAGO_HORA;

    //contructor
    public Empleado(String nombre, String apellidos, String puesto, double HORAS_TRABAJADAS_DIA, double PAGO_HORA) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.HORAS_TRABAJADAS_DIA = HORAS_TRABAJADAS_DIA;
        this.PAGO_HORA = PAGO_HORA;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getHORAS_TRABAJADAS_DIA() {
        return HORAS_TRABAJADAS_DIA;
    }

    public double getPAGO_HORA() {
        return PAGO_HORA;
    }

    //setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    //metodos
    public void trabajar(){
        System.out.println("Trabajando");
    }

    public double calcularSalario() {
        return HORAS_TRABAJADAS_DIA * 5 * 4 * PAGO_HORA;
    }

    //equals

    public boolean equals(Empleado empleado) {
        return Objects.equals(nombre, empleado.nombre) && Objects.equals(apellidos, empleado.apellidos) && Objects.equals(puesto, empleado.puesto);
    }

    //toString

    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", puesto='" + puesto + '\'' +
                ", HORAS_TRABAJADAS_DIA=" + HORAS_TRABAJADAS_DIA +
                ", PAGO_HORA=" + PAGO_HORA +
                '}';
    }
}
