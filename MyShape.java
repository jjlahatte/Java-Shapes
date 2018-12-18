//Filename: MyColor.java
//an encapsulation of pro of shapes
//Jason LaHatte
//12/8/2018
//
import java.awt.*;

public abstract class MyShape {
	public MyPoint center;
	public double rotation;
	public MyColor color;
	
	public MyShape() {
		this.color = new MyColor();
		this.center = new MyPoint();
		this.rotation = 0.0;
		System.out.println("shape created");
	}
	
	public void setLocation(MyPoint p) {
		this.center = p;
	}
	
	public void setLocation(double x, double y) {
		this.center.x(x);
		this.center.y(y);
	}
	
	public abstract double calcArea();
//	public abstract boolean draw();
   public abstract boolean draw(Graphics2D ga);
}
