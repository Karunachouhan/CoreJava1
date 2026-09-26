package in.co.oop.constructor;

public class Shape {

	protected String color;
	protected int boaderWidth;

	public Shape() {
		System.out.println("this is a default constructor");
	}

	public Shape(String color, int boaderWidth) {
		this.color = color;
		this.boaderWidth = boaderWidth;
		
	}

	public String getColor() {
		return this.color;
	}

	public int getBoaderWidth() {
		return this.boaderWidth;
	}

}
