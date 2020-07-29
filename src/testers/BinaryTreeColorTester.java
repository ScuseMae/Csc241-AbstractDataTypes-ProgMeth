/*
 * BinaryTreeColorTester.java of testers package
 * Similar to original BinaryTreeTester, but changes it a bit using colors
 * instead of animals.
 */
package src.testers;

import src.trees.BinaryTree;
import src.trees.BinaryTreeCreationException;


public class BinaryTreeColorTester 
{
    public static void main(String[] args) throws BinaryTreeCreationException 
    {
        testLR();   //test deterministic insertion +
        testST();   //test bst insertion +
        testND();   //test non-deterministic insertion +
        testND();   //test non-deterministic insertion 
    }

    private static void testLR() 
    {
        System.out.println("Test LR ...");
        BinaryTree<String,String> tree = new BinaryTree<>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding color elements to the tree directionally ...");
        try
        {
            tree.addLR("Red", null, "");
            tree.addLR("Blue", null, "l");
            tree.addLR("Green", null, "lr");
            tree.addLR("Black", null, "ll");
            tree.addLR("White", null, "r");
            tree.addLR("Purple", null, "lrr");
            tree.addLR("Yellow", null, "rr");
            tree.addLR("Orange", null, "lrrl");
            tree.addLR("Indigo", null, "lrrll");
            tree.addLR("Aqua", null, "lll");
            tree.addLR("Tangerine", null, "rl");
            tree.addLR("Pink", null, "lrrlr");
            tree.addLR("Ghostwhite", null, "lrl");
            tree.addLR("Gray", null, "lrlr");
            tree.addLR("Brown", null, "lrll");
            tree.addLR("Gainsboro", null, "lrllr");
        }
        catch (BinaryTreeCreationException ex)
        {
            ex.printStackTrace();
        }
        
        System.out.println(">>> PRE-ORDER:");
        tree.preorder();
        System.out.println(">>> IN-ORDER:");
        tree.inorder();
        System.out.println(">>> POST-ORDER:");
        tree.postorder();
        System.out.println(">>> HEIGHT: " + tree.height() + "\n");
    }

    private static void testST() 
    {
        System.out.println("Test BST ...");
        BinaryTree<String,String> tree = new BinaryTree<String,String>();
        System.out.println(">>> Creating empty tree.");
        System.out.println(">>> Adding color elements to the binary search tree non-deterministically ... ");
        try
        {
            tree.addST("Red", null);
            tree.addST("Blue", null);
            tree.addST("Green", null);
            tree.addST("Black", null);
            tree.addST("White", null);
            tree.addST("Purple", null);
            tree.addST("Yellow", null);
            tree.addST("Orange", null);
            tree.addST("Indigo", null);
            tree.addST("Aqua", null);
            tree.addST("Tangerine", null);
            tree.addST("Pink", null);
            tree.addST("Ghostwhite", null);
            tree.addST("Gray", null);
            tree.addST("Brown", null);
            tree.addST("Gainsboro", null);
        }
        catch (BinaryTreeCreationException ex)
        {
            ex.printStackTrace();
        }
        
        System.out.println(">>> PRE-ORDER:");
        tree.preorder();
        System.out.println(">>> IN-ORDER:");
        tree.inorder();
        System.out.println(">>> POST-ORDER:");
        tree.postorder();
        System.out.println(">>> HEIGHT: " + tree.height() + "\n");
    }

    private static void testND() throws BinaryTreeCreationException
    {
        System.out.println("Test ND ...");
        BinaryTree<String,String> tree = new BinaryTree<>();
        System.out.println(">>> Creating empty tree");
        System.out.println(">>> Adding color elements to the binary search tree ...");
        tree.addND("Red", null);
        tree.addND("Blue", null);
        tree.addND("Green", null);
        tree.addND("Black", null);
        tree.addND("White", null);
        tree.addND("Purple", null);
        tree.addND("Yellow", null);
        tree.addND("Orange", null);
        tree.addND("Indigo", null);
        tree.addND("Aqua", null);
        tree.addND("Tangerine", null);
        tree.addND("Pink", null);
        tree.addND("Ghostwhite", null);
        tree.addND("Gray", null);
        tree.addND("Brown", null);
        tree.addND("Gainsboro", null);
        
        System.out.println(">>> PRE-ORDER:");
        tree.preorder();
        System.out.println(">>> IN-ORDER:");
        tree.inorder();
        System.out.println(">>> POST-ORDER:");
        tree.postorder();
        System.out.println(">>> HEIGHT: " + tree.height() + "\n");
    }
}
