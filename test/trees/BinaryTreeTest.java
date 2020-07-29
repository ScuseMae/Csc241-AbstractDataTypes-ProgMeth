/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.trees;

import org.junit.*;
import src.trees.BinaryTree;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BinaryTreeTest {
    
    public BinaryTreeTest() {
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
     * Test of value method, of class BinaryTree.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        BinaryTree instance = new BinaryTree();
        Object expResult = null;
        Object result = instance.value();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class BinaryTree.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = null;
        BinaryTree instance = new BinaryTree();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class BinaryTree.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class BinaryTree.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        BinaryTree instance = new BinaryTree();
        int expResult = 0;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preorder method, of class BinaryTree.
     */
    @Test
    public void testPreorder() {
        System.out.println("preorder");
        BinaryTree instance = new BinaryTree();
        instance.preorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorder method, of class BinaryTree.
     */
    @Test
    public void testInorder() {
        System.out.println("inorder");
        BinaryTree instance = new BinaryTree();
        instance.inorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postorder method, of class BinaryTree.
     */
    @Test
    public void testPostorder() {
        System.out.println("postorder");
        BinaryTree instance = new BinaryTree();
        instance.postorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addST method, of class BinaryTree.
     */
    @Test
    public void testAddST() throws Exception {
        System.out.println("addST");
        Object key = null;
        Object value = null;
        BinaryTree instance = new BinaryTree();
        instance.addST(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addND method, of class BinaryTree.
     */
    @Test
    public void testAddND() {
        System.out.println("addND");
        Object key = null;
        Object value = null;
        BinaryTree instance = new BinaryTree();
        instance.addND(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLR method, of class BinaryTree.
     */
    @Test
    public void testAddLR() throws Exception {
        System.out.println("addLR");
        Object key = null;
        Object value = null;
        String dir = "";
        BinaryTree instance = new BinaryTree();
        instance.addLR(key, value, dir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class BinaryTree.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = null;
        BinaryTree instance = new BinaryTree();
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class BinaryTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object key = null;
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.find(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of member method, of class BinaryTree.
     */
    @Test
    public void testMember() {
        System.out.println("member");
        Object key = null;
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.member(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visit method, of class BinaryTree.
     */
    @Test
    public void testVisit() {
        System.out.println("visit");
        BinaryTree instance = new BinaryTree();
        instance.visit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sprout method, of class BinaryTree.
     */
    @Test
    public void testSprout() {
        System.out.println("sprout");
        Object key = null;
        Object value = null;
        BinaryTree instance = new BinaryTree();
        instance.sprout(key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
