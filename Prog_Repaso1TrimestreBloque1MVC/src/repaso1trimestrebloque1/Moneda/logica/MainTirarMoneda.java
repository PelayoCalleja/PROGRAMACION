package repaso1trimestrebloque1.Moneda.logica;

import repaso1trimestrebloque1.Moneda.modelo.Moneda;
import repaso1trimestrebloquei.Moneda.logica.vista.VistaMoneda;

public class MainTirarMoneda {

    public static void main(String[] args) {

        Moneda m = new Moneda();
        VistaMoneda v = new VistaMoneda();

        ControladorMoneda controladorMoneda;

        controladorMoneda = new ControladorMoneda(m, v);
        controladorMoneda.juego();
    }

}
