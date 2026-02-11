public class Calculadora {

    public double calcularArea (double radio){
        return Math.PI * radio;
    }

    public double calcularArea (double diagonalMenor, double diagonalMayor){
        return (diagonalMayor * diagonalMenor)/2;
    }

    public double calcularArea(double a, double b, double c) {
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
