
import java.util.StringTokenizer;


public class TokenizarAlumno {

    private String linea;

    public TokenizarAlumno(String linea) {
        this.linea = linea;
    }

    public Alumno tokenizar() {
        Alumno alumno;
        StringTokenizer tokens = new StringTokenizer(linea, ",");

        String nombre = tokens.nextToken();
        String apellido = tokens.nextToken();
        float nota1 = Float.parseFloat(tokens.nextToken().trim());
        float nota2 = Float.parseFloat(tokens.nextToken().trim());
        float nota3 = Float.parseFloat(tokens.nextToken().trim());

        alumno = new Alumno(nombre, apellido, nota1, nota2, nota3);
        return alumno;
    }

}
