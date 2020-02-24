/**
 * @author alyssacolella
 * tui91984@temple.edu
 * Actor class
 * This class includes an Actor constructor, getter methods, and a toString method that returns an Actor's relevant information
 */
public class Actor 
{
    //private data fields
    private String firstName;
    private String lastName;
    private String birthDate;
    private String birthCity;
    private String birthState;
    private String birthCountry;
    
    /**
     * Actor constructor
     * @param firstName actor's first name
     * @param lastName actor's last name
     * @param birthDate actors birthday
     * @param birthCity city actor was born in 
     * @param birthState state actor was born in 
     * @param birthCountry country actor was born in 
     */
    public Actor(String firstName, String lastName, String birthDate, String birthCity, String birthState, String birthCountry)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.birthState = birthState;
        this.birthCountry = birthCountry;
    }
    
    //getter methods
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getBirthDate()
    {
        return birthDate;
    }

    public String getBirthCity()       
    {
        return birthCity;
    }
    
    public String getBirthState()
    {
        return birthState;
    } 
    
    public String getBirthCountry()
    {
        return birthCountry;
    }   
         
    //toString method that returns an actor's information
    public String toString()
    {
        return firstName + " " + lastName + " | " + birthDate + " | " + birthCity + " " + birthState + " " + birthCountry;
    }   
}
