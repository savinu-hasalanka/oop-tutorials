package week04.exercise02;

public class Main {
    public static void main(String[] args) {
        Person jack = new Person("Jack Brooke", 27, "M");
        System.out.println(jack);

        Student beth = new Student(122233, "Elisabeth Smith", 16, "F");
        System.out.println(beth);

        Teacher sam = new Teacher(
                "Sam Hamilton",
                34,
                "M",
                50000,
                "Computer Science"
        );
        System.out.println(sam);
    }
}
