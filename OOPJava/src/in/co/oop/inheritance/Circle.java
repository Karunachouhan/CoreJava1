package in.co.oop.inheritance;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void area() {
		double area = 3.14*this.radius*this.radius;
		System.out.println("Area of circle = "+area);
	}

}
