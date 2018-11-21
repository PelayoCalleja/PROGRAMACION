package Controlador;

import java.util.ArrayList;
import java.util.StringTokenizer;
import logica.Apuesta;


public class TokenizarApuesta {

    private String linea; // nt

    public TokenizarApuesta(String linea) { // nt
        this.linea = linea; // nt
    }
    // Devuelvo siempre un objeto del tipo que represente cada fila
    // La clase de este objeto la tengo que tener en el modelo
    public Apuesta tokenizar() {
        Apuesta apuesta; // variable donde voy a almacenar el objeto que voy a devolver
        // Si el separador del fichero no es una coma, lo cambio aquí
        StringTokenizer tokens = new StringTokenizer(linea, ",");// nt a no ser que el separador del fichero no sea una ,

        // Crear una variable por cada uno de los atributos del objeto del modelo
        String nombre = tokens.nextToken();
        String apellido = tokens.nextToken();
        
        
        ArrayList<Integer> numeros = new ArrayList<>();
        try {
            while (true) {
                int numero = Integer.parseInt(tokens.nextToken());
                numeros.add(numero);
            }
        } catch (Exception e) {
           // System.out.println("Ya está leído todo el objeto");
        }

        
        // Creo el objeto y lo guardo en la variable que voy a devolver
        apuesta = new Apuesta(nombre, apellido,numeros);
        

        return apuesta; // devuelvo la variable que creo en la línea 19
    }

}
