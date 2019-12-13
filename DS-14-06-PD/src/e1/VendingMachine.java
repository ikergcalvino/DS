package e1;

import java.util.*;

public class VendingMachine {

    private final List<EuroCoin> deposito = new ArrayList<>(); // Todas las monedas de la máquina
    private final List<Producto> productos = new ArrayList<>(); // Productos de la máquina
    private final List<EuroCoin> monedas = new ArrayList<>(); // Monedas recién insertadas
    private String modo = "C";

    public List<EuroCoin> getDeposito() {
        return deposito;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<EuroCoin> getMonedas() {
        return monedas;
    }

    public void insertDeposito(EuroCoin e) {
        deposito.add(e);
    }

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

    public int value(List<EuroCoin> list) {
        int valor = 0;
        for (int i = 0; i < list.size(); i++) {
            valor += list.get(i).getValue().getValor();
        }
        return valor;
    }

    public void sortDeposito() {
        EuroCoin aux;

        for (int i = 0; i < deposito.size() - 1; i++) {
            if (deposito.get(i).getValue().getValor() < deposito.get(i + 1).getValue().getValor()) {
                aux = deposito.get(i);
                deposito.set(i, deposito.get(i + 1));
                deposito.set(i + 1, aux);
                sortDeposito();
            }
        }
    }

    public void sortMonedas() {
        EuroCoin aux;

        for (int i = 0; i < monedas.size() - 1; i++) {
            if (monedas.get(i).getValue().getValor() < monedas.get(i + 1).getValue().getValor()) {
                aux = monedas.get(i);
                monedas.set(i, monedas.get(i + 1));
                monedas.set(i + 1, aux);
                sortMonedas();
            }
        }
    }

    public void insertProduct(String name, int price) {
        Producto p = new Producto(name, price);
        productos.add(p);
    }

    public void insertCoin(EuroCoin e) {
        monedas.add(e);
    }

    public List<EuroCoin> buy(String product) {
        List<EuroCoin> devolucion = new ArrayList<>();
        int efectivo = value();
        int precioproducto = 0;
        CambioSimple cambio1 = new CambioSimple();
        CambioCompuesto cambio2 = new CambioCompuesto();

        for (int i = 0; i < productos.size(); i++) { // Buscar producto
            if (productos.get(i).getName().equals(product)) {
                precioproducto = productos.get(i).getPrice();
            }
        }

        if (efectivo >= precioproducto) {

            efectivo -= precioproducto;

            if ("S".equals(modo)) {
                sortMonedas();
                devolucion = cambio1.devolverCambio(monedas, efectivo);
                deposito.addAll(monedas);
                monedas.removeAll(monedas);
            }

            if ("C".equals(modo)) {
                deposito.addAll(monedas);
                monedas.removeAll(monedas);
                sortDeposito();
                devolucion = cambio2.devolverCambio(deposito, efectivo);
            }

        } else {
            for (int i = 0; i < monedas.size(); i++) {
                devolucion.add(monedas.get(i));
            }
            monedas.removeAll(monedas);
        }
        return devolucion;
    }

    public List<EuroCoin> cancel() {
        return monedas;
    }

}