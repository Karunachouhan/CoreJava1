package in.co.oop.constructor;

public class Circle extends Shape{
	private int radius;
	
	public Circle() {
		System.out.println("Default constructor");
	}
	public Circle(String color,int boaderWidth,int radius) {
		super(color,boaderWidth);
		this.radius = radius;
		
		
	}
	
	public int getRadius() {
		return this.radius;
	}

}
