package week02.person;

public class Person {
    // instance variables
    private String name;
    private String surname;
    private int age;

    // class variables
    // use "static" keyword to define class variables
    private static int numberOfPersons = 0;

    // constructor 01
    public Person(String name, String surname, int age) throws IllegalArgumentException {
        // assign instance variables
        this.name = name;
        this.surname = surname;
        // use the setter
        // to avoid duplication of input validation
        setAge(age);

        // increment the numberOfPersons each time a person is created
        numberOfPersons++;
    }

    // constructor 02
    public Person(String name, String surname) {
        // assign instance variables
        this.name = name;
        this.surname = surname;

        // increment the numberOfPersons each time a person is created
        numberOfPersons++;
    }

    // getter for name attribute
    public String getName() {
        return name;
    }

    // setter for name attribute
    public void setName(String name) {
        this.name = name;
    }

    // getter for surname attribute
    public String getSurname() {
        return surname;
    }

    // setter for surname attribute
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // getter for age attribute
    public int getAge() {
        return age;
    }

    // setter for age attribute
    public void setAge(int age) throws IllegalArgumentException {
        // check if the age is a negative number
        // throws an exception if age is negative
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive integer");
        }
        this.age = age;
    }

    // class methods
    // use "static" keyword to define class methods
    // no need to define a setter for numberOfPersons as it is auto incremented inside the constructor
    public static int getNumberOfPersons() {
        return numberOfPersons;
    }

}
