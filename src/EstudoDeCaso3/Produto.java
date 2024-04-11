package EstudoDeCaso3;

import java.util.ArrayList;

public class Produto {

	private String idProduto;
	private String nomeProduto;
	private float preco;
	private int tempoProducao;
	private String processoFabricacao;
	private ArrayList<ComponenteFabrica> componenteFabrica = new ArrayList<>();

	public void setNome(String nome) {
		this.nomeProduto = nome;
	}
	
	public String getNome() {
		return this.nomeProduto;
	}
	
	public void setIdProduto(String id) {
		this.idProduto = id;
	}
	
	public String getIdProduto() {
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
