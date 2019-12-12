package e1;


import java.util.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VendingMachineTest {
    
    List<EuroCoin> deposito = new ArrayList<>();
    List<Producto> productos = new ArrayList<>();
    List<EuroCoin> monedas = new ArrayList<>();
    
    EuroCoin c1, c2, c5, c10, c20, c50, e1, e2;
    
    Producto p1, p2, p3, p4, p5, p6;
    
    VendingMachine maquina;
    
    @Before
    public void setUp() {
        
        maquina = new VendingMachine();
        
        c1 = new EuroCoin (EuroCoin.Valor.C1);
        c2 = new EuroCoin (EuroCoin.Valor.C2);
        c5 = new EuroCoin (EuroCoin.Valor.C5);
        c10 = new EuroCoin (EuroCoin.Valor.C10);
        c20 = new EuroCoin (EuroCoin.Valor.C20);
        c50 = new EuroCoin (EuroCoin.Valor.C50);
        e1 = new EuroCoin (EuroCoin.Valor.E1);
        e2 = new EuroCoin (EuroCoin.Valor.E2);
    
        p1 = new Producto("Regaliz", 50);
        p2 = new Producto("Kit-Kat", 100);
        p3 = new Producto("Oreo", 150);
        p4 = new Producto("Coca-Cola", 200);
        p5 = new Producto("Chupito", 250);
        p6 = new Producto("Máquina", 300);
    
    }
    
    @Test
    public void testInsertProduct() {
        maquina.insertProduct("Regaliz", 50);
        maquina.insertProduct("Kit-Kat", 100);
        maquina.insertProduct("Oreo", 150);
        maquina.insertProduct("Coca-Cola", 200);
        maquina.insertProduct("Chupito", 250);
        maquina.insertProduct("Máquina", 300);
        assertEquals(6, maquina.numEProductos());
    }
    
    @Test
    public void testInsertCoin() {
        maquina.insertCoin(c1);
        maquina.insertCoin(c2);
        maquina.insertCoin(c5);
        maquina.insertCoin(c10);
        maquina.insertCoin(c20);
        maquina.insertCoin(c50);
        maquina.insertCoin(e1);
        maquina.insertCoin(e2);
        assertEquals(8, maquina.numEMonedas());
    }
    
    @Test
    public void testValue() {
        maquina.insertCoin(c1);
        maquina.insertCoin(c2);
        maquina.insertCoin(c5);
        maquina.insertCoin(c10);
        maquina.insertCoin(c20);
        maquina.insertCoin(c50);
        maquina.insertCoin(e1);
        maquina.insertCoin(e2);
        assertEquals(388, maquina.value());
    }
    
    @Test
    public void testModo() {
        maquina.setModo("C");
        assertEquals("C", maquina.getModo());
        maquina.setModo("S");
        assertEquals("S", maquina.getModo());
        maquina.setModo("C");
        maquina.changeModo("C");
        assertEquals("C", maquina.getModo());
        maquina.changeModo("S");
        assertEquals("S", maquina.getModo());
    }
    
    @Test
    public void testSort() {
        maquina.insertCoin(c2);
        maquina.insertCoin(e1);
        maquina.insertCoin(c5);
        maquina.insertCoin(c50);
        maquina.insertCoin(c10);
        maquina.insertCoin(c1);
        maquina.insertCoin(c20);
        maquina.insertCoin(e2);
        maquina.sortMonedas();
        assertEquals(200, maquina.getMonedas().get(0).getValue().getValor());
        assertEquals(100, maquina.getMonedas().get(1).getValue().getValor());
        assertEquals(50, maquina.getMonedas().get(2).getValue().getValor());
        assertEquals(20, maquina.getMonedas().get(3).getValue().getValor());
        assertEquals(10, maquina.getMonedas().get(4).getValue().getValor());
        assertEquals(5, maquina.getMonedas().get(5).getValue().getValor());
        assertEquals(2, maquina.getMonedas().get(6).getValue().getValor());
        assertEquals(1, maquina.getMonedas().get(7).getValue().getValor());
    }
    
    @Test
    public void testBuy() {
        maquina.insertProduct("Regaliz", 50);
        maquina.insertProduct("Kit-Kat", 100);
        maquina.insertProduct("Oreo", 150);
        maquina.insertProduct("Coca-Cola", 200);
        maquina.insertProduct("Chupito", 250);
        maquina.insertProduct("Máquina", 300);
        
        maquina.insertDeposito(c1);     maquina.insertDeposito(c1);     maquina.insertDeposito(c1);
        maquina.insertDeposito(c2);     maquina.insertDeposito(c2);     maquina.insertDeposito(c2);
        maquina.insertDeposito(c5);     maquina.insertDeposito(c5);     maquina.insertDeposito(c5);
        maquina.insertDeposito(c10);    maquina.insertDeposito(c10);    maquina.insertDeposito(c10);
        maquina.insertDeposito(c20);    maquina.insertDeposito(c20);    maquina.insertDeposito(c20);
        maquina.insertDeposito(c50);    maquina.insertDeposito(c50);    maquina.insertDeposito(c50);
        maquina.insertDeposito(e1);     maquina.insertDeposito(e1);     maquina.insertDeposito(e1);
        maquina.insertDeposito(e2);     maquina.insertDeposito(e2);     maquina.insertDeposito(e2);
        
        maquina.setModo("C");
        
        maquina.insertCoin(e2); maquina.insertCoin(e2);
        assertEquals(150, maquina.value(maquina.buy("Chupito")));
        
        maquina.insertCoin(e1);
        assertEquals(0, maquina.value(maquina.buy("Kit-Kat")));
        
        maquina.insertCoin(e2); maquina.insertCoin(c50);
        assertEquals(100, maquina.value(maquina.buy("Oreo")));
        
        maquina.insertCoin(e2); maquina.insertCoin(c50); maquina.insertCoin(c20); maquina.insertCoin(c20); maquina.insertCoin(c20);
        assertEquals(10, maquina.value(maquina.buy("Máquina")));
        
        maquina.changeModo("S");
        
        maquina.insertCoin(e1); maquina.insertCoin(e1); maquina.insertCoin(e1);
        assertEquals(100, maquina.value(maquina.buy("Oreo")));
        
        maquina.insertCoin(e2); maquina.insertCoin(c50); maquina.insertCoin(e1);
        assertEquals(100, maquina.value(maquina.buy("Chupito")));
        
        maquina.insertCoin(e2); maquina.insertCoin(e2); maquina.insertCoin(e1);
        assertEquals(200, maquina.value(maquina.buy("Máquina")));
        
        maquina.insertCoin(e2); maquina.insertCoin(e2); maquina.insertCoin(c10);
        assertEquals(10, maquina.value(maquina.buy("Máquina")));
        
        maquina.insertCoin(e2); maquina.insertCoin(e1);
        assertEquals(0, maquina.value(maquina.buy("Máquina")));
        
    }
    
    @Test
    public void testCancel() {
        assertEquals(maquina.getMonedas(), maquina.cancel());
        maquina.insertCoin(e1);
        assertEquals(maquina.getMonedas(), maquina.cancel());
        maquina.insertCoin(e1);
        maquina.insertCoin(e2);
        assertEquals(maquina.getMonedas(), maquina.cancel());
    }
    
    @Test
    public void testProducto() {
        assertEquals("Regaliz", p1.getName());
        assertEquals(50, p1.getPrice());
        assertEquals("Kit-Kat", p2.getName());
        assertEquals(100, p2.getPrice());
        assertEquals("Oreo", p3.getName());
        assertEquals(150, p3.getPrice());
        assertEquals("Coca-Cola", p4.getName());
        assertEquals(200, p4.getPrice());
        assertEquals("Chupito", p5.getName());
        assertEquals(250, p5.getPrice());
        assertEquals("Máquina", p6.getName());
        assertEquals(300, p6.getPrice());
    }
    
    @Test
    public void testOverrideEuroCoin() {
        assertEquals(e1.hashCode(),e1.hashCode());
        assertEquals(e2.hashCode(),e2.hashCode());
        assertEquals(c50.hashCode(),c50.hashCode());
        assertFalse(e1.equals(e2));
        assertFalse(e2.equals(null));
        assertEquals(e2 == null, e2.equals(null));
        assertFalse(c50.equals(e1));
        assertTrue(e1.equals(e1));
        assertTrue(c50.equals(c50));
        assertTrue(e2.equals(e2));
    }
}