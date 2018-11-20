
package Calculadora;

public class Calculadora {
    private float x;
    private float y;
           
    public Calculadora(){
        x=0;
        y=0;
    }

    public Calculadora(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

 public float sumar (){
        
        int resultado;
        resultado= (int) (float) (x+y);  
        return resultado;
        }
      
    public float resta (){
        
        int resultado;
        resultado= (int) (x-y);  
        return resultado;
        }
    
       public float mul (){
        
        int resultado;
        resultado= (int) (x*y);  
        return resultado;
        }
    
       public float div (){
        
        int resultado;
        resultado= (int) (x/y);  
        return resultado;
        }

    @Override
    public String toString() {
        return "Calculadora{" + "x=" + x + ", y=" + y + '}';
    }




}
