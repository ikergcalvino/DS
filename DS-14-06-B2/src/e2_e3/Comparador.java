package e2_e3;

import java.util.*;

public class Comparador implements Comparator<EuroCoin>{

    @Override
    public int compare(EuroCoin coin1, EuroCoin coin2) {
        int x = coin1.getValue().compareTo(coin2.getValue());
        if (x == 0) { x = coin1.getPais().compareTo(coin2.getPais());
            if (x == 0) { return coin1.getDiseno().compareTo(coin2.getDiseno()); }
        } return x;
    }

}