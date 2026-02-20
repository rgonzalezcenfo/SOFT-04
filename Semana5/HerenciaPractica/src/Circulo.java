import java.util.Objects;

public class Circulo  extends Figura{
    private double radio;

    //constructor

    public Circulo(double radio) {
        this.radio = radio;
    }

    //getter

    public double getRadio() {
        return radio;
    }

    //setter


    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos

    public double calcularArea(){
        super.calcularArea();
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(){
        super.calcularPerimetro();
        return Math.PI * radio * 2;
    }

    //equals

    public boolean equals(Circulo circulo) {
        return this.radio == circulo.radio;
    }

    //toString

    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
