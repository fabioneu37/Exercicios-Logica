package util;

public class Lista {
	
	private Integer id;
	private String nome;
	private Double salario;
	 
	public Lista(Integer id, String nome, Double salary) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salario;
	}

	public void setSalary(Double salary) {
		this.salario = salary;
	}
	
	public void aumento(double aumento) {
		
		salario = salario + salario * aumento / 100.0;
	}
	
	@Override
	public String toString() {
		
		return "Id :" + id + " ,"+ "Nome: "+ nome +" ,"+"Salário "+ String.format("%.2f", salario);
	}
	
}
  