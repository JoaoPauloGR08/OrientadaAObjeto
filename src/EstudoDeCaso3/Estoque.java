package EstudoDeCaso3;

import java.util.Date;

public class Estoque {

	private int idEntrega;
	private String nome;
	private Date validade;
	private Date dataCompra;
	private int quantidade;

	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}

	public int getIdEntrega() {
		return this.idEntrega;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Date getValidade() {
		return this.validade;
	}

	public void setCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getCompra() {
		return this.dataCompra;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

}
