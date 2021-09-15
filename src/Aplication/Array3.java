package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 10) {
				System.out.println(
						"Vetor na posição " + i + " é maior do que 10 " + " numero armazenado no vetor " + vetor[i]);
			}
		}

		sc.close();

	}

}
