/*
 * Utility class to aid in the functionality of the GUI8 program. More
 * specifically - to choose a random quote to display on GUI8.
 */
package src.utilities;


public class QuoteBank 
{
    private final String[] quotes;
    
    public QuoteBank()
    {
        quotes = new String[10];
        quotes[0] = "At The End Of The Road, You'll Find What You've Been "
                + "Longing For";
        quotes[1] = "I Don't Know How To Say This, My Thoughts Have Just "
                + "Run Out";
        quotes[2] = "If you are depressed you are living in the past. If "
                + "you are anxious you are living in the future. If you are "
                + "at peace you are living in the present.";
        quotes[3] = "Be yourself, everyone else if taken.";
        quotes[4] = "I hope you live a life you're proud of. If you find that"
                + "you're not, I hope you have the strength to start all over"
                + "again.";
        quotes[5] = "The greatest mistake you can make in life is to be "
                + "continually fearing you will make one.";
        quotes[6] = "Someday, somewhere - anywhere, unfailingly, you'll find"
                + "yourself, and that, and only that, can be the happiest or "
                + "bitterest hour of your life.";
        quotes[7] = "You have to do what is right for you. No one else is "
                + "walking in your shoes.";
        quotes[8] = "Don't be too timid and squeamish about your actions. All "
                + "life is an experiment. The more experiments you make the "
                + "better.";
        quotes[9] = "Nothing will ruin your twenties more than thinking you "
                + "should already have your life together. ";
    }
    
    public String Choose()
    {
        int choose = (int)(Math.random() * 10);
        return quotes[choose];
    }
    
}
