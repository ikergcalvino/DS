//package e2_e3;
//
//import java.util.Comparator;
//import java.util.Iterator;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class EuroCoinCollectionTest {
//    
//    public EuroCoinCollectionTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of insertCoin method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testInsertCoin() {
//        System.out.println("insertCoin");
//        EuroCoin coin = null;
//        EuroCoinCollection instance = new EuroCoinCollection();
//        boolean expResult = false;
//        boolean result = instance.insertCoin(coin);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hasCoin method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testHasCoin() {
//        System.out.println("hasCoin");
//        EuroCoin coin = null;
//        EuroCoinCollection instance = new EuroCoinCollection();
//        boolean expResult = false;
//        boolean result = instance.hasCoin(coin);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of value method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testValue() {
//        System.out.println("value");
//        EuroCoinCollection instance = new EuroCoinCollection();
//        int expResult = 0;
//        int result = instance.value();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of numCoins method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testNumCoins() {
//        System.out.println("numCoins");
//        EuroCoinCollection instance = new EuroCoinCollection();
//        int expResult = 0;
//        int result = instance.numCoins();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeCoin method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testRemoveCoin() {
//        System.out.println("removeCoin");
//        EuroCoin coin = null;
//        EuroCoinCollection instance = new EuroCoinCollection();
//        instance.removeCoin(coin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ordenador1 method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testOrdenador1() {
//        System.out.println("ordenador1");
//        EuroCoinCollection instance = new EuroCoinCollection();
//        instance.ordenador1();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ordenador2 method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testOrdenador2() {
//        System.out.println("ordenador2");
//        Comparator<EuroCoin> comparer = null;
//        EuroCoinCollection instance = new EuroCoinCollection();
//        instance.ordenador2(comparer);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of iterator method, of class EuroCoinCollection.
//     */
//    @Test
//    public void testIterator() {
//        System.out.println("iterator");
//        EuroCoinCollection instance = new EuroCoinCollection();
//        Iterator<EuroCoin> expResult = null;
//        Iterator<EuroCoin> result = instance.iterator();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}