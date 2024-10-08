package week01.circle;

public class Circle {
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

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        // PI is a static constant (double) stored inside Math class
        // pow(double a, double b) is a static method defined inside Math class
        // pow(double a, double b) raises a into power of b
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    public void modifyColorAndRadius(String color, double radius) {
        // assign the new values
        this.color = color;
        this.radius = radius;

        // print on the command line
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
