/*
 * BinaryTreeTester.java of testers package
 */
package src.testers;

import src.trees.BinaryTreeCreationException;
import src.trees.BinaryTree;


/**
 * Tester for the BinaryTree data type
 */
public class BinaryTreeTester 
{
    public static void main(String[] args) throws BinaryTreeCreationException
    {
        testLR();   //test deterministic insertion +
        testST();   //test bst insertion +
        testND();   //test non-deterministic insertion +
        testND();   //test non-deterministic insertion 
        SimpleLRTest();
    }
    
    private static void testLR()
    {
        System.out.println("Test LR ...");
        BinaryTree<String,String> t = new BinaryTree<>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the tree directionally ...");
        
        try
        {
            t.addLR("Snow Leopard", null, "");
            t.addLR("Jaguar", null, "r");
            t.addLR("Crocodile", null, "l");
            t.addLR("Eagle", null, "rr");
            t.addLR("Gorilla", null, "ll");
            t.addLR("Polar Bear", null, "llr");
            t.addLR("Slow Loris", null, "rrl");
            t.addLR("Cheetah", null, "lr");
            t.addLR("Hippopotamus", null, "llrr");
            t.addLR("Dolphin", null, "rrll");
        }
        catch (BinaryTreeCreationException ex)
        {
        }
        System.out.println(">>> PRE-ORDER");
        t.preorder();
        System.out.println(">>> IN-ORDER");
        t.inorder();
        System.out.println(">>> POST-ORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height() + "\n");
    }
    
    private static void testST() throws BinaryTreeCreationException
    {
        System.out.println("Test BST ...");
        BinaryTree<String,String> t = new BinaryTree<>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the binary search tree ... ");
        t.addST("Snow Leopard", null);
        t.addST("Jaguar", null);
        t.addST("Crocodile", null);
        t.addST("Eagle", null);
        t.addST("Gorilla", null);
        t.addST("Polar Bear", null);
        t.addST("Slow Loris", null);
        t.addST("Cheetah", null);
        t.addST("Hippopotamus", null);
        t.addST("Dolphin", null);
        System.out.println(">>> PRE-ORDER");
        t.preorder();
        System.out.println(">>> IN-ORDER");
        t.inorder();
        System.out.println(">>> POST-ORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height() + "\n");
    }
    
    private static void testND()
    {
        System.out.println("Test ND ...");
        BinaryTree<String, String> t = new BinaryTree<>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the tree non-deterministically ...");
        t.addND("Snow Leopard", null);
        t.addND("Jaguar", null);
        t.addND("Crocodile", null);
        t.addND("Eagle", null);
        t.addND("Gorilla", null);
        t.addND("Polar Bear", null);
        t.addND("Slow Loris", null);
        t.addND("Cheetah", null);
        t.addND("Hippopotamus", null);
        t.addND("Dolphin", null);
        System.out.println(">>> PRE-ORDER");
        t.preorder();
        System.out.println(">>> IN-ORDER");
        t.inorder();
        System.out.println(">>> POST-ORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height() + "\n");
    }
    
    //Simple Re-Tests
    
    private static void SimpleLRTest()
    {
        System.out.println("Simple LR Test ...");
        BinaryTree<String,String> t = new BinaryTree<>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding elements to the tree directionally ...");
        
        try
        {
            t.addLR("1", null, "");
            t.addLR("2", null, "r");
            t.addLR("3", null, "l");
            t.addLR("4", null, "rr");
            t.addLR("5", null, "ll");
            t.addLR("6", null, "llr");
            t.addLR("7", null, "rrl");
            t.addLR("8", null, "lr");
            t.addLR("9", null, "llrr");
            t.addLR("10", null, "rrll");
        }
        catch (BinaryTreeCreationException ex)
        {
        }
        System.out.println(">>> PRE-ORDER");
        t.preorder();
        System.out.println(">>> IN-ORDER");
        t.inorder();
        System.out.println(">>> POST-ORDER");
        t.postorder();
        System.out.println(">>> HEIGHT = " + t.height() + "\n");
    }
}
