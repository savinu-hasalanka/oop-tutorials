package Week03;

public class Main {
    public static void main(String[] args) {
        // instantiates a Director object
        Director director = new Director("James", "Cameron");

        // instantiates a Date object
        Date dob = new Date(16, 8, 1954);

        // set director object's dob through the setter
        director.setDob(dob);

        director.setNumberOfMovies(23);

        // print statement invokes the toString() defined inside Director class
        System.out.println(director);

        // instantiates a Movie object
        Movie movie = new Movie("Avatar", "Fantasy", director);

        // print statement invokes the toString() defined inside Movie class
        System.out.println(movie);

        movie.setNumberOfAwards(23);

        // instantiates two Actor objets
        Actor zoe = new Actor("Zoe Saldana", 1.7, 46);
        Actor sam = new Actor("Sam Worthington", 1.7, 48);

        // defines an array of Actors & appends the actor objects in one line
        Actor[] actors = new Actor[] {zoe, sam};

        // setting the actors through the setter
        movie.setActors(actors);
    }
}
