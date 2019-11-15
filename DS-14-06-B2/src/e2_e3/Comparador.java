package e2_e3;

import java.util.*;

public class Comparador implements Comparator<EuroCoin>{

    @Override
    public int compare(EuroCoin coin1, EuroCoin coin2) {
        int x = coin1.getPais().compareTo(coin2.getPais());
        if (x == 0) { x = coin1.getValue().compareTo(coin2.getValue());
            if (x == 0) {
                if (coin1.año == coin2.año) {
                    x = 0;
                }
                if (coin1.año < coin2.año) {
                    x = -1;
                }
                if (coin1.año > coin2.año) {
                    x = +1;
                }
            }
        } return x;
    }

}