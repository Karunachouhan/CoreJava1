package in.co.oop.constructor;

public class TestShape {
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
        Circle c1 = new Circle("Red",32,4);
        
        //System.out.println();
        
        //Rectangle r = new Rectangle("Green",20,2,3);
        
        //System.out.println();
        
        Triangle t = new Triangle("Blue",23,15,23);
        System.out.println(t.getBase());
        System.out.println(t.getHeight());
        System.out.println(t.getColor());
        System.out.println(t.getBoaderWidth());
	}

}
