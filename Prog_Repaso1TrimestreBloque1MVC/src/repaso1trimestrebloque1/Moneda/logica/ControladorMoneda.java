package repaso1trimestrebloque1.Moneda.logica;

import repaso1trimestrebloque1.Moneda.modelo.Moneda;
import repaso1trimestrebloquei.Moneda.logica.vista.VistaMoneda;

public class ControladorMoneda {

    private Moneda m;
    private VistaMoneda v;

    public ControladorMoneda(Moneda m, VistaMoneda v) {
        this.m = m;
        this.v = v;
    }

    public void juego() {
        m = new Moneda();
        m.tirarMoneda();
        //System.out.println(" Tirando moneda y sale " + m.toString());

        if (m.isCara()) {
            v.mostrarTirada(" Ha salido cara ");
        } else {
            v.mostrarTirada(" Ha salido cruz ");
        }

    }
}
