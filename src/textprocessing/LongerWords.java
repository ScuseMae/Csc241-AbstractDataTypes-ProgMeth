/*
 * A program designed to learn a bit of simple text processing and file 
 * processing. More specifically, this program reads words without punctuation 
 * from a disk file and writes the words which are longer than the average word 
 * length of the words in the file to the standard output stream. It will 
 * demonstrate twice, once with a poem and once with song lyrics.
 */
package src.textprocessing;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class LongerWords 
{
    
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
   
        throws FileNotFoundException
        {
            String homeDir = System.getProperty("user.home");
            System.out.println("Home Directory: " + homeDir);
            JFileChooser jfc = new JFileChooser(new File(homeDir));
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            Scanner scan = new Scanner(file);
            ArrayList<String> words = copy(scan);
            displayLongerWords(words);
        }

    private static ArrayList<String> copy(Scanner scan) 
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
    
    private static double averageWordLength(ArrayList<String> words)
    {
        int sum = 0;
        sum = words.stream().map((s) -> s.length()).reduce(sum, Integer::sum);
        double average = (double) sum / (double) words.size();
        System.out.println("\nThe average word length: " + average);
        return average;
    }
    
    private static void displayLongerWords(ArrayList<String> words)
    {
        double avg = averageWordLength(words);
        System.out.println("\nThe Longer Words ... ");
        words.stream().filter((s) -> (s.length() > avg)).forEach((s) -> {
            System.out.println(s);
        });
        System.out.println();
    }
    
    
}
