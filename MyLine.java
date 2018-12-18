//Filename: MyLine.java
//class to encapsulate properties of line
//Jason LaHatte
//12/8/2018
//
import java.awt.*;
import java.awt.geom.*;

public class MyLine extends MyShape {
	protected  MyPoint point1; 
	protected  MyPoint point2;
	
	public MyLine() {
		this.point1 = new MyPoint(0.0, 0.0);
		this.point2 = new MyPoint(1.0, 0.0);
		System.out.println("line created");
	}
	
	public MyLine(double x1, double y1, double x2, double y2) {
		this.point1 = new MyPoint(x1, y1);
		this.point2 = new MyPoint(x2, y2);
	}
	
	public double x1() {return point1.x();}
	public double y1() {return point1.y();}
	public double x2() {return point2.x();}
	public double y2() {return point2.y();}
	
	/*public double x1(double v) {return point1.x(v);}
	public double y1(double v) {return point1.y(v);}
	public double x2(double v) {return point2.x(v);}
	public double y2(double v) {return point2.y(v);}*/
	
	public void set(double x1, double x2, double y1, double y2) {
		point1.x(x1);
		point1.y(y1);
		point2.x(x2);
		point2.y(y2);
	}
	
	public double calcArea() {
		return 0.0;
	}
	
	public double calcDistance() {
		return point1.calcDistance(point2);
	}
	
	public boolean draw(Graphics2D ga) {
		Shape line = new Line2D.Double(center.x() + point1.x(),
									   center.y() + point1.y(),
									   center.x() + point2.x(),
									   center.y() + point2.y());
		ga.draw(line);
		return true;
	}
}