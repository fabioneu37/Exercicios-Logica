package util;

public class CurrencyConverter {

	public static double calculoDolar(double dolar, double price) {

		return ((dolar * price * 6) / 100) + dolar * price;

	}

}
