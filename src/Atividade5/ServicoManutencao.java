package Atividade5;

public class ServicoManutencao {

	private String descricao;
	private double custo;

	public ServicoManutencao() {

	}

	public ServicoManutencao(String descricao) {
		setDescricao(descricao);
	}

	public ServicoManutencao(String descricao, double custo) {
		setDescricao(descricao);
		setCusto(custo);
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCusto() {
		return this.custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

}
