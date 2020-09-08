package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util.Employee;

public class PrincipalList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id :");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("Id already Taken! Try again: ");
				 id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}

		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			// list.get(emp).increaseSalary(percent);
			emp.increaseSalary(percent);
		}

		System.out.println("");
		System.out.println("List of employees");
		for (Employee x : list) {
			System.out.println(x);
		}

		sc.close();

	}

	public static Integer position(List<Employee> List, int id) {
		for (int i = 0; i < List.size(); i++) {
			if (List.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
