/*
 * As a continuation to past GUI programs, GUI8P is similar, except that the 
 * central region is given a JTextArea in place of thr JPanel and command 
 * execution amounts to displaying the name of the action command in the text
 * ares -- and that the commands have changed.
 */
package src.gui;

import src.frames.KFrame8P;
import javax.swing.SwingUtilities;

public class GUI8P 
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
            GUI8P gui = new GUI8P();
        }
    }
    
    public GUI8P()
    {
        KFrame8P frame = new KFrame8P("GUI 8P");
    }
    
}
