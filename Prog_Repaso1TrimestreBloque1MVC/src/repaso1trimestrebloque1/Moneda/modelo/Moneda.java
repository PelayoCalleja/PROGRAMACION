
package repaso1trimestrebloque1.Moneda.modelo;

public class Moneda {
    //atributos
    private boolean cara;
    
    //metodos

    public boolean isCara() {
        return cara;
    }

    public void setCara(boolean cara) {
        this.cara = cara;
    }
    
    
    public  void tirarMoneda(){
        int num;
        num=(int) (Math.random()*2);
        cara=(num==0)? true:false;  
    }

    @Override
    public String toString() {
        return "Moneda{" + "cara=" + cara + '}';
    }
    
    
    
}
