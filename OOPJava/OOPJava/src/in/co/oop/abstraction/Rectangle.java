package in.co.oop.abstraction;

public class Rectangle extends Shape {
	private int l;
	private int b;

	public void setL(int len) {
		this.l = len;
	}

	public int getL() {
		return l;
	}

	public void setB(int bre) {
		this.b = bre;
	}

	public int getB() {
		return b;
	}

	@Override
	public void area() {
		System.out.println("area of rectangle = " + l * b);
	}
}
