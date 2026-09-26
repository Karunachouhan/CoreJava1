package in.co.oop.abstraction;

public class Circle extends Shape {
	private int r;

	public void setR(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	@Override
	public void area() {

		System.out.println("Area of circle = " + Math.PI * r * r);
	}
}
