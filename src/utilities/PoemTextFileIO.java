/*
 * This program writes a text file containing a poem that will be used by the
 * LongerWords.java program which will read the words from this file and write 
 * the words which are longer than the average word length.
 */
package src.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PoemTextFileIO 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        File file = new File("PoemTextFile.txt");
        outputPoem(file);
    }

    private static void outputPoem(File file) throws FileNotFoundException 
    {
        try (PrintWriter output = new PrintWriter(file)) {
            output.println("The Paradoxical Commandments\n");
            output.println("People are illogical unreasonable and self centered");
            output.println("Love them anyway\n");
            output.println("If you do good people will accuse you of selfish "
                    + "ulterior motives");
            output.println("Do good anyway\n");
            output.println("If you are successful you will win false friends "
                    + "and true enemies");
            output.println("Succeed anyway\n");
            output.println("The good you do today will be forgotten tomorrow");
            output.println("Do good anyway\n");
            output.println("Honesty and frankness make you vulnerable");
            output.println("Be honest and frank anyway\n");
            output.println("The biggest men and women with the biggest ideas "
                    + "can be shot down by \nthe smallest men and women with the "
                    + "smallest minds");
            output.println("Think big anyway\n");
            output.println("People favor underdogs but follow only top dogs");
            output.println("Fight for a few underdogs anyway\n");
            output.println("What you spend years building may be destroyed"
                    + " overnight");
            output.println("Build anyway\n");
            output.println("People really need help but may attack you if you"
                    + "do help them");
            output.println("Help people anyway\n");
            output.println("Give the world the best you have and you will get "
                    + "kicked in the teeth");
            output.println("Give the world the best you have anyway");
            output.println("\nBy Kent M Keith");
        }
    }
    
}
