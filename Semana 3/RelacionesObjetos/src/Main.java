public class Main {
    public static void main(String[] args){

        Parlante parlante1  = new Parlante("Parlante Principal");
        Cancion cancion1 = new Cancion("I Can Only Count to FOUR", "Psychostick", 228);

        parlante1.repruducir(cancion1);
    }
}
