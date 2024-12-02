package java102;

import java102.Main.Shape;

public class Square implements Shape {
	public final Point corner;
	public final double sideLength;

	/**
	* @param corner The bottom left corner of the square
	* @param sideLength
	*/
	public Square(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

	public double area() {
		return Math.pow(sideLength, 2);
	}
	
	public double perimeter() {
		return sideLength * 4;
	}
	
	/** 
	* @return Whether point p is inside of the square.
	*/
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
	}

	/** 
	* @return Whether point p part of/on the border of the square.
	*/
	public boolean isOn(Point p) {
        if(p.x >= this.corner.x && p.x < this.corner.x + this.sideLength  &&  p.y >= this.corner.y && p.y < this.corner.y + this.sideLength) return true; else return false;
	}
	
	/** 
	* @param x How much to translate the sqaure by in the + x direction.
	* @param y How much to translate the squarer by in the + y direction.
	* @return The sqaure that results from the translation.
	*/
	public Square translate(double x, double y) {
        Point newCorner = new Point(this.corner.x + x, this.corner.y + y);
		return new Square(newCorner, this.sideLength);
	}

	/** 
	* @return The sqaure that results from scaling the side length and maintaining the bottom left corner
	*/
	public Square scale(double k) {
		return new Square(corner, sideLength * k);
	}

	public Point[] corners() {
		Point a = this.corner;
		Point b = new Point(this.corner.x + this.sideLength, this.corner.y);
		Point c = new Point(this.corner.x + this.sideLength, this.corner.y + this.sideLength);
		Point d = new Point(this.corner.x + sideLength, this.corner.y);
		Point[] corners = {a, b, c, d};
        return corners;
	}

	@Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
}
