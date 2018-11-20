
public class Garaje {

    //atributos
    private Coche coche = null;
    private String averia = null;
    private int numCochesAtendidos;

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getAveria() {
        return averia;
    }

    public void setAveria(String averia) {
        this.averia = averia;
    }

    public int getNumCochesAtendidos() {
        return numCochesAtendidos;
    }

    public void setNumCochesAtendidos(int numCochesAtendidos) {
        this.numCochesAtendidos = numCochesAtendidos;
    }

    //metodos
    /**
     * Metodo que permita aceptar un coche con una avería si está vacio el garaje
     * en cuyo caso se acumulara el importe de la averia al coche
     * @param c coche que quiere entrar
     * @param averia averia que tiene el coche
     * @return boolean con tru o false si ha podido entrar o no
     */
    
    
    public boolean aceptarCoche(Coche c, String averia) {
        double importeAveria;
        if (coche != null)  {
        //ya esta siendo atendido otro coche, no se puede atender
            return false;
        } else {
            //entra el coche en el garaje
            coche = c;
            this.averia = averia;
            //acumulamos la averia al atributo coche
            importeAveria=  (Math.random()*100+100);
            c.acumularAverias(importeAveria);

            //incrementamos el número de coches atendidos
            numCochesAtendidos++;
            return true;
        }
    }

   /**
    * deja el garaje vacion sin coches
    */
    public void devolverCoche() {
        System.out.println (" Saliendo coche "+coche.toString());
        //dejamos el objeto coche vacio, para poder atender a otro
        coche = null;
        //hacemos lo mismo con la averia
        averia = null;
    }
    
}
