public interface Prestable {
    public void prestar() throws MaterialNoDisponibleException;

    public void devolver();

    public boolean estaPrestado();
}
