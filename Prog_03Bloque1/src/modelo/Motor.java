package modelo;

public class Motor {

    //Atributos
    private double litrosdeaceite;
    private int cv;

    //metodo constructor
    public Motor(int cv) {
        this.cv = cv;
        this.litrosdeaceite = 0;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public double getLitrosdeaceite() {
        return litrosdeaceite;
    }

    public void setLitrosdeaceite(double litrosdeaceite) {
        this.litrosdeaceite = litrosdeaceite;
    }

    @Override
    public String toString() {
        return "Motor{" + "litrosdeaceite=" + litrosdeaceite + ", cv=" + cv + '}';
    }

   
    
}
