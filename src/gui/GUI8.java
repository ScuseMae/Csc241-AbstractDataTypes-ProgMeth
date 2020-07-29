/*
 * GUI8 is like GUI8P except the "stubs" are replaced by real functionality.
 */
package src.gui;

import src.frames.KFrame8;
import javax.swing.SwingUtilities;

public class GUI8 
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
            GUI8 gui = new GUI8();
        }
    }
    
    public GUI8()
    {
        KFrame8 frame = new KFrame8("GUI 8");
    }
    
}
