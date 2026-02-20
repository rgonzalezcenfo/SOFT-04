public class ProcesadorAlimentos {

    public void procesar(String alimento, String estado) {
        switch(estado) {
            case "Congelado":
                System.out.println(alimento + " no se puede procesar en ese estado.");
                break;
            case "Entero":
                System.out.println(alimento + " es procesado.");
                break;
            case "Procesado":
                System.out.println(alimento + " ya estaba procesado previamente.");
                break;
            case "Default":
                System.out.println("Datos erróneos.");
                break;
        }
    }
}
