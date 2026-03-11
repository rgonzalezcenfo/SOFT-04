import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
//        double num1 = 10;
//        double num2 = 0;
//        double num3 = -9;
//
//        try{
//            System.out.println(dividir(num1, num2));
//        } catch (ArithmeticException e) {
//            System.out.println("Resultado insatisfactorio.");
//        }
//
//        System.out.println(dividir(num1, num2));
//        System.out.println(raizCuadrada(num3));

        menuHipotenusa();
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

    public static double hipotenusa (double cateto1, double cateto2) {
        if (cateto1 <= 0 || cateto2 <= 0) throw new ArithmeticException("No pueden haber catetos negativos.");
        return Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    }

    public static void menuHipotenusa() throws IOException {
        while(true) {
            System.out.println("\n-Menú de Cálculo de hipotenusa-");
            System.out.println("1.Calcular hipotenusa");
            System.out.println("0. Salir");
            System.out.println("Ingrese su elección: ");
            int opcion = Integer.parseInt(entrada.readLine());
            if (opcion ==0) break;
            if (opcion ==1) {

                try {
                    System.out.println("Ingrese el primer cateto");
                    double cateto1 = Double.parseDouble(entrada.readLine());
                    System.out.println("Ingrese el segundo cateto");
                    double cateto2 = Double.parseDouble(entrada.readLine());
                    System.out.println(hipotenusa(cateto1, cateto2));


                } catch (NumberFormatException e) {
                    System.out.println("El dato ingresado no tiene el formato de número");
                } catch (ArithmeticException e) {
                    System.out.println("Los datos ingresados no son adecuados");
                }
            } else {
                System.out.println("Su elección no es valido");
            }
        }
    }
}
