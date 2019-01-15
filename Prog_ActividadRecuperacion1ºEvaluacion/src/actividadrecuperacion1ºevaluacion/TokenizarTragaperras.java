package actividadrecuperacion1ºevaluacion;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenizarTragaperras {

    private String linea; // nt

    public TokenizarTragaperras(String linea) { // nt
        this.linea = linea; // nt
    }

    // Devuelvo siempre un objeto del tipo que represente cada fila
    // La clase de este objeto la tengo que tener en el modelo
    public Tragaperras tokenizar() {

        Tragaperras t; // variable donde voy a almacenar el objeto que voy a devolver
        // Si el separador del fichero no es una coma, lo cambio aquí
        StringTokenizer tokens = new StringTokenizer(linea, ";");// nt a no ser que el separador del fichero no sea una ,

        // Crear una variable por cada uno de los atributos del objeto del modelo
        String nombre = tokens.nextToken();
        String apellido = tokens.nextToken();
        ArrayList<Tirada> tiradas = new ArrayList<>();
        try {
            while (true) {
                int s1 = Integer.parseInt(tokens.nextToken());
                int s2 = Integer.parseInt(tokens.nextToken());
                int s3 = Integer.parseInt(tokens.nextToken());
                String texto = tokens.nextToken();
                //tragaperras t = new (texto);
                //tiradas.add(t);
            }
        } catch (Exception e) {
            System.out.println("Ya está leído todo el objeto");
        }

        // Creo el objeto y lo guardo en la variable que voy a devolver
        t = new Tragaperras();

        return t; // devuelvo la variable que creo en la línea 19
    }

}
