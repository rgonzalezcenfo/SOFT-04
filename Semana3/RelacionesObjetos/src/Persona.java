public class Persona {

    public void procesarAlimentos (String alimento, String estado, ProcesadorAlimentos procesador) {
        procesador.procesar(alimento, estado);
    }

    //Establedcer otra relacion de dependencia en Persona, que la haga utilizar una Calculadora para el calculo de algunas formulas.
    //Todas las formulas se invocaran mediante la rutina calcularArea(),
    // la cual debe estar sobrecargada para recibir unol, dos o tres argumentos
    // 1 -> radio
    // 2 -> diagonal mayor, diagonal menor
    // 3 -> Lados de un triangulo

    public void calcularArea (Calculadora calculadora, double radio){
        System.out.println("El área del círculo es " + calculadora.calcularArea(radio));
    }

    public void calcularArea (Calculadora calculadora, double diagonalMenor, double diagonalMayor){
        System.out.println("El área del rombo es " +  calculadora.calcularArea(diagonalMenor, diagonalMayor));
    }

    public void calcularArea (Calculadora calculadora, double a, double b, double c){
        System.out.println("El área del triángulo es " + calculadora.calcularArea(a, b, c));
    }
}
