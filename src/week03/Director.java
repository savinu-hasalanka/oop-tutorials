package Week03;

public class Director {
    // instance variables
    private String name;
    private String surname;
    private int numberOfMovies;
    private Date dob; // Director Has-A Date object as an attribute.

    // constructor
    // note: Date object is not made inside the Director class.
    //       It is made outside the Director class & pass through the setter. eg: setDob(Date dob)
    //       AKA setter injection.
    // relationship type: aggregation.
    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfMovies=" + numberOfMovies +
                ", birthday=" + dob +
                '}';
    }
}
