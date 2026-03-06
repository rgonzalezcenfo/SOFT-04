public class Main {

    public static void main(String[] args) throws Exception{
        double num1 = 10;
        double num2 = 0;
        double num3 = -9;

        try{
            System.out.println(dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Resultado insatisfactorio.");
        }

//        System.out.println(dividir(num1, num2));
        System.out.println(raizCuadrada(num3));
    }

    public static double dividir ( double dividendo, double divisor) throws Exception {
        if (divisor == 0) throw new ArithmeticException("No sep uede dividir entre 0 >:(");
        return dividendo / divisor;
    }

    public static double raizCuadrada (double num) throws Exception{
        if (num < 0)
            throw new ArithmeticException("Las raices cuadradas de los numeros negativos no están definidas");
        return Math.sqrt(num);
    }
}
