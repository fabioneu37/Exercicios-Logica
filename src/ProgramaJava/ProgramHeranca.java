package ProgramaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
//import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramHeranca {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		/*
		 * Account acc1 = new Account(1001, "Alex", 1000.0); acc1.withdraw(200.0);
		 * System.out.println(acc1.getBalance());
		 * 
		 * Account acc2 = new SavingsAccount(1002, "David", 1000.0, 0.01);
		 * acc2.withdraw(200.0); System.out.println(acc2.getBalance());
		 * 
		 * Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		 * acc3.withdraw(200.00); System.out.println(acc3.getBalance());
		 */

		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 500.0, 500.0));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total Balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
