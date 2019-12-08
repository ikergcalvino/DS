package e1;

import java.util.*;

public class CambioSimple extends VendingMachine implements Cambio {

    @Override
    public List<EuroCoin> devolverCambio() {
        for (int i = 0; i < monedas.size(); i++) {
            efectivo -= monedas.get(i).valor.getValue();
        }
    }
    
}