package e1;

import java.util.*;

public class CambioCompuesto extends VendingMachine implements Cambio {

    @Override
    public List<EuroCoin> devolverCambio(List<EuroCoin> monedas, int efectivo) {
        List<EuroCoin> cambio = new ArrayList<>();
        for (int i = 0; i < monedas.size(); i++) {
            if (monedas.get(i).getValue().getValor() <= efectivo) {
                efectivo -= monedas.get(i).getValue().getValor();
                cambio.add(monedas.get(i));
            }
        }
        return cambio;
    }
    
}