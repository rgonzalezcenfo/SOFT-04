public class Libro extends Material{
    private String autor;
    private String isbd;

    public Libro(String autor, String isbd, String id, String titulo) {
        super(id, titulo);
        this.autor = autor;
        this.isbd = isbd;
        this.prestado = false;
    }

}
