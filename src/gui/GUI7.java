/*
 * As a continuation to past GUI programs and GUI6, this program (GUI7) is 
 * similar, except that the buttons are now placed in the northern region,
 * a text field is placed in the southern region, and the east and west regions
 * are eliminated. Actoin commands corresponding to the button names that are
 * typed into the text field are interpreted as though buttons were pressed. 
 * Additionally, random color functionality is added.
 */
package src.gui;

import src.frames.KFrame7;
import javax.swing.SwingUtilities;

public class GUI7 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }
    
    private static class ThreadForGUI implements Runnable
    {
        public void run()
        {
            GUI7 gui = new GUI7();
        }
    }
    
    public GUI7()
    {
        KFrame7 frame = new KFrame7("GUI 7");
    }
    
}
