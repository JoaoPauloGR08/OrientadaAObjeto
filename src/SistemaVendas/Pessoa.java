package SistemaVendas;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private Endereco endereco;

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public boolean setNome(String nome) {
		if (nome.matches(".*[a-zA-Z].*")) {
			this.nome = nome;
			return true;
		}
		return false;
	}

	public String getNome() {
		return this.nome;
	}

	public boolean setCpf(String cpf) {
		this.cpf = cpf;
		return true;
	}

	public String getCpf() {
		return this.cpf.substring(0, 3) + "." + this.cpf.substring(3, 6) + "." + this.cpf.substring(6, 9) + "-"
				+ this.cpf.substring(9, 11);
	}

	public boolean setRg(String rg) {
		this.rg = rg;
		return true;
	}

	public String getRg() {
		return this.rg.substring(0, 2) + "." + this.rg.substring(2, 5) + "." + this.rg.substring(5, 8) + "-" + this.rg.substring(8);
	}

}
