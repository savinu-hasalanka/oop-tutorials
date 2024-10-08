package week02.circle;

public class Circle {
    // instance variables
    private double radius = 1;
    private String color = "blue";

    // default constructor
    public Circle() {
    }

    // constructor 01
    public Circle(double radius) {
        this.radius = radius;
    }

    // constructor 02
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // getter for radius
    public double getRadius() {
        return radius;
    }

    // instance method to calculate area
    public double getArea() {
        // PI is a static constant (double) stored inside Math class
        // pow(double a, double b) is a static method defined inside Math class
        // pow(double a, double b) raises a into the power of b
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    public void modifyColorAndRadius(String color, double radius) {
        // assigns the new values
        this.color = color;
        this.radius = radius;

        // prints on the command line
        System.out.println(
                "new color: " + this.color +
                "new radius: " + this.radius
        );
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area='" + getArea() + '\'' +
                '}';
    }
}
