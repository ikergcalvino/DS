package e2;

import java.util.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MercadoAccionesTest {

    MercadoAcciones mercado;

    Accion a, b;

    Cliente c, d;
    
    Object obj;
    
    Observer o;

    @Before
    public void setUp() {

        mercado = new MercadoAcciones();

        a = new Accion("AAAA", 0, 0, 0, 0);
        b = new Accion("xdxd", 1, 2, 3, 4);

        c = new Cliente("Paquito");
        d = new Cliente("Jeremias");

    }

    @Test
    public void testSetters_Getters() {

        a.setCierre(1);
        a.setMax(2);
        a.setMin(3);
        a.setSimbolo("xdxd");
        a.setVolumen(4);

        assertEquals(a.getClass(), b.getClass());
        assertTrue(a.getCierre() == b.getCierre());
        assertTrue(a.getMax() == b.getMax());
        assertTrue(a.getMin() == b.getMin());
        assertEquals(a.getSimbolo(), b.getSimbolo());
        assertTrue(a.getVolumen() == b.getVolumen());
        assertEquals("Paquito", c.getName());
        assertEquals("Jeremias", d.getName());
    }

    @Test
    public void testInserts_Deletes() {
        
        mercado.insertAccion(a);
        mercado.insertAccion(b);
        mercado.insertAccion(b);
        
        mercado.deleteAccion(a);

        mercado.insertCliente(c);
        mercado.insertCliente(c);
        mercado.insertCliente(d);
        
        mercado.deleteCliente(d);
        
        mercado.insertObserver(o);
        mercado.insertObserver(o);
        
        mercado.deleteObserver(o);

    }
    
    @Test
    public void testNotification() {
        
        a.setSimbolo("BBBB");
        mercado.notification();
        assertEquals("BBBB", a.getSimbolo());
        
        a.setCierre(1);
        a.setMax(2);
        a.setMin(3);
        a.setSimbolo("xdxd");
        a.setVolumen(4);
        
        d.update(a, a);
        
    }
}
