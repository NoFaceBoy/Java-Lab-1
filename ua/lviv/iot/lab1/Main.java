package ua.lviv.iot.lab1;

public class Main {

	public static void main(String[] args) {
		Juicer Tefal = new Juicer();
		Juicer Bosch = new Juicer(900, "Bosch", "centryfug");
		Juicer Phillips = new Juicer("silver", 30, 800, "Phillips", "shnek", 0.7);
		
		System.out.println(Tefal);
		System.out.println(Bosch);
		System.out.println(Phillips);
		
		System.out.println("Amount of juicers sold: " + Juicer.displayAmountOfJuicersSold());
	}
}