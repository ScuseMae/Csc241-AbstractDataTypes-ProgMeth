/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Review;

import java.util.Scanner;

public class RefinedLongerWords 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String string = getString();
        System.out.println("Your inputed sentence: " + string);
        String[] stringList = string.split(" ");
        double avgLength = getAverageWordLength(stringList);
        System.out.println("Average word length: " + avgLength);
        displayLongerWords(stringList, avgLength);
    }

    private static String getString() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a punctuation free sentence: ");
        String string = scan.nextLine();
        return string;
    }

    private static double getAverageWordLength(String[] stringList) 
    {
        int wordTotal = 0;
        double avgLength = 0;
        
        for (String a : stringList)
        {
            wordTotal += a.length();
        }
        
        avgLength = wordTotal / stringList.length;
        return avgLength;
    }

    private static void displayLongerWords(String[] stringList, double avgLength) 
    {
        String longerWords = "";
        
        for (String a : stringList)
        {
            if (a.length() > avgLength)
            {
                longerWords += "\n" + a;
            }
        }
        
        System.out.print("The words longer than the average word length "
                + "are: " + longerWords + "\n");
    }
    
} //End RefinedLongerWords
