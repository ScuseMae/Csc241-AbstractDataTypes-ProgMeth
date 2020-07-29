/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Review;

import java.util.Scanner;

public class RefinedLongestWord 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String string = getString();
        System.out.println("Your sentence: " + string);
        getLongestWord(string);
    }

    private static String getString() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a punctuation free sentence: ");
        String string = scan.nextLine();
        return string;
    }

    private static void getLongestWord(String string) 
    {
        String word = " ", longWord = " ";
        int currentWordLength, max = 0;
	char car;

        string = string + " ";
        for (int i = 0; i < string.length(); i++) 
        {
            car = string.charAt(i);
            currentWordLength = word.length();
              
            if (car != ' ') 
	    {
	        word = word + car;
	    } 
	    else 
	    {
	        if (currentWordLength > max) 
	        {
	            max = currentWordLength;
                    longWord = word;
	        }
	    word = " ";
	    }
        }
        
	System.out.println("Longest Word:" + longWord);  
    }
    
} //End RefinedLongestWord
