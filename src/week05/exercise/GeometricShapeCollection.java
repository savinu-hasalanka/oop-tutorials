package week05.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private final ArrayList<GeometricObject> shapeList;
    private final int numObject;

    public GeometricShapeCollection(int listLength) {
        this.numObject = listLength;
        this.shapeList = new ArrayList<>();
    }

    @Override
    public void addShape(GeometricObject shape) {
        if (shapeList.size() < numObject) {
            shapeList.add(shape);
        } else {
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {
        for (GeometricObject shape : shapeList) {
            System.out.println(shape);
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;
        Scanner s = new Scanner(System.in);

        System.out.println("To Add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");
                int choice2 = s.nextInt();
                s.nextLine();

                System.out.println("Enter the color of your shape");
                String colour = s.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = s.nextLine();
                boolean filled = isFilled.equals("y");

                switch (choice2) {
                    case 1:
                        System.out.println("Insert the radius");
                        double radius = s.nextDouble();
                        Circle c = new Circle(radius, filled, colour);
                        addShape(c);
                        break;
                    case 2:
                        System.out.println("Insert the length");
                        double length = s.nextDouble();
                        System.out.println("Insert the width");
                        double width = s.nextDouble();
                        Rectangle r = new Rectangle(filled, colour, width, length);
                        addShape(r);
                        break;
                    case 3:
                        System.out.println("Insert the side");
                        double side = s.nextDouble();
                        Square sq = new Square(filled, colour, side);
                        addShape(sq);
                        break;
                }
                break;

            case 2:
                this.printShapeList();
                break;

            case 3:
                exit = true;
                break;
        }

        return exit;
    }

    public static void main(String[] args) {
        ShapeCollection sys = new GeometricShapeCollection(2);
        boolean exit = false;

        while (!exit) {
            exit = sys.runMenu();
        }
    }
}
