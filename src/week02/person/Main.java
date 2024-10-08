package week01.person;

public class Main {
    public static void main(String[] args) {
        // instantiate two person objects using the constructor 01
        Person taylor = new Person("Taylor", "Swift", 32);
        Person steve = new Person("Steve", "Jobs", 56);

        // instantiate a person objects using the constructor 02
        Person tim = new Person("Tim", "Cook");

        // use of getters
        System.out.println(taylor.getName());
        System.out.println(steve.getSurname());
        System.out.println(steve.getAge());

        // use of setters
        tim.setAge(63);

        System.out.println(tim.getAge());

        // use of static methods
        // remember to use the class itself to call static methods
        System.out.println(Person.getNumberOfPersons());
    }
}
