/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

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
public class CalcularTest {
    
    public CalcularTest() {
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
     * Test of getOperacion method, of class Calcular.
     */
    @Test
    public void testGetOperacion() {
        System.out.println("getOperacion");
        Calcular instance = new Calcular();
        char expResult = ' ';
        char result = instance.getOperacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperacion method, of class Calcular.
     */
    @Test
    public void testSetOperacion() {
        System.out.println("setOperacion");
        char operacion = ' ';
        Calcular instance = new Calcular();
        instance.setOperacion(operacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum1 method, of class Calcular.
     */
    @Test
    public void testGetNum1() {
        System.out.println("getNum1");
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.getNum1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum1 method, of class Calcular.
     */
    @Test
    public void testSetNum1() {
        System.out.println("setNum1");
        double num1 = 0.0;
        Calcular instance = new Calcular();
        instance.setNum1(num1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum2 method, of class Calcular.
     */
    @Test
    public void testGetNum2() {
        System.out.println("getNum2");
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.getNum2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum2 method, of class Calcular.
     */
    @Test
    public void testSetNum2() {
        System.out.println("setNum2");
        double num2 = 0.0;
        Calcular instance = new Calcular();
        instance.setNum2(num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Calcular.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.suma();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calcular.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.resta();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mult method, of class Calcular.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.mult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Calcular.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.div();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sqrt method, of class Calcular.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        double num = 0.0;
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.sqrt(num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exp method, of class Calcular.
     */
    @Test
    public void testExp() {
        System.out.println("exp");
        double num = 0.0;
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.exp(num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divX method, of class Calcular.
     */
    @Test
    public void testDivX() {
        System.out.println("divX");
        double num = 0.0;
        Calcular instance = new Calcular();
        double expResult = 0.0;
        double result = instance.divX(num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
