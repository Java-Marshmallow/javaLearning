package java102;

import java.util.ArrayList;

public class Main {

    public interface Shape {
        double area();
    }
    
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
        arr.set(0, "welcome");
        System.out.println(arr);

        ArrayList<Boolean> conditions = new ArrayList<>(3);
        conditions.add(true);
        conditions.add(arr.get(0) == "hello");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);

        Grid<String> grid = new Grid<String>(5, ":3");
        System.out.println(grid);
        Grid<Integer> grid2 = new Grid<Integer>(22, 33);
        System.out.println(Grid.maxSideLength);
    }
}

//ArrayList is basically the same as a vector in C++
