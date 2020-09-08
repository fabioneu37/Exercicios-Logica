package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CotacaoDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();

		System.out.println("How many dollars will be bought? ");
		double dollar = sc.nextDouble();

		double calculo = CurrencyConverter.calculoDolar(price, dollar);

		System.out.printf("Amount to be paid in reais: %.2f%n ", calculo);

		sc.close();

	}

}
