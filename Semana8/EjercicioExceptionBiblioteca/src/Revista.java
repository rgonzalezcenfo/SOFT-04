public class Revista extends Material{
    private int numero;

    public Revista(String id, String titulo, int numero){
        super(id, titulo);
        this.numero = numero;
    }
}
