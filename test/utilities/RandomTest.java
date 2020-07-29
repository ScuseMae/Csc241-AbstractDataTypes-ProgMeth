/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.utilities;

import org.junit.*;
import src.utilities.Random;
import java.awt.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class RandomTest {
    
    public RandomTest() {
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
     * Test of color method, of class Random.
     */
    @Test
    public void testColor() {
        System.out.println("color");
        Color expResult = null;
        Color result = Random.color();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of point method, of class Random.
     */
    @Test
    public void testPoint() {
        System.out.println("point");
        int x = 0;
        int y = 0;
        Point expResult = null;
        Point result = Random.point(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of number method, of class Random.
     */
    @Test
    public void testNumber() {
        System.out.println("number");
        int x = 0;
        double expResult = 0.0;
        double result = Random.number(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
