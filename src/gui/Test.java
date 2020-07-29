/*
 * As a continuation to past GUI programs and GUI6, this program (GUI7) is 
 * similar, except that the buttons are now placed in the northern region,
 * a text field is placed in the southern region, and the east and west regions
 * are eliminated. Actoin commands corresponding to the button names that are
 * typed into the text field are interpreted as though buttons were pressed. 
 * Additionally, random color functionality is added.
 */
package src.gui;

import src.frames.TestFrame;
import javax.swing.SwingUtilities;

public class Test 
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
            Test gui = new Test();
        }
    }
    
    public Test()
    {
        TestFrame frame = new TestFrame("Test");
    }
    
}
