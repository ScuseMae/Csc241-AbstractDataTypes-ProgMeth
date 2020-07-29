/*
 * Utility class to aid in the functionality of the GUI8 program. More
 * specifically - to choose a random word and its definition to display on GUI8.
 */
package src.utilities;


public class WordBank 
{
    private final String[] words = new String[10];;
    
    public WordBank()
    {
        words[0] = "Ambiguity :: Life Itself";
        words[1] = "Music :: euphoria";
        words[2] = "Life :: Who Knows...";
        words[3] = "Computer :: A World At Your Fingertips";
        words[4] = "Movies :: A Break From Reality";
        words[5] = "Java :: A Cup o' Joe";
        words[6] = "Anencephalous :: How I Sometimes Feel";
        words[7] = "Crapulence :: Something College Students Know Too Well";
        words[8] = "Time :: My Worst Enemy";
        words[9] = "Defenestrate :: To Throw Out Of A Window";
    }
    
    public String Choose()
    {
        int choose = (int)(Math.random() * 10);
        return words[choose];
    }
}
