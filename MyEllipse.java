//Filename: MyEllipse.java
//Ellipse class objects the encapsulate properties 
//Jason LaHatte
//12/8/2018
//
import java.awt.*;
import java.awt.geom.*;

public class MyEllipse extends MyShape {
	protected double minorRadius;
	protected double majorRadius;
	
	public MyEllipse() {
		this.minorRadius = 0.0;
		this.majorRadius = 0.0;
		System.out.println("ellipse created");
	}
	
	public void setRadius(double M, double m) {
		minorRadius = Math.min(m, M);
		majorRadius = Math.max(m, M);
	}
	
	public double calcArea() {
		return Math.PI * minorRadius * majorRadius;
	}
	
	public boolean draw(Graphics2D ga) {
		Shape ellipse = new Ellipse2D.Double(center.x() - (majorRadius/2.0),
		                                     center.y() - (minorRadius/2.0),
											 majorRadius, minorRadius);
		ga.fill(ellipse);
		return true;
		
	}
}