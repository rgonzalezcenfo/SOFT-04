import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class RegistrodeErrores {
    private static final Logger logger = Logger.getLogger(RegistrodeErrores.class.getName());


    //constructor
    public RegistrodeErrores() throws IOException {
        FileHandler fh = new FileHandler("EjercicioExceptionBiblioteca/src/errores.log", true); // true for append
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
    }

    //registrar error
    public void registarError(Exception e){
        logger.log(Level.WARNING, "[ " + LocalDate.now().toString() +" "+"]", e);
    }
}
