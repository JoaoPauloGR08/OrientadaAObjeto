package EstudoDeCaso3;

import java.util.ArrayList;

public class Produto {

	private int idProduto;
	private float preco;
	private int tempoProducao;
	private String processoFabricacao;
	private ArrayList<ComponenteFabrica> componenteFabrica = new ArrayList<>();

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
		this.componenteFabrica.add(componente);
	}

	public void removerComponente(int indice) { // Implementação para remover componente
		this.componenteFabrica.remove(indice);
	}

}
