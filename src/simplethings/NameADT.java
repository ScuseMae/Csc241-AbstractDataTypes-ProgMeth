/*
 * Specification of a Name abstract data type.
 */
package src.simplethings;


public interface NameADT extends ADT
{
    public String first();
    public String last();
    public String natural();
    public String formal();
    public boolean check(String fi, String li);
}


