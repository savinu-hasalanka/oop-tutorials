package Week05;

public class Square extends GeometricObject {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(boolean filled, String color, double side) {
        super(filled, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", area='" + getArea() + '\'' +
                ", perimeter='" + getPerimeter() + '\'' +
                '}';
    }
}
