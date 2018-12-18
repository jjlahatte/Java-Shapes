//Filename: JavaShape.java
//Main File for Java Shapes Project
//Jason LaHatte
//12/8/2018
//
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class JavaShape {
	
	
	public static void main(String args[]) {
		System.out.println("Welcome to Java Shape");
		DrawingCanvas dc = new DrawingCanvas();
		dc.createDrawing();
		
		dc.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		dc.setTitle("Little People!");
		dc.setBackground(new Color(30, 136, 45));
		dc.setSize(dc.MAX_WIDTH, dc.MAX_HEIGHT);
		dc.setVisible(true);
	}
}
		

		/*
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(3.0, 1.0);
		MyColor c1 = new MyColor();
		c1.r(30);
		MyShape shape = new MyEllipse();
		//shape.setRadius(3.2);
		
		System.out.println(shape.calcArea());
		
		/*System.out.print("Value is: ");
		System.out.print(MyPoint.calcDistance(p1, p2));
		System.out.print(c1.r());
		System.out.println(".");*/
		
	
