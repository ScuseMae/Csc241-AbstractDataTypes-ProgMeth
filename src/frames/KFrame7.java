/*
 * Frame for GUI7 program.
 */
package src.frames;

import src.utilities.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Modeling the featured frame of the GUI
public class KFrame7 extends JFrame implements ActionListener
{
    JPanel reflector;
    JButton blueButton;
    JButton redButton;
    JButton greenButton;
    JButton yellowButton;
    JButton colorButton;
    JTextField input;
    
    public KFrame7(String title)
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
        //components for northern region
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        yellowButton = new JButton("Yellow");
        colorButton = new JButton("Color");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(blueButton);
        controlPanel.add(redButton);
        controlPanel.add(greenButton);
        controlPanel.add(yellowButton);
        controlPanel.add(colorButton);
        
        //components central region
        reflector = new JPanel();
        
        //components for southern region
        input = new JTextField();
        
        //establish the regions
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(reflector, BorderLayout.CENTER);
        contentPane.add(input, BorderLayout.SOUTH);
    }
    
    //Add the listeners to the frame
    private void addListeners()
    {
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        yellowButton.addActionListener(this);
        colorButton.addActionListener(this);
        input.addActionListener(this);
    }

    //This method serves to implement the ActionListener interface
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        if (event.getSource() instanceof JTextField)
        {
            input.setText("");
        }
        if (command.equalsIgnoreCase("Red"))
        {
            reflector.setBackground(Color.RED);
        }
        else if (command.equalsIgnoreCase("Yellow"))
        {
            reflector.setBackground(Color.YELLOW);
        }
        else if (command.equalsIgnoreCase("Blue"))
        {
            reflector.setBackground(Color.BLUE);
        }
        else if (command.equalsIgnoreCase("Green"))
        {
            reflector.setBackground(Color.GREEN);
        }
        else if (command.equalsIgnoreCase("Color"))
        {
            reflector.setBackground(Random.color());
        }
    }
}
