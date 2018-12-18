//Filename: MyCircle.java
//class to encapsulate propeties of circle
//Jason LaHatte
//12/8/2018
//
 import java.awt.*;
 import java.awt.geom.*;

public class MyCircle extends MyEllipse {
	
	public MyCircle() {
		this.minorRadius = 0.0;
		this.majorRadius = 0.0;
		System.out.println("circle created");
	}
	
	public void setRadius(double M, double m) {
		super.setRadius(M, M);
	}
	
	public void setRadius(double r) {
		super.setRadius(r, r);
	}
	
	public double calcArea() {
		return super.calcArea();
	}
	
	/*public boolean draw(Graphics2D ga) {
		Shape circle = new Ellipse2D.Double(center.x() - (majorRadius/2.0),
		                                     center.y() - (minorRadius/2.0),
											 majorRadius, minorRadius);
		ga.fill(Ellipse);
		return true;
	}*/
}