package Atividade5;

public class MotorEletrico extends ProdutoWeg {

	private String tipoRolamento;
	private double eficiencia;

	public MotorEletrico() {

	}

	public MotorEletrico(int codigo) {
		super(codigo);
	}

	public MotorEletrico(int codigo, String tipo) {
		super(codigo, tipo);
	}

	public MotorEletrico(int codigo, String tipo, double potencia) {
		super(codigo, tipo, potencia);
	}

	public MotorEletrico(int codigo, String tipo, double potencia, double tensao) {
		super(codigo, tipo, potencia, tensao);
	}

	public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade) {
		super(codigo, tipo, potencia, tensao, capacidade);
	}

	public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
	}

	public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String tipoRolamento) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setTipoRolamento(tipoRolamento);
	}

	public MotorEletrico(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			String tipoRolamento, double eficiencia) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setTipoRolamento(tipoRolamento);
		setEficiencia(eficiencia);
	}

	public String getTipoRolamento() {
		return this.tipoRolamento;
	}

	public void setTipoRolamento(String tipoRolamento) {
		this.tipoRolamento = tipoRolamento;
	}

	public double getEficiencia() {
		return this.eficiencia;
	}

	public void setEficiencia(double eficiencia) {
		this.eficiencia = eficiencia;
	}

	public void getInfo() {
		System.out.println(getCodigo());
		System.out.println(getTipo());
		System.out.println(getPotencia());
		System.out.println(getTensao());
		System.out.println(getCapacidade());
		System.out.println(getPreco());
		System.out.println(getTipoRolamento());
		System.out.println(getEficiencia());
	}

}
