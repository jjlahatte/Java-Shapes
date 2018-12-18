//Filename: MyRectangle.java
//class to encapsulate properties of rectangle
//Jason LaHatte
//12/8/2018
//
 import java.awt.*;
 import java.awt.geom.*;
 
 public class MyRectangle extends MyPolygon {
	 protected double width;
	 protected double height;
	 
	 public MyRectangle() {
		 numSides = 4;
		 this.width = 1.0;
		 this.height = 2.0;
		 System.out.println("Rectangle Created");
	 }
	 public double getWidth() {return width;}
	 public double getHeight() {return height;}
	 
	 public void setDimensions(double h, double w) {
		 if (w < 0.0 || h < 0.0) return;
		 width = w;
		 height = h;
	 }
	 
	 public double calcArea() {
		 return width * height;
	 }
	 
	 public boolean draw(Graphics2D ga) {
		Shape square = new Rectangle2D.Double(center.x(),
		                                     center.y(),
											 getWidth(), getHeight());
		ga.fill(square);
		return true;
	 }
 }