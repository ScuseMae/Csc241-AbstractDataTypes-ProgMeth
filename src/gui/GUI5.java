/*
 * GUI5.java
 * 
 * Similar to the previous GUI4, except the central region is replaced
 * by a panel which reflects the color of the most recently selected button.
 */
package src.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI5 
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
        @Override
        public void run()
        {
            GUI5 gui = new GUI5();
        }
    }
    
    public GUI5()
    {
        KFrame frame = new KFrame("GUI 5");
    }
    
    //modeling the featured frame of the GUI
    public class KFrame extends JFrame implements ActionListener
    {
        private JButton blueButton;
        private JButton redButton;
        private JButton greenButton;
        private JButton yellowButton;
        private JPanel reflector;
        
        public KFrame(String title)
        {
            super(title);
            setSize(500,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addComponents(getContentPane());
            addListeners();
            setVisible(true);
        }
        
        private void addComponents(Container contentPane)
        {
            blueButton = new JButton("Blue");
            redButton = new JButton("Red");
            greenButton = new JButton("Green");
            yellowButton = new JButton("Yellow");
            reflector = new JPanel();
            contentPane.setLayout(new BorderLayout());
            contentPane.add(blueButton, BorderLayout.NORTH);
            contentPane.add(redButton, BorderLayout.SOUTH);
            contentPane.add(greenButton, BorderLayout.EAST);
            contentPane.add(yellowButton, BorderLayout.WEST);
            contentPane.add(reflector, BorderLayout.CENTER);
        }
        
        //Add the listeners to the frame
        private void addListeners()
        {
            blueButton.addActionListener(this);
            redButton.addActionListener(this);
            greenButton.addActionListener(this);
            yellowButton.addActionListener(this);
        }
        
        //this method serves to implement the ActionListener interface
        @Override
        public void actionPerformed(ActionEvent event)
        {
            String command = event.getActionCommand();
            if (command.equals("Red"))
            {
                reflector.setBackground(Color.RED);
            }
            else if (command.equals("Yellow"))
            {
                reflector.setBackground(Color.YELLOW);
            }
            else if (command.equals("Blue"))
            {
                reflector.setBackground(Color.BLUE);
            }
            else if (command.equals("Green"))
            {
                reflector.setBackground(Color.GREEN);
            }
        }
        
    }
}
