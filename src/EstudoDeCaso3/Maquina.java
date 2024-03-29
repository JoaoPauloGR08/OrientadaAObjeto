package EstudoDeCaso3;

public class Maquina {

	private String modelo;
	private String fabricante;
	private int codigo;
	private String status;
	private String funcao;
	private ComponenteFabrica componenteFabrica;

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getFuncao() {
		return this.funcao;
	}
	
	public void setComponenteFabrica(ComponenteFabrica componenteFabrica) {
		this.componenteFabrica = componenteFabrica;
	}

	public ComponenteFabrica getComponenteFabrica() {
		return this.componenteFabrica;
	}

}