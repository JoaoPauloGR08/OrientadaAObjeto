/**
 * 
 * @author João Paulo
 * 
 */

package Atividade5;

public class ServicoManutencao {

	private int codigo;
	private String descricao;
	private double custo;
	private ProdutoWeg prod = new ProdutoWeg();

	public ServicoManutencao() {

	}

	public ServicoManutencao(int codigo) {
		setCodigo(codigo);
	}

	public ServicoManutencao(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
	}

	public ServicoManutencao(int codigo, String descricao, double custo) {
		setCodigo(codigo);
		setDescricao(descricao);
		setCusto(custo);
	}

	public ServicoManutencao(int codigo, String descricao, double custo, ProdutoWeg prod) {
		setCodigo(codigo);
		setDescricao(descricao);
		setCusto(custo);
		setProd(prod);
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

	public int getProdCod() {
		return this.prod.getCodigo();
	}

	public void setProd(ProdutoWeg prod) {
		this.prod = prod;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
