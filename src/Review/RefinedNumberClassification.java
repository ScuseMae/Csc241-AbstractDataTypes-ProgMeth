/*
 * NumberClassification.java
 * 
 * This program generates 25 three digit random
 * numbers then prints, in turn, (1) all numbers
 * (2) numbers comprised of three odd digits (3)
 * numbers comprised of three even digits (4) numbers
 * with neither uniformly odd nor uniformly even digits 
 * (5) numbers with exactly two identical digits
 */

package src.Review;

import java.util.Random;

public class RefinedNumberClassification 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] numbers = getRandNumbers();
        displayAllNumbers(numbers);
        displayOddDigitNumbers(numbers);
    }

    private static int[] getRandNumbers() 
    {
        int[] numbers = new int[25];
        Random rand = new Random();
        for (int i = 1; i <= 25; i++)
        {
            numbers[i-1] = rand.nextInt(899) + 100;
        }
        return numbers;
    }

    private static void displayAllNumbers(int[] numbers) 
    {
        System.out.println("All Random Numbers ...");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }

    private static void displayOddDigitNumbers(int[] numbers) 
    {
        System.out.println("\n\nOdd Digit Numbers ...");
        for (int i = 0; i < numbers.length; i++)
        {
            String number = numbers[i] + " ";
            String ones = onesDigit(number);
            String tens = tensDigit(number);
            String hundreds = hundredsDigit(number);
            
            boolean digits = odd(ones) & odd(tens) & odd(hundreds);
            if (digits)
            {
                
            }
        }   
    }

    private static String onesDigit(String number) 
    {
        return number.substring(0,1);
    }

    private static String tensDigit(String number) 
    {
        return number.substring(1,2);
    }

    private static String hundredsDigit(String number) 
    {
        return number.substring(2,3);
    }

    private static boolean odd(String digit) 
    {
        //return "12345".indexOf(digit) >= 0;
        return "12345".contains(digit);
    }
    
} //End Class RefinedNumberClassification