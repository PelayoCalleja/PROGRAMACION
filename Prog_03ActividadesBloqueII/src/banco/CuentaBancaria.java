
package banco;

public class CuentaBancaria {
    //atributos
    private String numCuenta;
    private String titular;
    private float saldo;
    
    //metodos
    /**
     * Constructor con numero de cuenta y titular, con saldo 0
     * @param numCuenta numero de la cuenta
     * @param titular titular de la cuenta
     */
    public CuentaBancaria(String numCuenta, String titular) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        saldo =0;
    }
    /**
     * Constructor con los el numCuenta, titular y el saldo inicial
     * @param numCuenta numero de cuenta
     * @param titular  titular de la cuenta
     * @param saldo  saldo inicial de la cuenta
     */
    public CuentaBancaria(String numCuenta, String titular, float saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    /**
     * Devuelve el numero de la cuenta
     * @return un String con numero de la cuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }
    /**
     * asigna un numero a la cuenta
     * @param numCuenta se pasa como parámetro el numero de la cuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * devuelve el titular de la cuenta
     * @return Devuelte un string con el titular de la cuenta
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Asigna un titular a la cuenta
     * @param titular SE pasara un String con el nombre del titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return devuelve un float con el saldo de la cuenta
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Permite asingar un saldo inicial a la cuenta
     * @param saldo Pasamos como parámetro un float con el saldo inicial
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Permite ingresar una cantidad en la cuenta
     * @param cantidad 
     */
    public void ingresar(float cantidad){
        saldo+=cantidad;
        System.out.println(titular+" ingresado "+cantidad+"€ OPERACION REALIZADA");
    } 

    public void retirar(float cantidad){
        if (cantidad>saldo) {
             System.out.println("no hay tanto dinero en la cuenta, OPERACION CANCELADA" );
        }
        else{
            saldo-=cantidad;
            System.out.println(titular+" retirado "+cantidad +"€ OPERACION REALIZADA");
        }        
    }

    /**
     * @Override sobrescritura metodo toString para visualizar valores de los atributos
     * */
    public String toString() {
        return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
}
