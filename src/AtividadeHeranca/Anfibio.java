package AtividadeHeranca;

public class Anfibio extends Animal {

	private double mediaPorGeracao;
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Média de filhotes por gestação: " + mediaPorGeracao);
	}

	public double getMediaPorGeracao() {
		return mediaPorGeracao;
	}

	public void setMediaPorGeracao(double mediaPorGeracao) {
		this.mediaPorGeracao = mediaPorGeracao;
	}
	
}
