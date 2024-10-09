package Week03;

public class Director {
    // instance variables
    private String name;
    private String surname;
    private int numberOfMovies;
    private Date dob; // Director Has-A Date object as an attribute

    // constructor
    // note: A Director object can be instantiated without a Date object (birthday)
    // relationship type: aggregation
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
