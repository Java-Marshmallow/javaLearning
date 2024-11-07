package java102;

public class Point 
{
    public final double x;
    public final double y;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2)
    {
        //a^2 + b^2 = c^2
        return Math.sqrt( Math.pow( (p2.x - p1.x), 2 ) + Math.pow( (p2.y - p1.y), 2 ) );
    }

    public static Point centerOfMass(Point[] points)
    {
        double centerX = 0;
        for(int i = 0; i < points.length; i++)
        {
            centerX += points[i].x;
        }
        centerX = centerX/points.length;

        double centerY = 0;
        for(int i = 0; i < points.length; i++)
        {
            centerY += points[i].y;
        }
        centerY = centerY/points.length; 

        return new Point(centerX, centerY);
    }

    public Point translatePointX(double t)
    {
        System.out.println("ooh ahh translating");
        return new Point(this.x + t, this.y);
    }

    public Point translatePointY(double t)
    {
        System.out.println("ooh ahh translating the other way");
        return new Point(this.x, this.y + t);
    }

    @Override
    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }
}
