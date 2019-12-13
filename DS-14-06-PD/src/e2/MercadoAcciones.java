package e2;

import java.util.*;

public class MercadoAcciones {
    
    private final List<Accion> bolsa = new ArrayList<>(); // Lista de acciones
    private final List<Cliente> clientes = new ArrayList<>(); // Lista de clientes
    private final List<Observer> observadores = new ArrayList<>(); //Lista de observadores
    
    public void insertAccion (Accion accion) {
        if (!bolsa.contains(accion)) {
            bolsa.add(accion);
        }
    }
    
    public void deleteAccion (Accion accion) {
        bolsa.remove(accion);
    }
    
    public void insertCliente (Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void deleteCliente (Cliente cliente) {
        clientes.remove(cliente);
    }
    
    public void insertObserver (Observer observer) {
        if (!observadores.contains(observer)) {
            observadores.add(observer);
        }
    }

    public void ddeleteObserver (Observer observer) {
        observadores.remove(observer);
    }
    
    public void notification() {
        for (Observer observer : observadores) {
//            observer.update(, );
        }
    }
}