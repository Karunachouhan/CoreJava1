package in.co.oop.abstraction;

public class Triangle extends Shape {
	private int b;
	private int h;

	public void setB(int base) {
		this.b = base;
	}

	public int getB() {
		return b;
	}

	public void setH(int height) {
		this.h = height;
	}

	public int getH() {
		return h;
	}

	@Override
	public void area() {
     System.out.println("Area of triangle = "+ 0.5*b*h);
	}
}
