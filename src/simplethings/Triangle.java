/*
 * A class which implements the TriangleADT interface. And also serves as a 
 * utility for the ArrayListPlay program.
 */
package src.simplethings;


public class Triangle implements TriangleADT
{
    //instance variables
    private final double sideA;
    private final double sideB;
    private final double sideC;
    
    
    /**
     * Constructor (Overloaded - All Sides Equal)
     * 
     * @param side
     */
    public Triangle(double side)
    {
        sideA = side;
        sideB = side;
        sideC = side;
    }
    
    /**
     * Constructor (Overloaded - All Sides Different)
     * 
     * @param a
     * @param b
     * @param c
     */
    public Triangle(double a, double b, double c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    /**
     * 
     * @return 
     */
    @Override
    public double perimeter() 
    {
        return sideA + sideB + sideC;
    }

    /**
     * 
     * @return 
     */
    @Override
    public double area() 
    {
        double s = 0.5 * (sideA + sideB + sideC);
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString()
    {
        return ("<Triangle with a = " + sideA + " b = " + sideB + " c = " + sideC + ">\n");
    }

    /**
     * 
     * @return 
     */
    @Override
    public String print() 
    {
        return toString();
    }
}
