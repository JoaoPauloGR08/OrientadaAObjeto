package Aula1OrientadaAObjeto;

public class Curso {

	String modalidade;
	String horario;
	String tipo;
	
	public String mostrarDados() {
		
		String dados = "Horário: " + horario + "\nModalidade: " + modalidade + "\nTipo de ensino: " + tipo;
		
		return dados;
		
	}
	
}
