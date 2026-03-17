public class Main {
    public static void main(String[] args) throws Exception{

        //crear objetos
        Biblioteca biblioteca = new Biblioteca();
        RegistrodeErrores registro = new RegistrodeErrores();
        Libro lotr = new Libro("JRR", "9780547928210", "1", "The Fellowship of the Ring");
        Revista people = new Revista("2", "People", 134);
        Usuario usuario1 = new Usuario(1, "Roberto Gonzalez");
        Usuario usuario2 = new Usuario(2, "Marta Chubata");


        //registro
            biblioteca.registarMaterial(lotr);
            biblioteca.registarMaterial(people);
            biblioteca.registrarUsuario(usuario1);
            biblioteca.registrarUsuario(usuario2);


        //prestamos

        try {
            biblioteca.prestarMaterial(1, "1");
        } catch (BibliotecaException e){
            System.out.println(e.getMessage());
            registro.registarError(e);
        } finally {
            System.out.println("Operacion 1 finalizada.\n");
        }

        try {
            biblioteca.prestarMaterial(2, "1");
        } catch (BibliotecaException e){
            System.out.println(e.getMessage());
            registro.registarError(e);
        } finally {
            System.out.println("Operacion 2 finalizada.\n");
        }

        try {
            biblioteca.prestarMaterial(3, "1");
        } catch (BibliotecaException e){
            System.out.println(e.getMessage());
            registro.registarError(e);
        } finally {
            System.out.println("Operacion 3 finalizada.\n");
        }

        try {
            biblioteca.devolverMaterial(1, "1");
        } catch (BibliotecaException e){
            System.out.println(e.getMessage());
            registro.registarError(e);
        } finally {
            System.out.println("Operacion 4 finalizada.\n");
        }

        try {
            biblioteca.prestarMaterial(2, "1");
        } catch (BibliotecaException e){
            System.out.println(e.getMessage());
            registro.registarError(e);
        } finally {
            System.out.println("Operacion 5 finalizada.\n");
        }
    }
}
