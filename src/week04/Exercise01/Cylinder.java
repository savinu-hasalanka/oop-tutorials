package week04.exercise01;


import week02.circle.Circle;

public class Cylinder extends Circle {
    // instance variable
    // additionally Cylinder class inherits all the attributes defined in the Circle class
    // they can be assigned through respective constructor calls or invoking respective setters
    // they are not directly accessible from the child class as the access modifiers are set to private
    private double height = 1.0;

    // default constructor
    // no explicit call to super class's constructors
    // hence the default constructor of the super class will be invoked automatically
    // super()
    public Cylinder() {
    }

    // constructor that accepts one parameter
    // no explicit call to super class's constructors
    // hence the default constructor of the super class will be invoked automatically
    // super()
    public Cylinder(double height) {
        this.height = height;
    }

    // constructor that accepts two parameters
    // explicitly calls one of the super class's constructors to set the radius
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // constructor that accepts three parameters
    // explicitly calls one of the super class's constructors to set the radius and color
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        // make sure to call the getArea() from the super class
        // else the getArea() overridden inside the child will be invoked
        // which is not what we want for this calculation
        // super class getArea() -> returns the base area
        // child class getArea() -> returns the surface area
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * getRadius() * height) + (2 * super.getArea());
    }

    @Override
    public String toString() {
        return "Cylinder: sub class of " +
                super.toString() +
                " height=" + height;
    }
}
