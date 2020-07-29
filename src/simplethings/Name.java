/*
 * A class which implements the NameADT interface. And also serves as a utility
 * for the ArrayListPlay program.
 */
package src.simplethings;


public class Name implements NameADT
{
    //instance variables
    private final String first;
    private final String last;
    

    /**
     * Constructor
     * 
     * @param firstName
     * @param lastName
     */
    public Name(String firstName, String lastName)
    {
        first = firstName;
        last = lastName;
    }

    /**
     *
     * @return
     */
    @Override
    public String first() 
    {
        return first;
    }

    /**
     *
     * @return
     */
    @Override
    public String last() 
    {
        return last;
    }

    /**
     *
     * @return
     */
    @Override
    public String natural() 
    {
        return first + " " + last;
    }

    /**
     *
     * @return
     */
    @Override
    public String formal() 
    {
        return last + ", " + first;
    }

    /**
     *
     * @param fi
     * @param li
     * @return
     */
    @Override
    public boolean check(String fi, String li) 
    {
        String firstInitial = first.substring(0,1);
        String lastInitial = last.substring(0,1);
       
        return (fi.equalsIgnoreCase(firstInitial) && li.equalsIgnoreCase(lastInitial));
    }

    /**
     *
     * @return
     */
    @Override
    public String print() 
    {
        return natural();
    }
    
}
