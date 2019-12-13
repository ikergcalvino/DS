/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2;

import java.util.Observer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Íker
 */
public class MercadoAccionesTest {
    
    public MercadoAccionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertAccion method, of class MercadoAcciones.
     */
    @Test
    public void testInsertAccion() {
        System.out.println("insertAccion");
        Accion accion = null;
        MercadoAcciones instance = new MercadoAcciones();
        instance.insertAccion(accion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccion method, of class MercadoAcciones.
     */
    @Test
    public void testDeleteAccion() {
        System.out.println("deleteAccion");
        Accion accion = null;
        MercadoAcciones instance = new MercadoAcciones();
        instance.deleteAccion(accion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertCliente method, of class MercadoAcciones.
     */
    @Test
    public void testInsertCliente() {
        System.out.println("insertCliente");
        Cliente cliente = null;
        MercadoAcciones instance = new MercadoAcciones();
        instance.insertCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCliente method, of class MercadoAcciones.
     */
    @Test
    public void testDeleteCliente() {
        System.out.println("deleteCliente");
        Cliente cliente = null;
        MercadoAcciones instance = new MercadoAcciones();
        instance.deleteCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertObserver method, of class MercadoAcciones.
     */
    @Test
    public void testInsertObserver() {
        System.out.println("insertObserver");
        Observer observer = null;
        MercadoAcciones instance = new MercadoAcciones();
        instance.insertObserver(observer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObserver method, of class MercadoAcciones.
     */
    @Test
    public void testDeleteObserver() {
        System.out.println("deleteObserver");
        Observer observer = null;
        MercadoAcciones instance = new MercadoAcciones();
        instance.deleteObserver(observer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notification method, of class MercadoAcciones.
     */
    @Test
    public void testNotification() {
        System.out.println("notification");
        MercadoAcciones instance = new MercadoAcciones();
        instance.notification();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
