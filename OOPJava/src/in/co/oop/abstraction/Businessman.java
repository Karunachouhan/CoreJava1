package in.co.oop.abstraction;

public class Businessman extends Person implements Richman, HelpToOthers {

	@Override
	public void earnMoney() {
		System.out.println("Earn money");

	}

	@Override
	public void donation() {
		System.out.println("Donation.......");
	}

	@Override
	public void party() {
		System.out.println("Party.........");

	}

	@Override
	public void helpOthers() {
		System.out.println("Help to others :) ");

	}

}
