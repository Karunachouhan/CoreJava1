package in.co.oop.constructor;

public class Rectangle extends Shape {
	 
	private int length;
	private int width;
	
	public Rectangle(String color,int boaderWidth,int length,int width) {
		super(color,boaderWidth);
		this.length = length;
		this.width = width;
		
	}
	
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}

}
