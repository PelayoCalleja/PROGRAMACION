
package modelo;

public class CuentaBancaria {
    private String NomTitular;
    private String NumCuenta;
    private float SaldoCuenta;
    
    //metodos

    public CuentaBancaria(String NomTitular, String NumCuenta) {
        this.NomTitular = NomTitular;
        this.NumCuenta = NumCuenta;
    }

    public String getNomTitular() {
        return NomTitular;
    }

    public void setNomTitular(String NomTitular) {
        this.NomTitular = NomTitular;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public double getSaldoCuenta() {
        return SaldoCuenta;
    }

    public void setSaldoCuenta(float SaldoCuenta) {
        this.SaldoCuenta = SaldoCuenta;
    }
  public void SacarDinero(float cantidad){
      this.SaldoCuenta-=cantidad;
  }
          
    public void IngresarDinero(float cantidad){
        this.SaldoCuenta+=cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NomTitular=" + NomTitular + ", NumCuenta=" + NumCuenta + ", SaldoCuenta=" + SaldoCuenta + '}';
    }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
         
    
    
    
    
    
}
