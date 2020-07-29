/*
 * Specifications of a triangle abstract data type.
 */
package src.simplethings;


public interface TriangleADT extends ADT
{
    public double perimeter();
    public double area();
    @Override
    public String toString();
}
