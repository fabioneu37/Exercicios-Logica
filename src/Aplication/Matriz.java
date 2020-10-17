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
			System.out.print(mat[l][l] + " ");
		}
		System.out.println();
		System.out.println("Diagonal Secundária: ");
		for (int l = 0; l < mat.length; l++) {
			System.out.print(mat[l][m - 1 -l] + " ");
		}
		 
		sc.close();
	}

}
