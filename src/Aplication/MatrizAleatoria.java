package Aplication;

import java.util.Random;
import java.util.Scanner;

public class MatrizAleatoria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] numerosAleatorios = new int[4][4];

		Random numeroRadom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRadom.nextInt(100);
			}
		}

		int maior = 0;
		int linha = 0;
		int col = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
        System.out.println();
		System.out.println("O maior valor = " + maior);
		System.out.println("linha " + linha);
		System.out.println("coluna " + col);
		sc.close();
	}

}
