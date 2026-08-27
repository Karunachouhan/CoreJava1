package in.co.oop.encapsulation;

public class AutoMobile {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void changeGear(int gear) {
		switch (gear) {
		case 1:
			speed = 20;
			System.out.println("Gear.1 speed = " + speed);
			break;
		case 2:
			speed = 40;
			System.out.println("Gear.2 speed = " + speed);
			break;
		case 3:
			speed = 60;
			System.out.println("Gear.3 speed = " + speed);
			break;
		case 4:
			speed = 80;
			System.out.println("Gear.4 speed = " + speed);
			break;
		case 5:
			speed = 100;
			System.out.println("Gear.5 speed = " + speed);
			break;
		case 6:
			speed = 120;
			System.out.println("Gear.6 speed = " + speed);
			break;

		default:
			System.out.println("Invalid gear");
		}
	}

	public void accelerator() {
		this.speed = this.speed + 10;
		System.out.println("Accelerated speed = " + speed);
	}

	public void breakVehical() {
		this.speed = this.speed - 10;
		if (this.speed == 0) {
			System.out.println("Vehical stoped");
		} else {
			System.out.println("apply break, speed =" + speed);
		}
	}
}
