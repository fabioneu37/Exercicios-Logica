package Aplication;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random numerosAleatorios = new Random();

		System.out.print("informe o número de linhas: ");
		int n = sc.nextInt();

		System.out.print("informe o número de colunas: ");
		int m = sc.nextInt();

		int[][] mat = new int[n][m];
		System.out.println("-----------------------------");

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = numerosAleatorios.nextInt(100);
			}
		}

		System.out.println("Imprimindo a Matriz ");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}

		System.out.print("Numero que tenha na matriz:");
		int x = sc.nextInt();

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				if (mat[l][c] == x) {
					System.out.println("Posição " + l + "," + c + ":");
					if (c > 0) {
						System.out.println("Left: " + mat[l][c - 1]);
					}
					if (l > 0) {
						System.out.println("Up: " + mat[l - 1][c]);
					}
					if (c < mat[l].length - 1) {
						System.out.println("Right: " + mat[l][c + 1]);

					}
					if (l < mat.length - 1) {
						System.out.println("Down: " + mat[l + 1][c]);
						
					}

				}
			}
		}
		sc.close();

	}
}
