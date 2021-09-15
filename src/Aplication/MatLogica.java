package Aplication;

import java.util.Scanner;

public class MatLogica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n != 0) {

			int[][] mat = new int[n][n];
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					mat[i][j] = Math.abs(i-j);
				}
			}
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					System.out.printf(" %3d", mat[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			n = sc.nextInt();
		}

		sc.close();
	}

}
