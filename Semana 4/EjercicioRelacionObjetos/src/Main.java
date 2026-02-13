public class Main {
    public static void main(String[] args) {

        //1.
        Persona persona1 = new Persona("Roberto", "González Castillo");
        Persona persona2 = new Persona("Marta", "Chubata");


        System.out.println("\nPruebas ejercicio 1:");
        System.out.println(" ");
        persona1.sacarPasaporte("Costarricense", "12/02/2026");
        persona1.tomarVuelo("Chepe");
        persona1.vencePasaporte();
        persona1.tomarVuelo("Chepe");
        persona2.tomarVuelo("CHepe");

        //2.
        System.out.println("\nPruebas ejercicio 2:");
        System.out.println(" ");
        Mascota perro1 = new Mascota("Firu", "perro", 4);
        persona2.adoptarMascota(perro1);
        persona2.jugar();
        persona1.jugar();

        //3.
        System.out.println("\nPruebas ejercicio 3:");
        System.out.println(" ");
        MaquinaSoldar soldadora1 = new MaquinaSoldar("Furius", "Force 253 CEL", "Media", new String[]{"Acero", "Acero Inoxidable", "Aluminio", "Cobre", "Niquel"});

        persona1.soldar(soldadora1, "Acero");
        persona1.soldar(soldadora1, "Titanio");
    }
}
