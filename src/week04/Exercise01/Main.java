package week04.Exercise01;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Cylinder cylinder2 = new Cylinder(5);
        Cylinder cylinder3 = new Cylinder(5, 3);
        Cylinder cylinder4 = new Cylinder(5, "Red", 3);

        System.out.println(cylinder);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(cylinder4);

        System.out.println("Cylinder 4 volume: " + cylinder4.getVolume());
    }
}
