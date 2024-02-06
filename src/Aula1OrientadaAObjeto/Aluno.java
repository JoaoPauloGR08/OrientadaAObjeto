package Aula1OrientadaAObjeto;

public class Aluno {

	//Atributos:
	String nome;
	String senha;
	String email;
	String serie;
	
	//Métodos(funções):
	
	public boolean verificaEmail(String email) {
		
		if(email.contains("@"))
			this.email = email;
		
		else
			return false;
		
		return true;
	}
	
	public boolean verificaSenha(String senha) {
		
		if(senha.length()>=6)
			if(senha.matches("[a-zA-Z0-9]*"))
				return true;
		return false;
				
		
	}
	
	public String mostrarDados() {
		
		String dados = "Nome: " + nome + "\nE-mail: " + email;
		
		return dados;
		
	}
	
}
