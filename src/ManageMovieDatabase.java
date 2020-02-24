
import java.util.ArrayList;
import java.util.LinkedList;
        
import java.util.Scanner;

/**
 * @author alyssacolella
 * tui91984@temple.edu
 * ManageMovieDatabase class
 * This class includes methods to create a database, see whats in it, and add to it, as well as a main method where a database is created and the aforementioned methods are tested
 */
public class ManageMovieDatabase 
{
    //creates a database with some actors and movies to start out with 
    private static void createDatabase(LinkedList <Actor> actors, LinkedList <Movie> movies)
    {
        //actors
        Actor christianBale = new Actor("Christian", "Bale", "January 30, 1974", "Haverfordwest", "", "United Kingdom");
        Actor heathLedger = new Actor("Heath", "Ledger", "April 4, 1979", "Perth", "", "Australia");
        Actor aaronEckhart = new Actor("Aaron", "Eckhart", "March 12, 1968", "Cupertino", "California", "USA");
        Actor michaelCaine = new Actor("Michael", "Caine", "March 14, 1993", "Rotherhithe", "", "United Kingdom");
        Actor maggieGyllenhaal = new Actor("Maggie", "Gyllenhaal", "November 16, 1977", "New York", "New York", "USA");
        Actor robertDowneyJr = new Actor("Robert", " Downey Jr", "April 4, 1965", "Manhattan", "New York", "USA");
        Actor chrisEvans = new Actor("Chris", "Evans", "June 13, 1981", "Boston", "Massachusetts", "USA");
        Actor markRuffalo = new Actor("Mark", "Ruffalo", "November 22, 1967", "Kenosha", "Wisconsin", "USA");
        Actor chrisHemsworth = new Actor("Chris", "Hemsworth", "August 11, 1983", "Melbourne", "", "Australia");
        Actor scarlettJohansson = new Actor("Scarlett", "Johansson", "November 22, 1984", "Manhattan", "New York", "USA");
        Actor davidHarbour = new Actor("David", "Harbour", "April 10, 1975", "New York", "New York", "USA");
        Actor florencePugh = new Actor("Florence", "Pugh", "January 3, 1996", "Oxford", "", "United Kingdom");
        Actor rachelWeisz = new Actor("Rachel", "Weisz", "March 7, 1970", "Westminster", "London", "United Kingdom");
        Actor liamNeeson = new Actor("Liam", "Neeson", "June 7, 1952,", "Ballymena", "", "United Kingdom");
        Actor katieHolmes = new Actor("Katie", "Holmes", "December 18, 1978", "Toledo", "Ohio", "USA");
        Actor garyOldman = new Actor("Gary", "Oldman", "March 21, 1958", "New Cross", "London", "England");
        
        //add actors to linked list 
        actors.add(christianBale);
        actors.add(heathLedger);
        actors.add(aaronEckhart);
        actors.add(michaelCaine);
        actors.add(maggieGyllenhaal);
        actors.add(robertDowneyJr);
        actors.add(chrisEvans);
        actors.add(markRuffalo);
        actors.add(chrisHemsworth);
        actors.add(scarlettJohansson);
        actors.add(davidHarbour);
        actors.add(florencePugh);
        actors.add(rachelWeisz);
        actors.add(liamNeeson);
        actors.add(garyOldman);
        
        
        //Dark Knight
        LinkedList <String> darkKnightRoles = new LinkedList<>();
        darkKnightRoles.add("Bruce Wayne");
        darkKnightRoles.add("Joker");
        darkKnightRoles.add("Harvey Dent");
        darkKnightRoles.add("Alfred");
        darkKnightRoles.add("Rachel");
        LinkedList <Actor> darkKnightCast = new LinkedList<>();
        darkKnightCast.add(christianBale);
        darkKnightCast.add(heathLedger);
        darkKnightCast.add(aaronEckhart);
        darkKnightCast.add(michaelCaine);
        darkKnightCast.add(maggieGyllenhaal);
        
        Movie darkKnight = new Movie("The Dark Knight", "Christopher Nolan", "Jonathon Nolan", "2008", darkKnightRoles, darkKnightCast); //add movie to linked list
        movies.add(darkKnight);
        
        //Avengers Endgame
        LinkedList<String> avengersEndgameRoles = new LinkedList<>();
        avengersEndgameRoles.add("Tony Stark");
        avengersEndgameRoles.add("Steve Rogers");
        avengersEndgameRoles.add("Bruce Banner");
        avengersEndgameRoles.add("Thor");
        avengersEndgameRoles.add("Natasha Romanoff");
        LinkedList <Actor> avengersEndgameCast = new LinkedList<>();
        avengersEndgameCast.add(robertDowneyJr);
        avengersEndgameCast.add(chrisEvans);
        avengersEndgameCast.add(markRuffalo);
        avengersEndgameCast.add(chrisHemsworth);
        avengersEndgameCast.add(scarlettJohansson);
        
        Movie avengersEndgame = new Movie("Avengers Endgame", "Anthony Russo", "Christopher Markus", "2019", avengersEndgameRoles, avengersEndgameCast); //add movie to linked list
        movies.add(avengersEndgame);
        
        //Black Widow 
        LinkedList<String> blackWidowRoles = new LinkedList<>();
        blackWidowRoles.add("Tony Stark");
        blackWidowRoles.add("Alexei Shostakov");
        blackWidowRoles.add("Yelena Belova");
        blackWidowRoles.add("Natasha Romanoff");
        blackWidowRoles.add("Melina Vostokoff");
        LinkedList <Actor> blackWidowCast = new LinkedList<>();
        blackWidowCast.add(robertDowneyJr);
        blackWidowCast.add(davidHarbour);
        blackWidowCast.add(florencePugh);
        blackWidowCast.add(scarlettJohansson);
        blackWidowCast.add(rachelWeisz);
        
        Movie blackWidow = new Movie("Black Widow", "Cate Shortland", "Ned Benson", "2020", blackWidowRoles, blackWidowCast); //add movies to linked list 
        movies.add(blackWidow);
        
        //Batman Begins
        LinkedList<String> batmanBeginsRoles = new LinkedList<>();
        batmanBeginsRoles.add("Bruce Wayne");
        batmanBeginsRoles.add("Alfred");
        batmanBeginsRoles.add("Ducard");
        batmanBeginsRoles.add("Rachel Dawes");
        batmanBeginsRoles.add("Jim Gordon");
        LinkedList <Actor> batmanBeginsCast = new LinkedList<>();
        batmanBeginsCast.add(christianBale);
        batmanBeginsCast.add(michaelCaine);
        batmanBeginsCast.add(liamNeeson);
        batmanBeginsCast.add(katieHolmes);
        batmanBeginsCast.add(garyOldman);
        
        Movie batmanBegins = new Movie("Batman Begins", "Christopher Nolan", "Bob Kane", "2005", batmanBeginsRoles, batmanBeginsCast); //add movie to linked list 
        movies.add(batmanBegins);
    }
    
    /**
     * A method to display all the movie titles in the database
     * @param movies linked list of movies
     * @return movie titles 
     */
    private static String displayTitles(LinkedList<Movie> movies)
    {
        String titles = "";
        for(int i = 0; i < movies.size(); i++)
        {
            titles += movies.get(i).getTitle() + "\n";
        }
        return "Movies in the database: \n\n" + titles;
    }
    
    /**
     * A method to display all the actors and actresses stored in the database
     * @param actors list of actors
     * @return actors and actresses
     */
    private static String displayActors(LinkedList<Actor> actors)
    {
        String actorsList = "";
        for(int i = 0; i < actors.size(); i++)
        {
            actorsList += actors.get(i).getFirstName() + " " + actors.get(i).getLastName() + "\n";
        }
        return "Actors/Actresses in the DataBase: \n\n" + actorsList;
    }
    
    /**
     * A method to find the Actor object from user given input
     * @param f first name of actor
     * @param l last name of actor
     * @param actors linked list of actors
     * @return the desired actor object
     */
    private static Actor findActor(String f, String l, LinkedList<Actor> actors)
    {
        for(int i = 0; i < actors.size(); i++)
        {
            if(actors.get(i).getFirstName().equals(f) && actors.get(i).getLastName().equals(l))
            {
                return actors.get(i);
            }
        }
        return null;
    }
    
    /**
     * A method to display the movies a given actor or actress starred in 
     * @param actors linked list of actors and actresses
     * @param movies linked list of movies
     * @return the movies desired actor/actress played in
     */
    private static String displayCertainTitles(LinkedList<Actor> actors, LinkedList<Movie> movies)
    {
        Scanner in = new Scanner(System.in);
        String titles = "";
        
        System.out.print("Enter the first name of the actor/actress you want to know the titles of: ");
        String first = in.nextLine(); //get first name
        System.out.print("\nEnter the last name of the actor/actress you want to know the titles of: ");
        String last = in.nextLine(); //get last name
        
        Actor desiredActor = findActor(first, last, actors);
        
        for(int i = 0; i < movies.size(); i++) //go through every movie
        {
            for(int j = 0; j < movies.get(i).getCast().size(); j++) //go through every cast member
            {
                if(movies.get(i).getCast().get(j) == desiredActor)
                {
                    titles += movies.get(i).getTitle() + "\n";
                }
            }
        }  
        return "\n" + first + " " + last + " appears in: \n" + titles;
    }
    
    /**
     * A method to add an actor or actress to the database
     * @param actors linked list of actors
     */
    private static void addActor(LinkedList<Actor> actors)
    {
        Scanner in = new Scanner(System.in);
        
        //ask user for information
        System.out.print("\nEnter actor/actress' first name: ");
        String first = in.nextLine();
        System.out.print("\nEnter actor/actress' last name: ");
        String last = in.nextLine();
        System.out.print("\nEnter their birth date: ");
        String bday = in.nextLine();
        System.out.print("\nEnter their birth city: ");
        String city = in.nextLine();
        System.out.print("\nEnter their birth state: ");
        String state = in.nextLine();
        System.out.print("\nEnter their birth country: ");
        String country = in.nextLine();
        
        Actor a = new Actor(first, last, bday, city, state, country); //create new Actor
        actors.add(a); //add actor or actress to linked list 
    }
    
    /**
     * A method to create and add a movie to the directory
     * @param movies linked list of movies
     * @param actors linked list of actors
     */
    private static void addMovie(LinkedList<Movie> movies, LinkedList<Actor> actors)
    {
        Scanner in = new Scanner(System.in);
        
        //ask user for information
        System.out.print("Enter the movie title: ");
        String title = in.nextLine();
        System.out.print("Enter the director of the movie: ");
        String director = in.nextLine();
        System.out.print("Enter the writer of the movie: ");
        String writer = in.nextLine();
        System.out.print("Enter the year the movie was released: ");
        String year = in.nextLine();
       
        LinkedList<String> movieRoles = new LinkedList<>(); //roles
        System.out.print("Enter a movie role, or 0 when done adding roles: ");
        String input = in.nextLine();
        while(!(input.equals("0")))
        {
            movieRoles.add(input);
            System.out.print("Enter a movie role, or 0 when done adding roles: ");
            input = in.nextLine();
        }
        
        LinkedList<Actor> movieCast = new LinkedList<>(); //cast
        for(int i = 0; i < movieRoles.size(); i++)
        {
            System.out.print("Enter the first name of the actor/actress who plays " + movieRoles.get(i) + ": ");
            String f = in.nextLine();
            System.out.print("Enter the last name of the actor/actress who plays " + movieRoles.get(i) + ": ");
            String l = in.nextLine();
            movieCast.add(findActor(f, l, actors)); //assign actor to role
        }
        
        Movie m = new Movie(title, director, writer, year, movieRoles, movieCast); //create movie with acquired information
        movies.add(m); //add movie to linked list of movies
    }
    
    /**
     * A method to display each actor and actress with stars next to the names representing how many movies they starred in 
     * @param actors list of actors
     * @param movies list of movies
     */
    private static void displayStats(LinkedList<Actor> actors, LinkedList<Movie> movies)
    {
        int[] count = new int [actors.size()];
        
        for(int i = 0; i < actors.size(); i++) //go through every actor
        {
            for(int j = 0; j < movies.size(); j++) //go through every movie
            {
                for(int k = 0; k < movies.get(j).getCast().size(); k++) //goes through every cast member
                {
                   if(movies.get(j).getCast().get(k) == actors.get(i))
                   {
                       count[i]++; //increment count if actor or actress played in movie
                   }
                }
            }
        }
        
        System.out.println("Acting Productivity Chart");
        System.out.println("---------------------------");
        
        for(int i = 0; i < actors.size(); i++)
        {
            System.out.printf("\n%20s%10s", actors.get(i).getFirstName() + " " + actors.get(i).getLastName(), "    ");
            for(int j = 0; j < count[i]; j++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
       
        //linked lists for actors and movies
        LinkedList <Actor> actors = new LinkedList<>();
        LinkedList <Movie> movies = new LinkedList<>();
        
        int option;
        
        //display menu
        System.out.println("\nEnter a number from the menu to perform the designated action. "
                + "\n1) Create movie database "
                + "\n2) Display the titles of all movies in the database "
                + "\n3) Display the names of all actors/actresses in the database "
                + "\n4) Print the titles of all movies where a given actor/actress played "
                + "\n5) Add an actor/actress to movie database "
                + "\n6) Add a movie to the database "
                + "\n7) Display a statistics chart "
                + "\n8) Quit the program \n");
       
        option = in.nextInt(); //get menu choice
        
        while(option != 8)
        {
            if(option == 1) //create movie database
            {
                createDatabase(actors, movies);
            }
            
            else if(option == 2) //display titles of all movies in database
            {
                System.out.print(displayTitles(movies));
            }
            
            else if(option == 3) //display the names of all actors/actresses in the database
            {
                System.out.print(displayActors(actors));
            }
            
            else if(option == 4) //print the titles of all movies where a given actor/actress played
            {
                
                System.out.print(displayCertainTitles(actors, movies));
            }
            
            else if(option == 5) //Add an actor/actress to movie database
            {
                addActor(actors);
            }
            
            else if(option == 6) //add movie
            {
                addMovie(movies, actors);
            }
            else // option 7 - display a statistics chart
            {
                displayStats(actors, movies);
            }
            
            //display menu
            System.out.println("\nEnter a number from the menu to perform the designated action. "
                + "\n1) Create movie database "
                + "\n2) Display the titles of all movies in the database "
                + "\n3) Display the names of all actor/actresses in the database "
                + "\n4) Print the titles of all movies where a given actor/actress played "
                + "\n5) Add an actor/actress to movie database "
                + "\n6) Add a movie to the database "
                + "\n7) Display a statistics chart "
                + "\n8) Quit the program \n");
       
            option = in.nextInt(); //get menu choice
        }   
    }     
}
