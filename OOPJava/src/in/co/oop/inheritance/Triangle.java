package in.co.oop.inheritance;

public class Triangle extends Shape {

	private double base;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void area() {
		double area = 0.5*this.base*this.height;
		System.out.println("area of triangle = "+area);
	}
}
