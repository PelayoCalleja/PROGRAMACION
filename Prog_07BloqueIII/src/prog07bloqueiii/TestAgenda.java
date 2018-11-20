package prog07bloqueiii;

import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        Agenda a = new Agenda();
        Contacto c1, c2, c3;
        c1 = new Contacto("Midi", "654789432");
        c2 = new Contacto("Diego", "619163488");
        c3 = new Contacto("Mario", "683630585");

        while (opcion != 5) {
            System.out.println(" MENÚ AGENDA");
            System.out.println("1-Añadir un contacto");
            System.out.println("2-Eliminar un contacto");
            System.out.println("3-Buscar un contacto");
            System.out.println("4-Mostrar todos los contactos");
            System.out.println("5-Salir");
            System.out.println("Introduce opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    a.añadirContacto(c1);

                    break;

                case 2:
                    a.borrarContacto(c1);

                    break;
                case 3:
                    a.buscarContacto();
                    break;

                case 4:
                    a.mostrarLista();
                    break;

                case 5:
                    System.out.println("Fin del Programa");
                    break;

            }

        }
    }
}
