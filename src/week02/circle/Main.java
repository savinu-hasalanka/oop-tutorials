package week02.circle;

public class Main {
    public static void main(String[] args) {
        // instantiates a circle object using the default constructor
        // default values defined in the Circle class will be used by the constructor
        // in this instance radius is 1 and color is blue (both are default values)
        Circle circle1 = new Circle();

        // instantiates a circle object using the constructor 01
        // any instance variable not explicitly initialized through the constructor
        // will be assigned its default value as defined in the Circle class
        // in this instance radius is 5 (user input) and color is blue (default)
        Circle circle2 = new Circle(5);

        // instantiates a circle object using the constructor 02
        // all instance variables are given by the user
        // no default values will be used
        Circle circle3 = new Circle(10, "Red");

        // print statement automatically invokes the toString()
        System.out.println(circle1);

    }
}
