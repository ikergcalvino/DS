package e2;

import java.util.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MercadoAccionesTest {

    MercadoAcciones mercado;

    Accion a, b;

    Cliente c, j;
    
    Observer o;

    @Before
    public void setUp() {

        mercado = new MercadoAcciones();

        a = new Accion("AAAA", 0, 0, 0, 0);
        b = new Accion("xdxd", 1, 2, 3, 4);

        c = new Cliente("Paquito");
        j = new Cliente("Jeremias");

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
        assertEquals("Jeremias", j.getName());
    }

    @Test
    public void testInserts() {
        
        mercado.insertAccion(a);
        mercado.insertAccion(b);
        mercado.insertAccion(b);

        mercado.insertCliente(c);
        mercado.insertCliente(c);
        mercado.insertCliente(j);
        
        mercado.insertObserver(o);
        mercado.insertObserver(o);

    }
}
