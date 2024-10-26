package week05.exercise;


public class Circle extends GeometricObject {
    // instance variables
    protected double radius;

    // default constructor
    public Circle() {
    }

    // constructor 01
    public Circle(double radius) {
        this.radius = radius;
    }

    // constructor 02
    public Circle(double radius, boolean filled, String color) {
        super(filled, color);
        this.radius = radius;
    }

    // getter for radius
    public double getRadius() {
        return radius;
    }

    // setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // implements abstract method -> getArea()
    @Override
    public double getArea() {
        // PI is a static constant (double) stored inside Math class
        // pow(double a, double b) is a static method defined inside Math class
        // pow(double a, double b) raises a into the power of b
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    // implements abstract method -> getPerimeter()
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // implements abstract method -> getShape()
    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area='" + getArea() + '\'' +
                ", circumference='" + getPerimeter() + '\'' +
                '}';
    }
}
