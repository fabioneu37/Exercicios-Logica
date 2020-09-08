package Aplication;

import java.util.Random;
import java.util.Scanner;

public class Matriz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random numeros = new Random();

		int[][] mat = new int[3][3];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = numeros.nextInt(100);
			}
		}

		System.out.println("Imprimindo a Matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		int contPar = 0;
		int contImpar = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] % 2 == 0) {
					contPar++;
				} else {
					contImpar++;
				}
			}
		}
		System.out.println();
		System.out.println("A quantidade de números pares é: " + contPar);
		System.out.println("A quantidade de números ímpares é: " + contImpar);
		sc.close();
	}
}
