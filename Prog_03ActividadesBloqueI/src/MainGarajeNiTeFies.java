
/**
 *
 * @author J
 */
public class MainGarajeNiTeFies {

    public static void main(String[] args) {
        //creo los coches
        Coche c1, c2;
        String texto;

        c1 = new Coche("Fiat", "panda");
        c2 = new Coche("Opel", "corsa");

        //creo el garaje
        //se inicializa el garaje sin coches y sin averia
        Garaje g = new Garaje();

        System.out.println("Numero de coches atendidos en el garaje " + g.getNumCochesAtendidos());

        //intenta entrar el primer coche
        if (g.aceptarCoche(c1, "pinchazo") == false) {
            System.out.println("1-ya estan atendiendo a otro coche");
        } else {
            System.out.println("entra en el garaje el coche " + g.getCoche().toString());
        }

        //intentamos que entre el coche 2
        if (g.aceptarCoche(c2, "transmision") == false) {
            System.out.println("2-ya estan atendiendo a otro coche");
        } else {
            System.out.println("entra en el garaje el coche " + g.getCoche().toString());
        }

        //miramos que coche esta en el taller y el importe de su averia
        System.out.println("coche en el taller:" + g.getCoche().toString());
        //coche del taller arreglado y sale del taller
        g.devolverCoche();
        texto = (g.getCoche() == null) ? "vacio" : "ocupado";
        System.out.println("coche en el taller:" + texto);

        //intentamos que entre el coche 2
        if (g.aceptarCoche(c2, "Aceite") == false) {
            System.out.println("3- ya estan atendiendo a otro coche");
        } else {
            System.out.println("entra en el garaje el coche " + g.getCoche().toString());
        }

        if (g.aceptarCoche(c1, "Aceite") == false) {
            System.out.println("4- ya estan atendiendo a otro coche");
        } else {
            System.out.println("entra en el garaje el coche " + g.getCoche().toString());
        }
        //sale el coche del taller
        g.devolverCoche();
        texto = (g.getCoche() == null) ? "vacio" : "ocupado";
        System.out.println("coche en el taller:" + texto);

        //intenta entrar un nuevo coche
        if (g.aceptarCoche(c1, "Junta Culata") == false) {
            System.out.println("5- ya estan atendiendo a otro coche");
        } else {
            System.out.println("entra en el garaje el coche " + g.getCoche().toString());
        }

        if (g.aceptarCoche(c2, "Pinchazo") == false) {
            System.out.println("6- ya estan atendiendo a otro coche");
        } else {
            System.out.println("entra en el garaje el coche " + g.getCoche().toString());
        }

        if (g.aceptarCoche(c1, "Aceite") == false) {
            System.out.println("7- ya estan atendiendo a otro coche");
        } else {
            System.out.println("entra en el garaje el coche " + g.getCoche().toString());
        }

        //sale el coche del taller
        g.devolverCoche();
        texto = (g.getCoche() == null) ? "vacio" : "ocupado";
        System.out.println("coche en el taller:" + texto);
        System.out.println("Numero de coches atendidos " + g.getNumCochesAtendidos());

        System.out.println("C1: " + c1.toString());
        System.out.println("C2: " + c1.toString());
    }
}
