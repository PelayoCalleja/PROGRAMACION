package controlador;

import java.util.ArrayList;
import java.util.StringTokenizer;
import modelo.Luchador;

public class TokenizarLuchador {

    private String linea; // nt

    public TokenizarLuchador(String linea) { // nt
        this.linea = linea; // nt
    }

    // Devuelvo siempre un objeto del tipo que represente cada fila
    // La clase de este objeto la tengo que tener en el modelo
    public Luchador tokenizar() {

        Luchador luchador; // variable donde voy a almacenar el objeto que voy a devolver
        // Si el separador del fichero no es una coma, lo cambio aquí
        StringTokenizer tokens = new StringTokenizer(linea, ",");// nt a no ser que el separador del fichero no sea una ,

        // Crear una variable por cada uno de los atributos del objeto del modelo
        String nombre = tokens.nextToken();
        String apellido = tokens.nextToken();
        int edad = Integer.parseInt(tokens.nextToken());
        
        ArrayList<String> cinturones = new ArrayList<>();
        try {
            while (true) {
                String color = tokens.nextToken();
                cinturones.add(color);
            }
        } catch (Exception e) {
            System.out.println("Ya está leído todo el objeto");
        }

        
        // Creo el objeto y lo guardo en la variable que voy a devolver
        luchador = new Luchador(nombre, apellido, edad);
        luchador.setColores(cinturones);

        return luchador; // devuelvo la variable que creo en la línea 19
    }

}
