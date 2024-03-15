package EstudoDeCaso3;

import java.util.Date;

public class Funcionario {

	private String idFuncionario;
	private String nome;
	private String cargo;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private Date dataAdmisao;
	private float cargaHoraria;
	private float salario;

	public void setId(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getId() {
		return this.idFuncionario;
	}

	public boolean setNome(String nome) {
		if (nome.matches(".[a-zA-Z].")) {
			this.nome = nome;
			return true;
		}
		return false;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return this.cargo;
	}

	public boolean setCpf(String cpf) {
		if (cpf.length() == 11) {

			return true;
		}
		return false;
	}

	public String getCpf() {
		return this.cpf;
	}

	public boolean setRg(String rg) {
		if (rg.length() == 8) {

			return true;
		}
		return false;
	}

	public String getRg() {
		return this.rg;
	}

	public void getDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date setdataNascimento() {
		return this.dataNascimento;
	}

	public void getDataAdmisao(Date dataAdmisao) {
		this.dataAdmisao = dataAdmisao;
	}

	public Date setDataAdmisao() {
		return this.dataAdmisao;
	}

	public boolean getCargaHoraria(float cargaHoraria) {
		if (cargaHoraria > 220) {

			return true;
		}
		return false;
	}

	public float setCargaHoraria() {
		return this.cargaHoraria;
	}

	public void getSalario(float salario) {
		this.salario = salario;
	}

	public float setSalario() {
		return this.salario;
	}
}