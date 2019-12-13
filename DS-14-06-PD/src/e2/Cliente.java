package e2;

import java.util.*;

public class Cliente implements Observer {

    private final String name;

    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Accion accion) {
        accion.getSimbolo();
        accion.getCierre();
        accion.getMax();
        accion.getMin();
        accion.getVolumen();
    }

}