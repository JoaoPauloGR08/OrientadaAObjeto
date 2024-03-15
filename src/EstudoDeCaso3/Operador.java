package EstudoDeCaso3;

public class Operador {

	private Maquina maquina;
	private Funcionario funcionario;
	private int idOperador;
	private String habilidade;
	private boolean statusMaquina;

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

	public Maquina getMaquina() {
		return this.maquina;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}

	public int getIdOperador() {
		return this.idOperador;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	public String getHabilidade() {
		return this.habilidade;
	}

	public void setStatusMaquina(boolean statusMaquina) {
		this.statusMaquina = statusMaquina;
	}

	public boolean getStatusMaquina() {
		return statusMaquina;
	}

}