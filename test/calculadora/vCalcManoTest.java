/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class vCalcManoTest {
    
    public vCalcManoTest() {
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
     * Test of getBuffer method, of class vCalcMano.
     */
    @Test
    public void testGetBuffer() {
        System.out.println("getBuffer");
        vCalcMano instance = null;
        String expResult = "";
        String result = instance.getBuffer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuffer method, of class vCalcMano.
     */
    @Test
    public void testSetBuffer() {
        System.out.println("setBuffer");
        String buffer = "";
        vCalcMano instance = null;
        instance.setBuffer(buffer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPantalla method, of class vCalcMano.
     */
    @Test
    public void testGetPantalla() {
        System.out.println("getPantalla");
        vCalcMano instance = null;
        JTextField expResult = null;
        JTextField result = instance.getPantalla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPantalla method, of class vCalcMano.
     */
    @Test
    public void testSetPantalla() {
        System.out.println("setPantalla");
        JTextField pantalla = null;
        vCalcMano instance = null;
        instance.setPantalla(pantalla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class vCalcMano.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        vCalcMano instance = null;
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class vCalcMano.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent ke = null;
        vCalcMano instance = null;
        instance.keyPressed(ke);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyTyped method, of class vCalcMano.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent ke = null;
        vCalcMano instance = null;
        instance.keyTyped(ke);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class vCalcMano.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent ke = null;
        vCalcMano instance = null;
        instance.keyReleased(ke);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
