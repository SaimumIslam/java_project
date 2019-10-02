import java.util.*;
import java.io.Serializable;
import java.lang.*;

public class Item implements Serializable{
    protected String title;
    protected int playingTime;
    
    public Item(String theTitle)
    {title = theTitle;}

   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }
   public String getTitle()
   {
     return title;
   }

   public String  toString()
    {
        return title + " (" + playingTime + " mins)\n";
    }
}
