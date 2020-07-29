/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.simplethings;

import org.junit.*;
import src.simplethings.Triangle;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TriangleTest {
    
    public TriangleTest() {
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
     * Test of perimeter method, of class Triangle.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Triangle instance = null;
        double expResult = 0.0;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class Triangle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Triangle instance = null;
        double expResult = 0.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Triangle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangle instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Triangle.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Triangle instance = null;
        String expResult = "";
        String result = instance.print();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
