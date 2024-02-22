package SistemaVendas;

import java.util.Date;

public class Pedido {

	private int numero;
	private Date data;
	private int qtdItens;

	public boolean setNumero(int num) {
		this.numero = num;
		return true;
	}

	public int getNumero() {
		return this.numero;
	}

	public boolean setDate(Date data) {
		this.data = data;
		return true;
	}

	public Date getDate() {
		return this.data;
	}

	public boolean setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
		return true;
	}

	public int getQtdItens() {
		return this.qtdItens;
	}

}
