import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Parlante parlante1  = new Parlante("Parlante Principal");
        Cancion cancion1 = new Cancion("I Can Only Count to FOUR", "Psychostick", 228);

        parlante1.repruducir(cancion1);

        Persona persona1 = new Persona();
        ProcesadorAlimentos procesador = new ProcesadorAlimentos();
        Calculadora calculadora = new Calculadora();

//        System.out.print("Ingrese el alimento: ");
//        String alimento = entrada.readLine();
//
//        System.out.print("Ingrese el estado del alimento (Congelado/Entero/Procesado): ");
//        String estado = entrada.readLine();
//
//        persona1.procesarAlimentos(alimento, estado, procesador); // Consecuencia de la dependencia


        System.out.println("De que forma desea calcular el area? (1) Circulo, (2)Rombo, (3)Triangulo");
        int opcion = Integer.parseInt(entrada.readLine());
        double dato1 = 0;
        double dato2 = 0;
        double dato3 = 0;

        for (int i = opcion; i != 0; i--){
            switch(i){
                case 1:
                    System.out.println("Digite el numero: ");
                    dato1 = Double.parseDouble(entrada.readLine());
                    break;

                case 2:
                    System.out.println("Digite el numero: ");
                    dato2 = Double.parseDouble(entrada.readLine());
                    break;

                case 3:
                    System.out.println("Digite el numero: ");
                    dato3 = Double.parseDouble(entrada.readLine());
                    break;

                default:
                    System.out.println("Opcion es invalida");
                    break;
            }
        }

        switch(opcion){
            case 1:
                persona1.calcularArea(calculadora, dato1);
                break;

            case 2:
                persona1.calcularArea(calculadora, dato1, dato2);
                break;

            case 3:
                persona1.calcularArea(calculadora, dato1, dato2, dato3);
                break;
        }
    }
}
