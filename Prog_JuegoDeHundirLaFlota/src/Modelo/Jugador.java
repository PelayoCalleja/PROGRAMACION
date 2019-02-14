
package Modelo;

public class Jugador {
    //Atributos

    private String nombre;
    private int intentos;
    
    //Metodos

    public Jugador(String nombre, int intentos) {
        this.nombre = nombre;
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    
    
}
