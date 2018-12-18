//Filename: MyPoint.java
//Class to encapsulate properties for point
//Jason LaHatte
//12/8/2018

public class MyPoint {
	private double locationX;
	private double locationY;
	
	//Constructors
	public MyPoint() {
		locationX = 0.0;
		locationY = 0.0;
		//System.out.println("Point Created");
	}
	
	public MyPoint(double x, double y) {
		locationX = x;
		locationY = y;
		//..System.out.println("Point Created");
	}
	
	//Accessor Functions
	public void set(double x, double y) {locationX = x; locationY = y;}
	public void x(double x) {locationX = x;}
	public void y(double y) {locationY = y;}
	public double x() {return locationX;}
	public double y() {return locationY;}
	
	public double calcDistance(MyPoint p2) {
		return Math.sqrt(Math.pow(this.x() - p2.x(), 2) +
						 Math.pow(this.y() - p2.y(), 2));
	}
	
	public static double calcDistance(MyPoint p1, MyPoint p2) {
		return p1.calcDistance(p2);
	}
}
	