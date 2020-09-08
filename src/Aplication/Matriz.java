package Aplication;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Random numeros = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("Informar o tamanho da Matriz número de linhas e colunas: ");
		int m = sc.nextInt();
		int[][] mat = new int[m][m];

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				mat[l][c] = numeros.nextInt(100);
			}
		}
		System.out.println("imprime a matriz digitada");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}

		System.out.println("Diagonal principal: ");
		for (int l = 0; l < mat.length; l++) {
			System.out.println(mat[l][l] + " ");
		}
		System.out.println("Mostra os numeros negativos da Matriz");
		int cont = 0;
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				if (mat[l][c] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Os numeros negativos são: " + cont);
		sc.close();
	}

}
