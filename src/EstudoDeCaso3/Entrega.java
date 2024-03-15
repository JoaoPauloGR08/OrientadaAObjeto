package EstudoDeCaso3;

import java.util.Date;

public class Entrega {

	private int idEntrega;
	private Date previsao;
	private Date dataEnvio;

	public void setId(int idEntrega) {
		this.idEntrega = idEntrega;
	}

	public int getId() {
		return this.idEntrega;
	}

	public void setPrevisao(Date previsao) {
		this.previsao = previsao;
	}

	public Date getPrevisao() {
		return this.previsao;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Date getDataEnvio() {
		return this.dataEnvio;
	}

}
