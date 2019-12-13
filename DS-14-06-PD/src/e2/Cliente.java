package e2;

import java.util.*;

public class Cliente implements Observer {
    
    private Accion accion;
    private final String name;
    
    public Cliente (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public void update (Observable o, Object obj) {
        this.accion.getSimbolo();
        this.accion.getCierre();
        this.accion.getMax();
        this.accion.getMin();
        this.accion.getVolumen();
    }
    
}