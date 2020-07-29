/*
 * This program writes a text file containing a song that will be used by the
 * LongerWords.java program which will read the words from this file and write 
 * the words which are longer than the average word length.
 */
package src.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class SongTextFileIO 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("SongTextFile.txt");
        outputLyrics(file);
    }

    private static void outputLyrics(File file) throws FileNotFoundException
    {
        try (PrintWriter output = new PrintWriter(file)) {
            output.println("Casting Such A Thin Shadow\n");
            output.println("Speak up");
            output.println("My ears are growing weary");
            output.println("I will sing this to the end");
            output.println("And watch the waves crash over me");
            output.println("Not too much to overcome");
            output.println("With enough time to turn it all around");
            output.println("In a picture perfect scenery");
            output.println("I have become a stick figure illustration");
            output.println("My eyes roll back and focus on what is ahead");
            output.println("I can still stand if you lend a hand to brace me");
            output.println("I will take this on my own");
            output.println("I will take this on");
            output.println("\nBy Underoath");
        }
    } 
}
