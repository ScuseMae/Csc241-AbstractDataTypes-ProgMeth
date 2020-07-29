/*
 * This program uses the BinaryTree class from the BinaryTree package to store 
 * word/frequency pairs in a BinaryTree object. More-so, prompt the user for a 
 * file name containing punctuation free song lyrics, then computes the 
 * frequency of occurrence of each word in the file, then displays the 
 * resulting words and their frequency, in alphabetical order, to the standard
 * output stream.
 */
package src.trees;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class TreeFrequencyCounter 
{
    public static void main(String[] args) throws FileNotFoundException, BinaryTreeCreationException 
    {
        File file = promptUser();
        Scanner scan = new Scanner(file);
        ArrayList<String> words = copyFile(scan);
        BinaryTree<String,Integer> trees = newBinaryTree(words); 
        displayTrees(trees);
    }

    private static File promptUser() throws FileNotFoundException
    {
        String homeDir = System.getProperty("user.home");
        JFileChooser jfc = new JFileChooser(new File(homeDir));
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        Scanner scan = new Scanner(file);
        return file;
    }

    private static ArrayList<String> copyFile(Scanner scan) throws FileNotFoundException 
    {
        ArrayList<String> words = new ArrayList<>();
        int sum = 0;
        
        while (scan.hasNext())
        {
            String token = scan.next().toLowerCase();
            words.add(token);
        }
        return words;
    }

    private static BinaryTree<String, Integer> newBinaryTree(ArrayList<String> words) throws BinaryTreeCreationException 
    {
        BinaryTree<String,Integer> trees = new BinaryTree<>();
        
        for (String s : words)
        {
            if (! trees.member(s))
            {
                trees.addST(s, 1);
            }
            else
            {
                BinaryTree<String,Integer> element = trees.find(s);
                element.setValue(element.value() + 1);
            }
        }
        return trees;
    }

    private static void displayTrees(BinaryTree<String, Integer> trees) 
    {
        System.out.println(">>> Frequency of each word within song ... ");
        trees.inorder();
    }
    
}
