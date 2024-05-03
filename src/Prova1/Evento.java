package Prova1;

public class Evento extends Usuario {

	private String titulo;
	private String data;
	private int dia;
	private int mes;
	private int ano;
	private String localizacao;
	private String descricao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData() {
		return data;
	}

	public void setData() {
		this.data = dia + "/" + mes + "/" + ano;
	}

	public int getDia() {
		return dia;
	}

	public boolean setDia(int dia) {
		if (dia <= 31) {
			this.dia = dia;
			return true;
		}
		return false;
	}

	public int getMes() {
		return mes;
	}

	public boolean setMes(int mes) {
		if (mes <= 12) {
			this.mes = mes;
			return true;
		}
		return false;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano <= 2025 && ano >= 2024) {
			this.ano = ano;
		}
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		if (localizacao.length() > 5) {
			this.localizacao = localizacao;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean setDescricao(String descricao) {
		if (descricao.length() > 10) {
			this.descricao = descricao;
			return true;
		}
		return false;
	}

}
