package modelo;

public class Coche {

    //Atributos
    private Motor motor;
    private String marca;
    private String modelo;
    private float averiaAcumulada;

    //metodos
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
  
    }

    public Coche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getAveriaAcumulada() {
        return averiaAcumulada;
    }

    public void setAveriaAcumulada(float averiaAcumulada) {
        this.averiaAcumulada = averiaAcumulada;
    }

    //incrementar importe de averias
    public void incrementarImporteAverias(float importe) {
        this.averiaAcumulada += importe;

        
        
        
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", marca=" + marca + ", modelo=" + modelo + ", averiaAcumulada=" + averiaAcumulada + '}';
    }
    
}

