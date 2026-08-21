package in.co.oop.inheritance;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("---------Rectangle---------");

		Rectangle r = new Rectangle();
		r.setColor("Red");
		r.setBorderWidth(1);
		r.setLength(5);
		r.setWidth(3);

		System.out.println("Color = " + r.getColor());
		System.out.println("Border width = " + r.getBorderWidth());
		System.out.println("Length = " + r.getLength());
		System.out.println("Width = " + r.getWidth());
		r.area();
		
		
		System.out.println("---------Circle---------");
        Circle c = new Circle();
        c.setColor("Green");
        c.setBorderWidth(2);
        c.setRadius(2);
      
        
        System.out.println("Color = "+c.getColor());
        System.out.println("BorderWidth = "+c.getBorderWidth());
        System.out.println("Radius = "+c.getRadius());
        c.area();
        
        System.out.println("---------Triangle---------");
        Triangle t = new Triangle();
        t.setColor("Blue");
        t.setBorderWidth(3);
        t.setBase(4);
        t.setHeight(5);
        
        System.out.println("Color = "+t.getColor());
        System.out.println("Border width = " + t.getBorderWidth());
		System.out.println("Base = " + t.getBase());
		System.out.println("Height = " + t.getHeight());
		t.area();
	}
}
