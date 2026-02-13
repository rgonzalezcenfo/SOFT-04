import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private String nacionalidad;
    private String fechaEmision;
    private String fechaVencimiento;
    private boolean estaVigente;

    //constructor
    public Pasaporte(String nacionalidad, String fechaEmision) {
        int annioVencimiento = Integer.parseInt(fechaEmision.substring(fechaEmision.length() - 4)) + 10;

        this.numero = String.valueOf((int) (Math.random() * ((999999999 - 111111111) + 1))+ 111111111);
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaEmision.substring(0, fechaEmision.length() - 4) + String.valueOf(annioVencimiento);
        this.estaVigente = true;

//        System.out.println(numero +" "+ nacionalidad +" "+ fechaEmision +" "+  fechaVencimiento +" "+ estaVigente);
    }

    //getter

    public boolean estaVigente() {
        return estaVigente;
    }

    //setter

    public void setEstaVigente(boolean estaVigente) {
        this.estaVigente = estaVigente;
    }
}
