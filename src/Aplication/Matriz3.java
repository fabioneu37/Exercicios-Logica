package Aplication;

import java.util.Random;
import java.util.Scanner;

public class Matriz3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random numeros = new Random();

		int[][] mat = new int[10][10];

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = numeros.nextInt(100);
			}
		}

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}
		int maiorL5 = 0;
		int menorL5 = 100;

		for (int i = 0; i < mat[5].length; i++) {
			if (mat[5][i] > maiorL5) {
				maiorL5 = mat[5][i];
			}
			if(mat[5][i] < menorL5) {
				menorL5 = mat[5][i];
			}
		}
		System.out.println();
		System.out.println("O maior número da linha 5: "+maiorL5);
		System.out.println("O menor número da linha 5: "+menorL5);
		System.out.println();
		
		int maiorC7 = 0;
		int menorC7 = 100;
		int col7 = 7;
		
		for (int i = 0; i < mat.length; i++) {
			if(mat[i][col7] > maiorC7) {
				maiorC7 = mat[i][col7];
			}
			if(mat[i][col7] < menorC7) {
				maiorC7 = mat[i][col7];
			}
		}
		System.out.println("O maior número da coluna 7: "+maiorC7);
		System.out.println("O maior número da coluna 7: "+menorC7);
		sc.close();
	}
}
