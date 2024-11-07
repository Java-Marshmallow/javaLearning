package java102;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(4, 0);
        Point p4 = new Point(4, 4);

        Point[] points = {p1, p2, p3, p4};

        System.out.println( Point.centerOfMass(points) );

        System.out.println(p4.angle());

        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("world");
        System.out.println(arr);
    }
}

//ArrayList is basically the same as a vector in C++