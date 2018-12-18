//Filename: MySquare.java
//Circle Class
//Jason LaHatte
//12/8/2018
//
import java.awt.*;

 
 public class MySquare extends MyRectangle {
	 
	 public MySquare() {
		 System.out.println("Square Created");
	 }
	 
	 public void setDimensions(double h, double w) {
		super.setDimensions(w, w);
	 }
	 
	 /*public void setDimensions(double w, double h)
	 {
		 super.setDimensions(w, w);
	 }*/
	 
	 public double calcArea() {
		return width * height;
	 }
	 
	/* public boolean draw(Graphics2D ga) {
		Shape square = new Rectangle2D.Double(center.x(),
		                                     center.y(),
											 getWidth(), getHeight());
		ga.fill(Rectangle);
		return true;
	 }*/
 }