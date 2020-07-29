/*
 * Frame for GUI8P program.
 */
package src.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Modeling the featured frame of the GUI
public class KFrame8P extends JFrame implements ActionListener
{
    JTextArea reflector;
    JButton pointButton;
    JButton lineButton;
    JButton wordButton;
    JButton quoteButton;
    JButton colorButton;
    JButton clearButton;
    JTextField input;
    
    public KFrame8P(String title)
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
        pointButton = new JButton("Point");
        lineButton = new JButton("Line");
        wordButton = new JButton("Word");
        quoteButton = new JButton("Quote");
        colorButton = new JButton("Color");
        clearButton = new JButton("Clear");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(pointButton);
        controlPanel.add(lineButton);
        controlPanel.add(wordButton);
        controlPanel.add(quoteButton);
        controlPanel.add(colorButton);
        controlPanel.add(clearButton);
        
        //components central region
        reflector = new JTextArea();
        
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
        pointButton.addActionListener(this);
        lineButton.addActionListener(this);
        wordButton.addActionListener(this);
        quoteButton.addActionListener(this);
        colorButton.addActionListener(this);
        clearButton.addActionListener(this);
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
        if (command.equalsIgnoreCase("Point"))
        {
            reflector.append("POINT\n");
        }
        else if (command.equalsIgnoreCase("Line"))
        {
            reflector.append("LINE\n");
        }
        else if (command.equalsIgnoreCase("Word"))
        {
            reflector.append("WORD\n");
        }
        else if (command.equalsIgnoreCase("Quote"))
        {
            reflector.append("QUOTE\n");
        }
        else if (command.equalsIgnoreCase("Color"))
        {
            reflector.append("COLOR\n");
        }
        else if (command.equalsIgnoreCase("Clear"))
        {
            reflector.append("CLEAR\n");
        }
    }
}