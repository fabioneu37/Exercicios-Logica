package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import util.Lista;

public class TreinaLista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lista> list = new ArrayList<>();

		System.out.print("Quantos Funcionários serão registrados: ");
		Double n = sc.nextDouble();

		for (int i = 1; i <= n; i++) {
			System.out.print("entre com o Id: ");
			int id = sc.nextInt();
			System.out.print("Entre com o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("entre com o salário: ");
			double salario = sc.nextDouble();

			Lista emp = new Lista(id, nome, salario);
			list.add(emp);
		}

		System.out.println("");
		System.out.print("Coloque o Id do colaborador que vai ter aumento: ");
		int idsalario = sc.nextInt();
		Lista emp = list.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("Esse Id não existe! ");
		}

		else

		{
			System.out.println("Qual porcetagem de aumento: ");
			double porcetagem = sc.nextDouble();
			emp.aumento(porcetagem);
		}

		for (Lista x : list) {
			System.out.println(x);
		}

		sc.close();

	}

	public static Integer posicao(List<Lista> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
