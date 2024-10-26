package week04.exercise02;

public class Person {
    // instance variables
    // in other words, attributes
    // protected access modifier allows direct access from the child classes
    // child class can read and write to the attributes without getters/setters
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String myName, int myAge, String myGender) {
        this.myName = myName;
        this.myGender = myGender;
        // use the setter
        // to avoid duplication of input validation
        setMyAge(myAge);
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        // check if the age is a negative number
        // throws an exception if age is negative
        if (myAge < 0) {
            throw new IllegalArgumentException("Age must be a positive integer");
        }
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", myGender='" + myGender + '\'' +
                '}';
    }
}
