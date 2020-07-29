/*
 * This program involves the creation and manipulation of ArrayList objects.
 * Different types of array list objects are featured.
 */
package src.linearlists;

import src.simplethings.Name;
import src.simplethings.Triangle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPlay 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Part 1: creation of lists
        ArrayList<String> songs = CreateSongList();
        display("The songs... ", songs);
        ArrayList<Name> actors = CreateActorList();
        display("The actors... ", actors);
        ArrayList<Triangle> triangles = CreateTriangleList();
        display("The triangles... ", triangles);
        
        //Part 2: use of lists
        displayLengths(songs);
        displayInitials(actors);
        displayAreas(triangles);
    }

    private static ArrayList<String> CreateSongList() 
    {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Happiness By The Kilowatt");
        songs.add("The Created Void");
        songs.add("An Autobiography In Vivid Color");
        songs.add("Things Too Visable To See");
        songs.add("Everything As Planned");
        songs.add("Understanding What We've Grown To Be");
        songs.add("To Whom It May Concern");
        songs.add("Casting Such A Thin Shadow");
        
        return songs;
    }
    
    private static ArrayList<Name> CreateActorList()
    {
        ArrayList<Name> actors = new ArrayList<>();
        actors.add(new Name("Steve", "Carell"));
        actors.add(new Name("Seth", "Rogen"));
        actors.add(new Name("Tom", "Hardy"));
        actors.add(new Name("Ben", "Stiller"));
        actors.add(new Name("Denzel", "Washington"));
        actors.add(new Name("Christopher", "Walken"));
        actors.add(new Name("T.J,", "Miller"));
        
        return actors;   
    }

    private static ArrayList<Triangle> CreateTriangleList() 
    {
        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(2,3,4));
        triangles.add(new Triangle(4,5,6));
        triangles.add(new Triangle(6,7,8));
        triangles.add(new Triangle(8,9,10));
        triangles.add(new Triangle(10,11,12));
        triangles.add(new Triangle(12,13,14));
        
        return triangles;
    }
    
    private static void display(String title, ArrayList list) 
    {
        System.out.println(title);
        Iterator i = list.iterator();
        while(i.hasNext()) 
        {
            Object o = i.next();   
            if (o instanceof Name)
            {
                System.out.println(((Name) o).formal());
            } 
            else 
            {
                System.out.println(o.toString());
            }
        }
        System.out.println("");
    }

    private static void displayLengths(ArrayList songs) 
    {
        System.out.println("The song title lengths ...");
        for (int i = 0; i < songs.size(); i++)
        {
            String str = (String) songs.get(i);
            int length = str.length();
            System.out.println(length);
        }
        
    }

    private static void displayInitials(ArrayList<Name> actors) 
    {
        System.out.println("\nThe initials ...");
        String fi,li;
        for (int i = 0; i < actors.size(); i++)
        {
            List<Name> list = actors.subList(0, 1);
            Name n = actors.get(i);
            String first = n.first();
            fi = first.substring(0, 1);
            li = actors.get(i).last().substring(0, 1);
            System.out.println(fi+li);
        }
    }

    private static void displayAreas(ArrayList<Triangle> triangles) 
    {
        System.out.println("\nThe areas ...");
        triangles.stream().forEach((triangle) -> {
            System.out.println(triangle.area());
        });
    }
    
}
