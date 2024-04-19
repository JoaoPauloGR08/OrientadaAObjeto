package GerenciamentoFuncionario;

public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("João", 30, 3000.0);
		Gerente gerente1 = new Gerente("Eduardo", 35, 5000.0, 1000.0);
		Diretor diretor1 = new Diretor("Caio", 45, 10000.0, 37);

		funcionario1.mostrarInformacoes();
		gerente1.mostrarInformacoes();
		diretor1.mostrarInformacoes();
		
	}
}

class Funcionario {
	
	private String nome;
	private int idade;
	private double salario;

	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalario() {
		return this.salario;
	}

	public void mostrarInformacoes() {
		System.out.println("=------------=-------------=");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salário: " + getSalario());
	}
}

class Gerente extends Funcionario {
	
	private double bonus;

	public Gerente(String nome, int idade, double salario, double bonus) {
		super(nome, idade, salario);
		this.bonus = bonus;
	}

	public double getBonus() {
		return this.bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void mostrarInformacoes() {
		super.mostrarInformacoes();
		System.out.println("Bônus: " + getBonus());
	}
	
}

class Diretor extends Funcionario {

	private int acoes;

	public Diretor(String nome, int idade, double salario, int acoes) {
		super(nome, idade, salario);
		this.acoes = acoes;
	}

	public int getAcoes() {
		return this.acoes;
	}

	public void setAcoes(int acoes) {
		this.acoes = acoes;
	}
	
	public double ganhoAcoes() {
		return (getSalario() * 0.01) * acoes;
	}

	@Override
	public void mostrarInformacoes() {
		super.mostrarInformacoes();
		System.out.println("Ganho das ações: " + ganhoAcoes());
		System.out.println("Ações: " + getAcoes());
	}
}
