package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {

	public static void main(String[] args) {

		method1();

		System.out.println("End of Program");

	}

	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {

		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			sc.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
		} catch (InputMismatchException e) {
			System.out.println("input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}
