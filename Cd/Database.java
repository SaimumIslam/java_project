import java.util.*;
import java.io.Serializable;

public class Database implements Serializable{
    private ArrayList<CD> cdItems;
    private ArrayList<Video> videoItems;


   public Database()  {
        cdItems = new ArrayList<CD>();
        videoItems = new ArrayList<Video>();
    }   
   
   public void addCDItem(CD theItem)  {
        cdItems.add(theItem);
    }
   public void addVideoItem(Video theItem)  {
        videoItems.add(theItem);
    }
   
   public String getCDs() {
     String result = "";
        for(Iterator iter = cdItems.iterator(); iter.hasNext(); )  {
            CD item = (CD)iter.next();
            result += item.toString();
        }
        return result;
    }
   
   
   public String getVideos() {
     String result = "";
          for(Iterator iter = videoItems.iterator(); iter.hasNext(); )  {
            Video item = (Video)iter.next();
            result += item.toString();
        }
    return result;
    }
   public String toString() {
   String result = "";
        for(Iterator iter = cdItems.iterator(); iter.hasNext(); )  {
            CD item = (CD)iter.next();
            result += item.toString();
        }
        for(Iterator iter = videoItems.iterator(); iter.hasNext(); )  {
            Video item = (Video)iter.next();
            result += item.toString();
        }
    return result;
    }
}
