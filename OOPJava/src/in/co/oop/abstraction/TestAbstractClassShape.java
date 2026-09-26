package in.co.oop.abstraction;

public class TestAbstractClassShape {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Circle c = (Circle) s1; // typecasting
		c.setR(5);
		System.out.println("Radius = " + c.getR());
		c.area();
		
		System.out.println("-------------------------");
		Shape s2 =  new Rectangle();
		Rectangle r = (Rectangle) s2;
		r.setB(2);
		r.setL(3);
		System.out.println("length = "+r.getL());
		System.out.println("breath = "+r.getB());
		r.area();
		
		System.out.println("-------------------------");
		Shape s3 = new Triangle();
		Triangle t = (Triangle) s3;
		t.setB(2);
		t.setH(3);
		System.out.println("Base = "+t.getB());
		System.out.println("Height = "+t.getH());
		t.area();
	}
}
