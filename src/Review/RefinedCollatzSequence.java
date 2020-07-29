/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Review;

import java.util.Scanner;

public class RefinedCollatzSequence 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int numIn = getNumber();
        getCollatzSequence(numIn);
    }

    private static int getNumber() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int numIn = scan.nextInt();
        return numIn;
    }
    
    private static void getCollatzSequence(int numIn)
    {
        int numsPerLine = 0;
        
        while (numIn > 1)
        { 
            numsPerLine += 1; 
            
            if (numIn % 2 == 0)
            {
                numIn = (numIn / 2);
            }
            else
            {
                numIn = (numIn * 3 + 1);
            }
            
            System.out.print(numIn + " ");
            
            if (numsPerLine == 10)
            {
                System.out.println();
                numsPerLine -= 10;
            }
            
        }
    }
    
} //End Class CollatzSequence
