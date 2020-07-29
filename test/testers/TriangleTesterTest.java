/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.testers;

import org.junit.*;
import src.testers.TriangleTester;
import static org.junit.Assert.fail;


public class TriangleTesterTest {
    
    public TriangleTesterTest() {
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
     * Test of main method, of class TriangleTester.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TriangleTester.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
