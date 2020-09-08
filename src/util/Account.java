package util;

public class Account {

	private int number;
	private String nome;
	private double saldo;

	public Account(int number, String nome) {
		this.number = number;
		this.nome = nome;
	}

	public Account(int number, String nome, double saldoInicial) {
		this.number = number;
		this.nome = nome;
		deposito(saldoInicial);
	}

	public int getNumber() {
		return number;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saca(double valor) {
		saldo = saldo - valor - 5.0;
	}

	public String toString() {
		return "Conta " 
	           + number 
	           + ", Nome: " 
	           + nome 
	           + ", Saldo: $ " 
	           + String.format("%.2f", saldo);
	}
}
