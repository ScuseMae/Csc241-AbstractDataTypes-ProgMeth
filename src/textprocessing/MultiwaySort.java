/*
 * This program serves as an opportunity to make use of queues in 
 * performing a multiway sort. More specifically, this program will read 
 * words from a disk file and display to the standard output stream the words 
 * by length in such a way that all words of the same length appear in 
 * increasing order of vowel count. 
 */
package src.textprocessing;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class MultiwaySort 
{
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = getSelectedFile();
        Scanner scan = new Scanner(file);
        ArrayList<String> words = copyFileToArray(scan);
        display("The Words In Initial Order...", words);
        
        ArrayList<LinkedList<String>> queues = establishQueues(findLargestVowelCount(words));
        passOneVowelCount(queues, words);
        displayQueues("Pass 1 By Vowel Count ...", queues);
        
        ArrayList<LinkedList<String>> queues2 = establishQueues(wordLength(words));
        passTwoWordLength(queues2, queues);
        displayQueues("Pass 2 By Word Length...", queues2);
    }
    
    private static File getSelectedFile() throws FileNotFoundException
    {
        String homeDir = System.getProperty("user.home");
        JFileChooser jfc = new JFileChooser(new File(homeDir));
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        Scanner scan = new Scanner(file);
        return file;
    }

    private static ArrayList<String> copyFileToArray(Scanner scan) 
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

    private static void display(String title, ArrayList<String> words) 
    {
        System.out.println(title);
        System.out.println();
        int lineBreak = 0;
        for (String s : words)
        {
            System.out.print(s + " ");
            lineBreak++;
            if (lineBreak % 10 == 0)
            {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    private static void displayQueues(String title, ArrayList<LinkedList<String>> queues)
    {
        System.out.println();
        System.out.println(title);
        int lineBreak = 0;
        for (LinkedList<String> list : queues) 
        {
            for (String word : list) 
            {
                if (lineBreak++ % 10 == 0) 
                {
                    System.out.println();
                }
                
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }

    private static ArrayList<LinkedList<String>> passOneVowelCount(ArrayList<LinkedList<String>> queues, ArrayList<String> words) 
    {
        //*Same thing as below..
        //for (String word : words)
        //{
        //    queues.get(vowelCount(word)).add(word);
        //}
        words.stream().forEach((word) -> {
            queues.get(vowelCount(word)).add(word);
        });
        return queues;
    }
    
    private static ArrayList<LinkedList<String>> establishQueues(int quantity)
    {
        ArrayList<LinkedList<String>> queues = new ArrayList<>();
        for (int i = 0; i < quantity; i++)
        {
            queues.add(new LinkedList<>());
        }
        return queues;
    }

    private static int vowelCount(String word) 
    {
        int vowelCount = 0;
        for (char l : word.toCharArray())
        {
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u')
            {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    
    private static int findLargestVowelCount(ArrayList<String> words)
    {
        int max = 0;
        for (String word : words) 
        {
            int vowelCount = vowelCount(word);
            if (vowelCount > max) 
            {
                max = vowelCount;
            }
        }
        return max + 1;
    }

    private static ArrayList<LinkedList<String>> passTwoWordLength(ArrayList<LinkedList<String>> queues2, ArrayList<LinkedList<String>> queues) 
    {
        queues.stream().forEach((words) -> {
            words.stream().forEach((word) -> {
                queues2.get(word.length()).add(word);
            });
        });
        return queues2;
    }

    private static int wordLength(ArrayList<String> words) 
    {
        int maxLength = 0;
        for (String word : words)
        {
             if (word.length() > maxLength)
             {
                 maxLength = word.length();
             }
        }
        return maxLength + 1;
    }
}
