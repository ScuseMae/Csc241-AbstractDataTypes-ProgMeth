/*
 * Continuing with GUI's, GUI6 is similar to GUI5, except with a different 
 * structure. The Frame class has been moved to a Frame Package.
 */
package src.gui;

import src.frames.KFrame6;
import javax.swing.SwingUtilities;

public class GUI6 
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
            GUI6 gui = new GUI6();
        }
    }
    
    public GUI6()
    {
        KFrame6 frame = new KFrame6("GUI 6");
    }
    
}
    
