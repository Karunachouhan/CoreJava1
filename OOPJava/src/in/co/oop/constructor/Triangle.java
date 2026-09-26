package in.co.oop.constructor;

public class Triangle extends Shape {
     
	private int base;
	private int height;
	
	public Triangle(String color,int boaderWidth,int base,int height) {
		super(color,boaderWidth);
		this.base = base;
		this.height = height;
		
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getHeight() {
		return this.height;
	}
}
