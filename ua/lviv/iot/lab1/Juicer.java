package ua.lviv.iot.lab1;

public record Juicer(String color, 
					int max_juice_liters_per_hour, 
					int power_consumption_in_kilowatts, 
					String manufacturer,
					String juicer_type,
					double juice_container_capacity_in_liters) {
	
	private static int amount_of_juicers_sold = 568;
	
	public Juicer(){
		this("none", 0, 0, "none", "none", 0);
		}
	
	public Juicer(int power_consumption_in_kilowatts, String manufacturer, String juicer_type) {
		this("black" ,50, power_consumption_in_kilowatts, manufacturer, juicer_type, 0.5);
	}
	
	@Override
	public String toString() {
		return String.format(
				"Juicer: \n Manufacturer: %s, \n Color: %s, \n Power in kilowatts: %d, \n Juicer type: %s,"
				+ "\n Juice container capacity in liters: %f, \n Max juice liters per hour: %d \n",
				manufacturer, color, power_consumption_in_kilowatts, juicer_type, 
				juice_container_capacity_in_liters, max_juice_liters_per_hour);	
	}
	
	public static int displayAmountOfJuicersSold() {
		return amount_of_juicers_sold;
	}
}
