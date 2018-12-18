//Filename: Polygon.java00000000000
//class to encapsulate properties of polygon0
//Jason LaHatte
//12/8/2018
//
//import java.awt.*;
//import java.awt.geom.*;

public abstract class MyPolygon extends MyShape {
		protected int numSides;
		
	public MyPolygon() {
		this.numSides = 0;
		System.out.println("Polygon created");
	}
}