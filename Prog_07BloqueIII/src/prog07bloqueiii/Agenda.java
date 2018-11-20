package prog07bloqueiii;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Agenda {

    private Set<Contacto> contactos;

    public Agenda() {
        contactos = new TreeSet<Contacto>();

    }

    public int tamañoAgenda() {
        return this.contactos.size();//Size=tamaño
    }

    public boolean añadirContacto(Contacto c) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del contacto");
        c.setNombrePila(teclado.nextLine());
        System.out.println("Introduce el telefono del contacto");
        c.setTelefono(teclado.nextLine());
        return this.contactos.add(c);
    }

    public boolean borrarContacto(Contacto c) {
        return this.contactos.remove(c);
    }

    public void borrarContacto(String nomPila) {
        this.contactos.remove(this.contactos.contains(nomPila));
    }

    public void buscarContacto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del contacto que desees buscar");
        String nomPila = teclado.nextLine();
        Contacto aux = new Contacto(nomPila, null);
        if (this.contactos.add(aux) == true) {
            System.out.println("El contacto introducido no se encuentra en la agenda");
        } else {
            System.out.println("El contacto introducido se ha encontrado en la agenda");
        }

    }

    public void mostrarLista() {
        Iterator listaContactos = contactos.iterator();
        while (listaContactos.hasNext()) {
            System.out.println(listaContactos.next());
        }
    }

}
