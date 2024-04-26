/**
 * 
 * @author João Paulo
 * 
 */

package Atividade5;

public class Gerador extends ProdutoWeg {

	private String combustivel;
	private double autonomia;

	public Gerador() {

	}

	public Gerador(int codigo) {
		super(codigo);
	}

	public Gerador(int codigo, String tipo) {
		super(codigo, tipo);
	}

	public Gerador(int codigo, String tipo, double potencia) {
		super(codigo, tipo, potencia);
	}

	public Gerador(int codigo, String tipo, double potencia, double tensao) {
		super(codigo, tipo, potencia, tensao);
	}

	public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade) {
		super(codigo, tipo, potencia, tensao, capacidade);
	}

	public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
	}

	public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String combustivel) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setCombustivel(combustivel);
	}

	public Gerador(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String combustivel, double autonomia) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setCombustivel(combustivel);
		setAutonomia(autonomia);
	}

	public String getCombustivel() {
		return this.combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getAutonomia() {
		return this.autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

}
