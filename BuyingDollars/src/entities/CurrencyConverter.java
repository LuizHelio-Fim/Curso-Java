package entities;

public class CurrencyConverter {

	public static double dollar;
	public static double quantity;
	
	public static double iof() {
		return (dollar*quantity) * 6/100;
	}
	
	public static double converter() {
		return (dollar*quantity) + iof();
	}
}
