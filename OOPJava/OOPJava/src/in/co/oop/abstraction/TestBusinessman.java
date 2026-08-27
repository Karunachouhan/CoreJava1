package in.co.oop.abstraction;

public class TestBusinessman {

	public static void main(String[] args) {
		Richman r = new Businessman();
		r.earnMoney();
		r.donation();
		r.party();

		System.out.println("---------------------------");

		HelpToOthers h = new Businessman();
		h.helpOthers();
	}

}
