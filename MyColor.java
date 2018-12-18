//Filename: MyColor.java
//Class to encapsulate properties for color
//Jason LaHatte
//12/8/2018

public class MyColor {
	final int MIN_VALUE = 0;  //final is comparable to const in c++
	final int MAX_VALUE = 0;
	private int colorR;
	private int colorG;
	private int colorB;
	
	//Constructors
	public MyColor() {
		colorR = 0;
		colorG = 0;
		colorB = 0;
	}
	
	public MyColor(int red, int green, int blue) {
		r(red);
		g(green);
		b(blue);
	}
	
	//Accessor functions
	public int r() {return colorR;}
	public int g() {return colorG;}
	public int b() {return colorB;}
	public void r(int red) {
		if (red >= MIN_VALUE && red <=MAX_VALUE) colorR = red;
	}
	public void g(int green) {
		if (green >= MIN_VALUE && green <=MAX_VALUE) colorG = green;
	}
	public void b(int blue) {
		if (blue >= MIN_VALUE && blue <=MAX_VALUE) colorB = blue;
	}
	
	public void set(int red, int green, int blue) {
		this.r(red);
		this.g(green);
		this.b(blue);
	}
}
	