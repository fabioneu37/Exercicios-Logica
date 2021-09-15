package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Produto;

public class array2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Produto[] vect = new Produto[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;

		System.out.printf("AVAREGE PRICE = %.2f%n", avg);

		sc.close();
	}

}
