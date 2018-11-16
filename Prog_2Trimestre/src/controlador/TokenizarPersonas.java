package controlador;

import java.util.ArrayList;
import java.util.StringTokenizer;
import modelo.Mail;
import modelo.Persona;

public class TokenizarPersonas {

    private String linea; // nt

    public TokenizarPersonas(String linea) { // nt
        this.linea = linea; // nt
    }

    // Devuelvo siempre un objeto del tipo que represente cada fila
    // La clase de este objeto la tengo que tener en el modelo
    public Persona tokenizar() {

        Persona p; // variable donde voy a almacenar el objeto que voy a devolver
        // Si el separador del fichero no es una coma, lo cambio aquí
        StringTokenizer tokens = new StringTokenizer(linea, ";");// nt a no ser que el separador del fichero no sea una ,

        // Crear una variable por cada uno de los atributos del objeto del modelo
        String nombre = tokens.nextToken();
        String apellido = tokens.nextToken();
        ArrayList<Mail> correos = new ArrayList<>();
        try {
            while (true) {
                String texto = tokens.nextToken();
                Mail m=new Mail(texto);
                correos.add(m);
            }
        } catch (Exception e) {
            System.out.println("Ya está leído todo el objeto");
        }

        
        // Creo el objeto y lo guardo en la variable que voy a devolver
        p = new Persona(nombre, apellido, correos);
        
        return p; // devuelvo la variable que creo en la línea 19
    }

}
