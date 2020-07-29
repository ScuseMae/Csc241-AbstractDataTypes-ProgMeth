/*
 * A program to test the Triangle class functionality.
 */
package src.testers;
import src.simplethings.Triangle;


public class TriangleTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Triangle edward = new Triangle(10);
        System.out.println(edward.toString());
        
        Triangle iris = new Triangle(3, 4, 5);
        System.out.println(iris.toString());
        
        System.out.println("Perimeter of edward: " + edward.perimeter());
        System.out.println("Perimeter of iris: " + iris.perimeter());
        System.out.println("Area of edward: " + edward.area());
        System.out.println("Area of iris: " + iris.area());


    }
    
}
