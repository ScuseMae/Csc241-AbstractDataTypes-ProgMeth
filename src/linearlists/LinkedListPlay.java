/*
 * This program involves the creation and manipulation of LinkedList Objects.
 * Different types of array list objects are featured.
 */
package src.linearlists;

import src.utilities.Random;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListPlay 
{
    public static void main(String[] args) 
    {
        //Part 1: creation of lists
        LinkedList animals = creatAnimalList();
        displayAnimals("\nThe Animal Names ...", animals);
        
        LinkedList reals = randomList(77);
        displayReals("\nThe Real Numbers ...", reals);
        
        //Part 2: Use of Lists
        LinkedList lengths = lengths(animals);
        displayLengths("\nThe Lengths of the Animal Names ...", lengths);
        
        LinkedList<String> reverseAnimals = reverse(animals);
        displayAnimals("\nThe Animal Names in Reverse Order ...", reverseAnimals);
        
        double minimum = minimum(reals);
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println("\nThe minimum number = " + format.format(minimum));
        displayReals("\nThe real numbers ... ", reals);
        
        LinkedList orderedList = sort(reals);
        displayReals("\nThe real numbers in ascending order ...", orderedList);
        displayReals("\nThe real numbers ...", reals);
    }

    private static LinkedList creatAnimalList() 
    {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("aardvark");
        animals.add("bear");
        animals.add("crocodile");
        animals.add("dove");
        animals.add("elephant");
        animals.add("finch");
        animals.add("giraffe");
        animals.add("hyena");
        animals.add("iguana");
        animals.add("jackalope");
        animals.add("bat");
        animals.add("walrus");
        animals.add("lobster");
        return animals;
    }

    private static void displayAnimals(String title, LinkedList animals) 
    {
        System.out.println(title);
        System.out.println(animals);
    }

    private static LinkedList randomList(int sizeOfList) 
    {
        LinkedList reals = new LinkedList();
        for (int x = 1; x <= sizeOfList; x++)
        {
            reals.add(Random.number(x));
        }
        return reals;
    }

    private static void displayReals(String title, LinkedList reals) 
    {
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println(title);
        System.out.println("[" + reals.size() + " numbers]");
        ListIterator iterator = reals.listIterator();
        int lineBreak = 0;
        while (iterator.hasNext()) 
        {
            System.out.print(fmt.format((double) iterator.next()));
            if (lineBreak++ % 10 == 0) 
            {
                System.out.println();
            }
        }   
        System.out.println();
    }

    private static LinkedList lengths(LinkedList<String> animals) 
    {
        LinkedList<Integer> lengths = new LinkedList();
        for (String s : animals)
        {
            lengths.add(s.length());
        }
        return lengths;
    }

    private static void displayLengths(String title, LinkedList lengths) 
    {
        System.out.println(title);
        System.out.println(lengths);
        System.out.println();
    }

    private static LinkedList reverse(LinkedList<String> animals) 
    {
        LinkedList<String> reverseAnimals = new LinkedList<>();
        for (String s : animals)
        {
            reverseAnimals.addFirst(s);
        }
        return reverseAnimals;
    }

    private static double minimum(LinkedList reals) 
    {
        ListIterator iterator = reals.listIterator();
        double min = Double.MAX_VALUE;
        while (iterator.hasNext()) 
        {
            double d = (double) iterator.next();
            if (d < min) 
            {
                min = d;
            }
        }
        return min;
    }

    private static LinkedList<Double> sort(LinkedList<Double> reals) 
    {
        LinkedList<Double> copy = new LinkedList<>();
        copy = (LinkedList) reals.clone();
        
        if (copy.isEmpty())
        {
            return copy;
        }
        
        double d = minimum(copy);
        copy.remove(d);
        copy = sort(copy);
        copy.addFirst(d);
        return copy;
    }    
}
