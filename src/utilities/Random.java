/*
 * Utility class to generate random colors and points
 */
package src.utilities;

import java.awt.Color;
import java.awt.Point;


public class Random 
{
    private Random(){}
    
    //return random color
    public static Color color()
    {
        int rv = (int)(Math.random() * 256);
        int gv = (int)(Math.random() * 256);
        int bv = (int)(Math.random() * 256);
        return new Color(rv,gv,bv);
    }
    
    //return random point
    public static Point point(int x, int y)
    {
        int a = (int)(Math.random()* x);
        int b = (int)(Math.random()* y);
        return new Point(a,b);
    }
    
    //returns random number 
    public static double number(int x)
    {
        return (Math.random()* x);
    }
    
}