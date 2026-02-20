public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
        especie = "Gato";
    }

    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("Meow");
    }
}
