
import java.util.LinkedList;

/**
 * @author alyssacolella
 * tui91984@temple.edu
 * Movie class
 * This class includes a Movie constructor, getter methods, and a toString method that returns an movie's relevant information
 */
public class Movie 
{
    //private variables
    private String title;
    private String director;
    private String writer;
    private String yearReleased;
    private LinkedList <String> roles;
    private LinkedList <Actor> cast; 
    
    /**
     * A movie constructor
     * @param title movie title
     * @param director movie director
     * @param writer movie writer
     * @param yearReleased year movie was released
     * @param roles an array of roles in the movie
     * @param cast an array of cast members in the movie
     */
    public Movie(String title, String director, String writer, String yearReleased, LinkedList<String> roles, LinkedList<Actor> cast)
    {
        this.title = title;
        this.director = director;
        this.yearReleased = yearReleased;
        this.roles = roles;
        this.cast = cast;
    }    
    
    //getter methods
    public String getTitle()
    {
        return title;
    }
    
    public String getDirector()
    {
        return director;
    }
    
    public String getWriter()
    {
        return writer;
    }
    
    public String getYearReleased()
    {
        return yearReleased;
    }
    
    public LinkedList getRoles()
    {
        return roles;
    }
    
    public LinkedList getCast()
    {
        return cast;
    }
     
    //Override
    public String toString()
    {
        return title + " | " + "Director: " + director + " | Writer: " + writer + " | Year Released: " + yearReleased + " | Roles: " + roles + " | Cast: " + cast;
    }
}
