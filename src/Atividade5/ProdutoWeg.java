/**
 * 
 * @author João Paulo
 * 
 */

package Atividade5;

public class ProdutoWeg {

	private int codigo;
	private String tipo;
	private double potencia;
	private double tensao;
	private int capacidade;
	private double preco;

	public ProdutoWeg() {

	}

	public ProdutoWeg(int codigo) {
		setCodigo(codigo);
	}

	public ProdutoWeg(int codigo, String tipo) {
		setCodigo(codigo);
		setTipo(tipo);
	}

	public ProdutoWeg(int codigo, String tipo, double potencia) {
		setCodigo(codigo);
		setTipo(tipo);
		setPotencia(potencia);
	}

	public ProdutoWeg(int codigo, String tipo, double potencia, double tensao) {
		setCodigo(codigo);
		setTipo(tipo);
		setPotencia(potencia);
		setTensao(tensao);
	}

	public ProdutoWeg(int codigo, String tipo, double potencia, double tensao, int capacidade) {
		setCodigo(codigo);
		setTipo(tipo);
		setPotencia(potencia);
		setTensao(tensao);
		setCapacidade(capacidade);
	}

	public ProdutoWeg(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
		setCodigo(codigo);
		setTipo(tipo);
		setPotencia(potencia);
		setTensao(tensao);
		setCapacidade(capacidade);
		setPreco(preco);
	}

	public int getCodigo() {
		return this.codigo;
	}

	public boolean setCodigo(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
			return true;
		}
		return false;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPotencia() {
		return this.potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getTensao() {
		return this.tensao;
	}

	public void setTensao(double tensao) {
		this.tensao = tensao;
	}

	public int getCapacidade() {
		return this.capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
