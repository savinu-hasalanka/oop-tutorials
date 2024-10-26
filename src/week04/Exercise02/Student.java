package week04.exercise02;

public class Student extends Person {
    // instance variables
    // additionally Student class inherits all the attributes defined in the Person class
    // they can be assigned through respective constructor calls or invoking respective setter
    // as the access modifiers in the super class are set to protected,
    // direct reading and writing to super class's attributes is allowed
    private int IDNumber;
    private double fee;
    private int grade;

    // Super class does not have a default constructor
    // therefore explicit call to the super class constructor is mandatory
    public Student(int IDNumber, String myName, int myAge, String myGender) {
        super(myName, myAge, myGender);
        this.IDNumber = IDNumber;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: sub class of " +
                super.toString() +
                " ID Number= " + getIDNumber() +
                " Fee= " + getFee() +
                " Grade= " + getGrade();
    }
}
