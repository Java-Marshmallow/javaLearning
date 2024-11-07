package java102;

public class Main {
    public static void main(String[] args)
    {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(4, 0);
        Point p4 = new Point(4, 4);

        Point[] points = {p1, p2, p3, p4};

        System.out.println( Point.centerOfMass(points) );
    }
}