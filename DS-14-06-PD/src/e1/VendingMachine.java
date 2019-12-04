package e1;

import java.util.*;

public interface VendingMachine {
    void insertProduct (String product, int price);
    void insertCoin (EuroCoin e);
    List <EuroCoin> buy (String product);
    List <EuroCoin> cancel ();
}