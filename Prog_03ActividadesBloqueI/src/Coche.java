

public class Coche {

//Declaramos Atributos
    private Motor motor;
    private String marca;
    private String modelo;
    private double importeAveria;

    //metodos de la clase Coche
    /**
     * Constructor con dos parámetros marca y modelo
     *
     * @param marca String con la marca del coche
     * @param modelo String con el modelo del coche
     */
    public Coche(String marca, String modelo) {
        motor = new Motor();
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método que devuelve el importe de la averia
     *
     * @return double retorna el importe de la averia
     */
    public double getImporteAveria() {
        return importeAveria;
    }

    /**
     * Método que me permite acumular el importe de la avería
     *
     * @param cantidad cantidad es el importe de la avería a incrementar
     */
    public void acumularAverias(double cantidad) {
        importeAveria += cantidad;
    }

    /**
     * devuelve la marca del coche
     *
     * @return un String con la marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Asinga un valor al atributo marca
     *
     * @param marca pasamos un String con la marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * devuelve un String con valor del atributo modelo del coche
     *
     * @return un String con el valor del atributo modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Asinga un valor al atributo marca
     *
     * @param modelo asigna un String al atributo modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve el atributo motor que es un objeto en si mismo
     *
     * @return un objeto de tipo motor y habrá que tratarlo despues con los
     * métodos que tiene un motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Permite asignar al atributo motor un objeto de tipo motor que se pasa
     * como parámetro
     *
     * @param motor debe de ser variable de tipo motor
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * Método que permite mostrar todos los valores de los atributos de un
     * objeto Coche. Fijarse que el atributo motor es un objeto en si mismo y
     * para mostrar los atributos que tiene un motor habíamos diseñado en la
     * clase Motor el método toString, por lo tanto para mostrar los atributos
     * que tiene el atributo motor de la clase coche tendremos que poner
     * motor.toString()
     *
     * @Override sobrescribimos el metodo toString
     */
    public String toString() {
        return "Coche{" + "motor=" + motor.toString() + ", marca=" + marca + ", modelo=" + modelo + ", importeAveria=" + importeAveria + '}';
    }

}
