public abstract class Material implements Prestable{
    protected String id;
    protected String titulo;
    protected boolean prestado;

    public Material(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() throws MaterialNoDisponibleException {
        if (prestado){
            throw new MaterialNoDisponibleException("El material ya está prestado");
        } else {
            setPrestado(true);
        }
    }

    public void devolver() {
        setPrestado(false);
    }
}
