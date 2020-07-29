/*
 * BinaryTreeCreationException.java of the trees package
 */
package src.trees;

/**
 * Exception for a basic binary tree
 */
public class BinaryTreeCreationException extends Exception 
{
    
    public BinaryTreeCreationException()
    {
    }
    
    public BinaryTreeCreationException(String msg)
    {
        super(msg);
    }
}