//Filename: JavaShape.java
//Class to actually draw shapes
//Jason LaHatte
//12/8/2018
//
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class DrawingCanvas extends Frame {
	public Graphics2D ga;
	public final int MAX_WIDTH = 800;
	public final int MAX_HEIGHT = 600;
	public final int MAX_SHAPES = 10;
	public Rectangle bounds = new Rectangle(0, 0, 1, 0);
	
	MyShape[] myShapes = new MyShape[MAX_SHAPES];
	public int lastShapeIndex = 0;
	
	public DrawingCanvas() {
	}
	
	public void createDrawing() {
	myShapes[lastShapeIndex] = new MyEllipse();
	myShapes[lastShapeIndex].color.set(255, 0, 0);
	lastShapeIndex++;
	
	myShapes[lastShapeIndex] = new MyRectangle();
	myShapes[lastShapeIndex].color.set(180, 180, 180);
	lastShapeIndex++;
	
	myShapes[lastShapeIndex] = new MyTriangle();
	myShapes[lastShapeIndex].color.set(0, 255, 0);
	lastShapeIndex++;
	
	myShapes[lastShapeIndex] = new MyLine();
	myShapes[lastShapeIndex].color.set(255, 255, 0);
	lastShapeIndex++;
	
	myShapes[lastShapeIndex] = new MyCircle();
	myShapes[lastShapeIndex].color.set(255, 255, 0);
	lastShapeIndex++;
	
	updateDrawing();
}
	
	public void updateDrawing() {
		/*((MyRectangle)myShapes[0]).setDimensions(400.0);
		myShapes[0].setLocation((bounds.width/2.0) - 200.0, 0.0);*/
		
		((MyEllipse)myShapes[0]).setRadius(80.0, 100.0);
		myShapes[0].setLocation((bounds.width/2.0) - 0.0, 150.0);
		
		((MyRectangle)myShapes[1]).setDimensions(100.0, 200.0);
		myShapes[1].setLocation((bounds.width/2.0) - 50.0, 195.0);
		
		((MyTriangle)myShapes[2]).set(-25.0, 25.0, 0.0, -25.0, 25.0, 25.0);
		myShapes[2].setLocation((bounds.width/2.0), 5.0 + 80.0);
		
		((MyLine)myShapes[3]).set(0.0, 0.0, 400.0, 0.0);
		myShapes[3].setLocation((bounds.width/2.0) - 200.0, 395.0);
		
		((MyCircle)myShapes[4]).setRadius(60.0);
		myShapes[4].setLocation((bounds.width/2.0) + 200.0, 80.0);
	}
	
	public void paint(Graphics g) {
		ga = (Graphics2D)g;
		int oldw = bounds.width;
		int oldh = bounds.height;
		bounds = this.getBounds();
		if (bounds.width != oldw || bounds.height != oldh) {
			updateDrawing();
			revalidate();
			repaint();
		}
		else {
		for (int i = 0; i<lastShapeIndex; i++) {
			System.out.println("drawing...." + i);
			ga.setPaint(new Color(myShapes[i].color.r(),
								  myShapes[i].color.g(),
								  myShapes[i].color.b()));
			myShapes[i].draw(ga);
			}
		}
		
//		Shape circle = new Ellipse2D.Double(50, 50, 20, 25);
//		ga.fill(circle);
	}
}