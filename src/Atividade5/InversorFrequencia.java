package Atividade5;

public class InversorFrequencia extends ProdutoWeg {

	private double capFreq;
	private int numeroFases;

	public InversorFrequencia() {

	}

	public InversorFrequencia(int codigo) {
		super(codigo);
	}

	public InversorFrequencia(int codigo, String tipo) {
		super(codigo, tipo);
	}

	public InversorFrequencia(int codigo, String tipo, double potencia) {
		super(codigo, tipo, potencia);
	}

	public InversorFrequencia(int codigo, String tipo, double potencia, double tensao) {
		super(codigo, tipo, potencia, tensao);
	}

	public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade) {
		super(codigo, tipo, potencia, tensao, capacidade);
	}

	public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
	}

	public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			double capFreq) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setCapFreq(capFreq);
	}

	public InversorFrequencia(int codigo, String tipo, double potencia, double tensao, int capacidade, double preco,
			double capFreq, int numeroFases) {
		super(codigo, tipo, potencia, tensao, capacidade, preco);
		setCapFreq(capFreq);
		setNumeroFases(numeroFases);
	}

	public double getCapFreq() {
		return this.capFreq;
	}

	public void setCapFreq(double capFreq) {
		this.capFreq = capFreq;
	}

	public int getNumeroFases() {
		return this.numeroFases;
	}

	public void setNumeroFases(int numeroFases) {
		this.numeroFases = numeroFases;
	}

}
