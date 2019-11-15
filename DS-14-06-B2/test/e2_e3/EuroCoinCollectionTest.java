package e2_e3;

import java.util.Comparator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;

public class EuroCoinCollectionTest {
        EuroCoin e1_sp1, // Juan Carlos I coin
             e1_sp2, // Felipe VI coin
             e2_sp_2002,  // Juan Carlos I coin of 2002
             e2_sp_2005,  // Juan Carlos I coin of 2005
             c50_it, 
             c20_fr, 
             c1_pt;
    EuroCoinCollection collection;
    
    Comparator<EuroCoin> comparer;
    
    @Before
    public void setUp() {
        collection = new EuroCoinCollection();
        
        // THIS COINS MUST BE PROPERLY CREATED IN ORDER TO THE TEST TO WORK CORRECTLY
        e1_sp1 = new EuroCoin(EuroCoin.Valor.E1, "Juan Carlos I", EuroCoin.Pais.ES, EuroCoin.Color.ORO_PLATA, 2019);
        e1_sp2 = new EuroCoin(EuroCoin.Valor.E1, "Felipe VI", EuroCoin.Pais.ES, EuroCoin.Color.ORO_PLATA, 2019);
        e2_sp_2002  = new EuroCoin(EuroCoin.Valor.E2, "Juan Carlos I", EuroCoin.Pais.ES, EuroCoin.Color.ORO_PLATA, 2002);
        e2_sp_2005  = new EuroCoin(EuroCoin.Valor.E2, "Juan Carlos I", EuroCoin.Pais.ES, EuroCoin.Color.ORO_PLATA, 2005);
        c50_it = new EuroCoin(EuroCoin.Valor.C50, " ", EuroCoin.Pais.IT, EuroCoin.Color.ORO, 2005);
        c20_fr = new EuroCoin(EuroCoin.Valor.C20, " ", EuroCoin.Pais.FR, EuroCoin.Color.ORO, 2005);
        c1_pt = new EuroCoin(EuroCoin.Valor.C1, " ", EuroCoin.Pais.PT, EuroCoin.Color.BRONCE, 2005);
       
        assertTrue(collection.insertCoin(e1_sp1));
        assertTrue(collection.insertCoin(e1_sp2));
        assertTrue(collection.insertCoin(e2_sp_2002));
        assertFalse(collection.insertCoin(e2_sp_2005)); // Not inserted
        assertTrue(collection.insertCoin(c50_it));
        assertTrue(collection.insertCoin(c20_fr));
        assertFalse(collection.insertCoin(c50_it)); // Not inserted        
    }
    
    @Test
    public void testNumCoins() {       
        assertEquals(5, collection.numCoins());
    }

    @Test
    public void testHasCoin() {
        assertTrue(collection.hasCoin(e1_sp1));
        assertTrue(collection.hasCoin(e2_sp_2005));
        assertFalse(collection.hasCoin(c1_pt));
    }

    @Test
    public void testCollectionValue() {
        assertEquals(470, collection.value());
    }    
    
    @Test
    public void testRemoveCoin() {
        collection.removeCoin(c50_it);
        assertEquals(4, collection.numCoins());
        assertEquals(420, collection.value());
        
        collection.removeCoin(e2_sp_2005); // removes the 2002 coin
        assertEquals(3, collection.numCoins());
        assertEquals(220, collection.value());
        
        collection.removeCoin(c1_pt); // No coin removed
        assertEquals(3, collection.numCoins());
        assertEquals(220, collection.value());
    }
    
//    @Test
//    public void testGetters(){
//        assertEquals();
//        assertEquals();
//        assertEquals();
//        assertEquals();
//        assertEquals();
//    }
    
    @Test
    public void testHashCode(){
        assertTrue(e1_sp1.hashCode() == e1_sp1.hashCode());
        assertTrue(e1_sp2.hashCode() == e1_sp2.hashCode());
        assertTrue(e2_sp_2002.hashCode() == e2_sp_2002.hashCode());
        assertTrue(e2_sp_2005.hashCode() == e2_sp_2005.hashCode());
        assertTrue(c50_it.hashCode() == c50_it.hashCode());
        assertTrue(c20_fr.hashCode() == c20_fr.hashCode());
        assertTrue(c1_pt.hashCode() == c1_pt.hashCode());
    }
    
    @Test
    public void testCompareTo(){
        assertEquals(0,e1_sp1.compareTo(e1_sp1));
        assertEquals(-1,e1_sp2.compareTo(e2_sp_2002));
        assertEquals(0,e2_sp_2002.compareTo(e2_sp_2005));
        assertEquals(0,e2_sp_2005.compareTo(e2_sp_2005));
        assertEquals(-1,c50_it.compareTo(e1_sp1));
        assertEquals(+1,c50_it.compareTo(c20_fr));
    }
    
    @Test
    public void testOrdenador(){
        collection.ordenador1();
    }
}