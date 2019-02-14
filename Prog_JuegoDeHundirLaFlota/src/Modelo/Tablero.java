package Modelo;

public class Tablero {

    /*filas:filas que tiene el tablero
    columnas:columnas que tiene el tablero
    fbarco: fila en la que está el barco
    cbarco:columna en la que está el barco
     */
    //Atributos
    private char tabla[][];
    private int filas, columnas;
    private int fbarco, cbarco;
    private GestionDeFichero gf;
    private Jugador jugon;
    //Metodos
    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;

        tabla = new char[filas][columnas];
    }

    public void cargar(int filas, int columnas) {
        for (int x = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {
                tabla[x][y] = '-';
            }
        }
        fbarco = (int) (1 + Math.random() * filas);
        cbarco = (int) (1 + Math.random() * columnas);
       System.out.println(fbarco + " " + cbarco);
    }

    public void mostrar(int filas, int columnas) {
        int i = 1;
        System.out.println(" ");//Imprime espacio en blanco
        for (int x = 0; x < columnas; x++) {
            System.out.print(x + 1);
        }
        System.out.println(" ");//Imprime salto de linea
        for (int x = 0; x < filas; x++) {
            System.out.print(i);
            i++;
            for (int y = 0; y < columnas; y++) {
                System.out.print(tabla[x][y]);
            }
            System.out.println("");
        }

    }

    public boolean jugada(int filas, int columnas) {
        if ((filas == fbarco) && (columnas == cbarco)) {
            tabla[filas - 1][columnas - 1] = 'X';
            System.out.println("Acierto");
            return false;

        } else {
            tabla[filas - 1][columnas - 1] = '0';
            
            return true;
            
        }

    }


    public void gestion_fichero(GestionDeFichero gf,Jugador jugon){
    
        gf.abrirFichero();
        gf.grabarFichero(jugon);
        gf.cerrarFichero();
        gf.leerFichero();

    
}


}

