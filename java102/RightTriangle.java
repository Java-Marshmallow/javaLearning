package java102;

import java102.Main.Shape;

public class RightTriangle implements Shape{

    public final Point corner;
    public final double base;
    public final double height;

    /**
	* @param corner The bottom left corner of the triangle
	* @param base THe length of the leg parallel to the x axis
    * @param height The length of the leg parallel to the y axis
	*/
	public RightTriangle(Point corner, double base, double height) {
		this.corner = corner;
		this.base = base;
        this.height = height;
	}

    public double area() {
        return base*height/2;
    }

    public double perimeter() {
        return height + base + Math.sqrt( (Math.pow(height, 2) + Math.pow(base, 2)) );
    }

    public boolean isInside(Point p) {
        RightTriangle translatedTriangle = this.translate(-base, -height);
        Point translatedP = new Point(p.x - translatedTriangle.base, p.y - translatedTriangle.height);
        return
            0 <= translatedP.x && translatedP.x <= translatedTriangle.base
            && 0 <= translatedP.y && translatedP.y <= translatedTriangle.height
            && translatedP.y <= -(translatedTriangle.height/translatedTriangle.base) * translatedP.x + translatedTriangle.height;
        
    }

    public boolean isOn(Point p) {
        RightTriangle translatedTriangle = this.translate(-base, -height);
        Point translatedP = new Point(p.x - translatedTriangle.base, p.y - translatedTriangle.height);
        return 
            translatedP.y == 0 && 0 <= translatedP.x && translatedP.x <= translatedTriangle.base
            && translatedP.x == 0 && 0 <= translatedP.y && translatedP.y <= this.height
            && translatedP.y == -(this.height/this.base) * translatedP.x + this.height && 0 <= translatedP.x && translatedP.x <= this.base;
    }

    public RightTriangle translate(double x, double y) {
        Point newCorner = new Point(this.corner.x + x, this.corner.y + y);
        return new RightTriangle(newCorner, this.base, this.height);
    }

    public RightTriangle scale(double k) {
        return new RightTriangle(this.corner, this.base*k, this.height*k);
    }
    
}
