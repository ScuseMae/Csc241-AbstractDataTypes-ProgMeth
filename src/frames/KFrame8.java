/*
 * Frame for GUI8 program.
 */
package src.frames;

import src.utilities.QuoteBank;
import src.utilities.Random;
import src.utilities.WordBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Modeling the featured frame of the GUI
public class KFrame8 extends JFrame implements ActionListener
{
    JTextArea reflector;
    JButton pointButton;
    JButton lineButton;
    JButton wordButton;
    JButton quoteButton;
    JButton colorButton;
    JButton clearButton;
    JTextField input;
    
    public KFrame8(String title)
    {
        super(title);
        setSize(500,600);
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
        reflector.setLineWrap(true);
        reflector.setWrapStyleWord(true);
        
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
            randomPoint();
        }
        else if (command.equalsIgnoreCase("Line"))
        {
            randomLine();
        }
        else if (command.equalsIgnoreCase("Word"))
        {
            WordBank();
        }
        else if (command.equalsIgnoreCase("Quote"))
        {
            QuoteBank();
        }
        else if (command.equalsIgnoreCase("Color"))
        {
            reflector.setBackground(Random.color());
        }
        else if (command.equalsIgnoreCase("Clear"))
        {
            reflector.setText(null);
            reflector.setBackground(Color.WHITE);
        }
    }
    
    public void randomPoint()
    {
        Point point = Random.point(500, 600);
        Display(String.format("(%d,%d)", point.x, point.y));
    }
    
    public void randomLine()
    {
        Point line = Random.point(500, 600);
        int length = (int) Random.number(600);
        int degree = (int) Random.number(360);
        Display(String.format("(%d,%d) %d %d", line.x,line.y,length,degree));
    }
    
    public void WordBank()
    {
        WordBank words = new WordBank();
        String word = words.Choose();
        Display(word);
    }
    
    public void QuoteBank()
    {
        QuoteBank quotes = new QuoteBank();
        String quote = quotes.Choose();
        Display(quote);
    }

    private void Display(String format) 
    {
        reflector.append(format + "\n\n");
    }
}