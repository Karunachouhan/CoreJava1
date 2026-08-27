package in.co.oop.encapsulation;

public class TestAutoMobile {
	public static void main(String[] args) {
		AutoMobile ab = new AutoMobile();

		ab.setColor("black");
		ab.setMake("Toyota");
		ab.setSpeed(100);

		System.out.println("Color = " + ab.getColor());
		System.out.println("Make by = " + ab.getMake());
		System.out.println("Speed = " + ab.getSpeed());
        ab.changeGear(4);
        System.out.println("Speed = " + ab.getSpeed());
        ab.accelerator();
        ab.breakVehical();
	}
}
