package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Qual o numero da Conta: ");
		int number = sc.nextInt();

		System.out.print("Nome proprietário conta: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Tem um valor para depositar (y/n)? ");
		char resposta = sc.next().charAt(0);
		

		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldoInicial = sc.nextDouble();
			account = new Account(number, nome, saldoInicial);
		} else {
			account = new Account(number, nome);
		}

		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Digite o valor para deposito: ");
		double deposito = sc.nextDouble();
		account.deposito(deposito);
		System.out.println("Dados da Conta: ");
		System.out.println(account);
		System.out.print("Digite um valor para ser sacado :");
		double valorSacar = sc.nextDouble();
		account.saca(valorSacar);
		System.out.println(account);

		sc.close();
	}
}
