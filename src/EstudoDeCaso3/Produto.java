package EstudoDeCaso3;

public class Produto {

	private int idProduto;
	private float preco;
	private int tempoProducao;
	private String processoFabricacao;

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public int getIdProduto() {
		return this.idProduto;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return this.preco;
	}

	public void setTempoProducao(int tempoProducao) {
		this.tempoProducao = tempoProducao;
	}
	
	public int getTempoProducao() {
		return this.tempoProducao;
	}

	public void setProcessoFabricacao(String processoFabricacao) {
		this.processoFabricacao = processoFabricacao;
	}
	
	public String getProcessoFabricacao() {
		return this.processoFabricacao;
	}

	public void adicionarComponente(ComponenteFabrica componente) { // Implementação para adicionar componente

	}

	public void removerComponente(ComponenteFabrica componente) { // Implementação para remover componente

	}

}
