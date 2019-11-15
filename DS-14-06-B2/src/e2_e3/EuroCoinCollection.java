package e2_e3;

import java.util.*;

// Represents a Euro coin collection
public class EuroCoinCollection implements Iterable<EuroCoin>{

	private List<EuroCoin> coinCollection = new ArrayList<EuroCoin>();

        // Inserts a coin in the collection . If the coin is already in the
        // collection ( there is an equal coin inserted ) then the coin is not inserted .
        // Returns true only if a new coin has been inserted in the collection .
	public boolean insertCoin(EuroCoin coin) {
		if (hasCoin(coin)) {
			return false;
		} else {
			coinCollection.add(coin);
			return true;
		}
	}

        // Checks if a coin has been already inserted in the collection
	public boolean hasCoin(EuroCoin coin) {
		return coinCollection.contains(coin);
	}

        // Returns the nominal value of the entire collection in euro cents .
	public int value() {
		int valor = 0;
		for (int i = 0; i < coinCollection.size(); i++) {
			valor += coinCollection.get(i).valor.getValue();
		}
		return valor;
	}

        // Counts the number of coins in the collection .
	public int numCoins() {
		return coinCollection.size();
	}

        // Removes the specified coin from the collection
	public void removeCoin(EuroCoin coin) {
		coinCollection.remove(coin);
	}
        
        public void ordenador1() {
//            Collections.sort(coinCollection);
        }
        
        public void ordenador2(Comparator<EuroCoin> comparer) {
//            Collections.sort(coinCollection, comparer);
        }
        
        @Override
        public Iterator<EuroCoin> iterator() {
            return null;
            
        }
}