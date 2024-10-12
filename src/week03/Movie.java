package Week03;

import java.util.Arrays;

public class Movie {
    // instance variables
    private String title;
    private String category;
    private Director director; // Movie Has-A Director object
    private int numberOfAwards;
    private Actor[] actors;
    private static int numberOfActors = 0;

    // constructor
    // note: A Director object is made outside the Director class and pass through the constructor.
    //       AKA constructor injection.
    //       The Director object not instantiated / maintained inside Movie.
    // relationship type: aggregation.
    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.actors = new Actor[10];
    }

    // getters and setters

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public int getNumberOfAwards() {
        return numberOfAwards;
    }

    public void setNumberOfAwards(int numberOfAwards) {
        this.numberOfAwards = numberOfAwards;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
        numberOfActors = actors.length;
    }

    // method to add an actor at a time
    public void addActor(Actor actor) throws IndexOutOfBoundsException {
        if (numberOfActors >= actors.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.actors[numberOfActors++] = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director=" + director +
                ", numberOfAwards=" + numberOfAwards +
                ", actors=" + Arrays.toString(actors) +
                '}';
    }
}
