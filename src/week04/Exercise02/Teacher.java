package week04.Exercise02;

public class Teacher extends Person {
    // instance variables
    // additionally Student class inherits all the attributes defined in the Person class
    // they can be assigned through respective constructor calls or invoking respective setter
    // as the access modifiers in the super class are set to protected,
    // direct reading and writing to super class's attributes is allowed
    private double salary;
    private String subject;

    // Super class does not have a default constructor
    // therefore explicit call to the super class constructor is mandatory
    public Teacher(String myName, int myAge, String myGender, double salary, String subject) {
        super(myName, myAge, myGender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher: sub class of " +
                super.toString() +
                " Salary= " + getSalary() +
                " Subject= " + getSubject();
    }
}
