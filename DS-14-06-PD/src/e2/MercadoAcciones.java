package e2;

import java.util.*;

public class MercadoAcciones extends Observable {
    
    private final List<Accion> bolsa = new ArrayList<>(); // Lista de acciones
    
    public void insertAccion (String simbolo, float cierre, float max, float min, float volumen) {
        Accion a = new Accion (simbolo, cierre, max, min, volumen);
        if (!bolsa.contains(a)) {
            bolsa.add(a);
        }
    }
    
    public void deleteAccion (Accion accion) {
        bolsa.remove(accion);
    }
    
}