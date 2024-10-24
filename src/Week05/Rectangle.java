package Week05;


public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(boolean filled, String color, double width, double height) {
        super(filled, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height='" + height + '\'' +
                ", color='" + color + '\'' +
                ", area='" + getArea() + '\'' +
                ", perimeter='" + getPerimeter() + '\'' +
                '}';
    }
}
