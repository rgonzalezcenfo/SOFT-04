public class Rectangulo extends Figura{
    private double ladoA;
    private  double ladoB;

    //constructor
    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    //getter

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    //setter


    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    //metodos

    public double calcularArea(){
        super.calcularArea();
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        super.calcularPerimetro();
        return 2*(ladoA + ladoB);
    }

    //equals
    public boolean equals(Rectangulo rectangulo) {
        return this.ladoA == rectangulo.ladoA && this.ladoB == rectangulo.ladoB;
    }

    //toString
    public String toString() {
        return "Rectangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                '}';
    }
}
