package e1;

import java.util.*;

public class VendingMachine {
    
    private List<EuroCoin> deposito = new ArrayList<>(); // Todas las monedas de la máquina
    private List<Producto> productos = new ArrayList<>(); // Productos de la máquina
    private List<EuroCoin> monedas = new ArrayList<>(); // Monedas recién insertadas
    
    void insertProduct (String product, int price) {
        Producto p = new Producto (product, price);
        productos.add(p);
    }
    
    void insertCoin (EuroCoin e) {
        monedas.add(e);
    }
    
    public int value() {
        int valor = 0;
        for (int i = 0; i < monedas.size(); i++) {
           valor += monedas.get(i).valor.getValue();
        }
        return valor;
    }
    
    List<EuroCoin> buy (String product) {
        int efectivo = value();

        return null;
    }
    
    List<EuroCoin> cancel() {
        return monedas;
    }
}