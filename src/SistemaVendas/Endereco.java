package SistemaVendas;

public class Endereco {

	private String rua;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cep;

	public boolean setRua(String rua) {
		if (rua.length() >= 2) {
			this.rua = rua;
			return true;
		}
		return false;
	}

	public String getRua() {
		return this.rua;
	}

	public boolean setNumero(int num) {
		if (num > 0) {
			this.numero = num;
			return true;
		}
		return false;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setComp(String comp) {
		this.complemento = comp;
	}

	public String getComp() {
		return this.complemento;
	}

	public boolean setBairro(String bairro) {
		if (bairro.length() >= 2) {
			this.bairro = bairro;
			return true;
		}
		return false;
	}

	public String getBairro() {
		return this.bairro;
	}

	public boolean setCEP(String cep) {
		if (cep.length() == 8 && cep.matches(".*[0-9].*")) {
			this.cep = cep;
			return true;
		}
		return false;
	}

	public String getCEP() {
		return this.cep.substring(0, 5) + "-" + this.cep.substring(5, 8);
	}

}
