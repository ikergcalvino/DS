/*package e4;

import java.util.ArrayList;

public class EuroCoinCollection {
    
    EuroCoin EuroCoin = new EuroCoin();
    ArrayList coinCollection = new ArrayList();
    
    public boolean insertCoin(EuroCoin coin) {
       if (hasCoin(coin)) {
           return false;
       } else {
           coinCollection.add(coin);
           return true;
       }
   } 
   
    public boolean hasCoin(EuroCoin coin) {
      
       
       return coinCollection.contains(coin);
   } 
    
    public int value() {
        return 5;
    }
    
    public int numCoins() {
        return 4;
    }
    
    public void removeCoin(EuroCoin coin) {
        
    }
} */
package e4;

import java.util.ArrayList;

public class EuroCoinCollection {
    
    ArrayList <EuroCoin> coinCollection = new ArrayList();
    
    public boolean insertCoin(EuroCoin coin) {
       if (hasCoin(coin)) {
           return false;
       } else {
           coinCollection.add(coin);
           return true;
       }
   } 
   
    public boolean hasCoin(EuroCoin coin) {
       return coinCollection.contains(coin);
   } 
    
    public int value() {
        int valor = 0;
        for (int i = 0; i < coinCollection.size(); i++) {
            valor+=coinCollection.get(i).valor.getValue();
        }
        return valor;
    }
    
    public int numCoins() {
        return coinCollection.size();
    }
    
    public void removeCoin(EuroCoin coin) {
        coinCollection.remove(coin);
           
       
    }   
}