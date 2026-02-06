import javax.security.auth.Subject;

public class Main {

    public static void main (String[] args){
        //clientes
        Cliente cliente1 = new Cliente("Roberto", "Gonzalez Castillo", "117260520", 'm', "Heredia");
        Cliente cliente2 = new Cliente("Marta", "Chubata", "123456789", "Gdansk");
        Cliente cliente3 = new Cliente();

        //suscripciones
        Suscripcion suscripcion1 = new Suscripcion(TipoSuscripcion.BASICA, 9.99, 1);
        Suscripcion suscripcion2 = new Suscripcion(TipoSuscripcion.GOLD, 34.99, 3);
        Suscripcion suscripcion3 = new Suscripcion(TipoSuscripcion.PLATINUM, 199.99, 12);

        //prueba de funcionalidad
        cliente1.suscribirse(new Suscripcion(TipoSuscripcion.PLATINUM, 199.99, 12));
        cliente2.suscribirse(suscripcion2);

        //pruebas set
        System.out.println(cliente3.getNombre());
        cliente3.setNombre("Alexander");
        System.out.println(cliente3.getNombre());

        //pruebas equals
        Cliente cliente4 = new Cliente("Roberto", "Gonzalez Castillo", "117260520", 'm', "Heredia");


        System.out.println(cliente4.equals(cliente1));

        System.out.println(cliente1);
        System.out.println(suscripcion1);
    }
}
