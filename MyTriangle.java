//Filename: MyTriangle.java
//class to encapsulate properties of triangle
//Jason LaHatte
//12/8/2018
//
import java.awt.*;
import java.awt.geom.*;

public class MyTriangle extends MyPolygon {
	protected MyLine line1;
	protected MyLine line2;
	protected MyLine line3;
	
	public MyTriangle() {
		numSides = 3;
		this.line1 = new MyLine(0.0, 0.0, 1.0, 0.0);
		this.line2 = new MyLine(1.0, 0.0, 1.0, 1.0);
		this.line3 = new MyLine(1.0, 1.0, 0.0, 0.0);
		System.out.println("Triangle Created");
	}
	
	public void set(double x1, double y1, double x2, double y2, double x3, double y3) {
		line1.set(x1, y1, x2, y2);
		line2.set(x2, y2, x3, y3);
		line3.set(x3, y3, x1, y1);
	}
		
	public double calcArea() {
		double a = line1.calcDistance();
		double b = line2.calcDistance();
		double c = line3.calcDistance();
		double s = (a + b + c)/2.0;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
	
	public boolean draw(Graphics2D ga) {
		Shape triangle = new Polygon();
		((Polygon)triangle).addPoint((int)(center.x() + line1.x1()),
								   (int)(center.y() + line1.y1()));
		((Polygon)triangle).addPoint((int)(center.x() + line2.x1()),
								   (int)(center.y() + line2.y1()));
		((Polygon)triangle).addPoint((int)(center.x() + line3.x1()),
								   (int)(center.y() + line3.y1()));
		ga.fill(triangle);
		return true;
	}
}
								   
		
