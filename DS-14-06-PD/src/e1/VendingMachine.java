package e1;

import java.util.*;

public class VendingMachine { // implements Comparable
    
    private final List<EuroCoin> deposito = new ArrayList<>(); // Todas las monedas de la máquina
    private final List<Producto> productos = new ArrayList<>(); // Productos de la máquina
    private final List<EuroCoin> monedas = new ArrayList<>(); // Monedas recién insertadas
    private String modo = "C";
    
    public int numEDeposito() {
        return deposito.size();
    }
    
    public int numEProductos() {
        return productos.size();
    }
    
    public int numEMonedas() {
        return monedas.size();
    }
    
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
    
    public void changeModo(String modo) {
        if ("C".equals(modo)) {
            this.modo = "C";
        }
        if ("S".equals(modo)) {
            this.modo = "S";
        }
    }
    
    public int value() {
        int valor = 0;
        for (int i = 0; i < monedas.size(); i++) {
            valor += monedas.get(i).getValue().getValor();
        }
        return valor;
    }
    
    public void insertProduct (String name, int price) {
        Producto p = new Producto (name, price);
        productos.add(p);
    }
    
    public void insertCoin (EuroCoin e) {
        monedas.add(e);
    }
    
    public List<EuroCoin> buy (String product) {
        int efectivo = value();
        int precioproducto = 0;
        CambioSimple cambio1 = new CambioSimple();
        CambioCompuesto cambio2 = new CambioCompuesto();
        
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getName().equals(product)) {
                precioproducto = productos.get(i).getPrice();
            }
        }
        
        if (efectivo >= precioproducto) {
            
            efectivo -= precioproducto;
            
            if ("S".equals(modo)) {
                return cambio1.devolverCambio(monedas, efectivo);
            }
            
            if ("C".equals(modo)) {
                deposito.addAll(monedas);
//                Collections.sort(deposito);
                return cambio2.devolverCambio(deposito, efectivo);
            }
            
        }
        return null;
    }
    
    public List<EuroCoin> cancel() {
        return monedas;
    }
    
//    @Override
//    public int compareTo(Object o) {
//        
//    }
    
}