package EstudoDeCaso3;

public class AcessoSistema {
	
	private Maquina maquina;
	private Operador operador;
	private LinhaProd linhaProd;
	private int idSistema;
	
	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}
	
	public Maquina getMaquina() {
		return this.maquina;
	}
	
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
	public Operador getOperador() {
		return this.operador;
	}
	
	public void setLinhaProd(LinhaProd linhaProd) {
		this.linhaProd = linhaProd;
	}
	
	public LinhaProd getLinhaProd() {
		return this.linhaProd;
	}
	
	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}
	
	public int getIdSistema() {
		return this.idSistema;
	}
}
