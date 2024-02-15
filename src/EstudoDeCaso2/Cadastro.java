package EstudoDeCaso2;

import java.util.ArrayList;

public class Cadastro {

	ArrayList<String> nome = new ArrayList<String>();
	ArrayList<String> login = new ArrayList<String>();
	ArrayList<String> senha = new ArrayList<String>();
	ArrayList<String> email = new ArrayList<String>();
	ArrayList<Integer> idCad = new ArrayList<Integer>();
	ArrayList<String> telefone = new ArrayList<String>();
	
	public boolean verificaID(int idCad) {
		
		if(idCad >= 500) {
			System.out.println("Seja bem-vindo(a) aluno(a): " + nome);
			this.idCad.add(idCad);
			return true;
		}
		else if(idCad <= 100) {
			System.out.println("Seja bem-vindo(a) professor(a): " + nome);
			return true;
		}
		return false;
	}
	
	public boolean verificaEmail(String email) {
		
		if(email.contains("@"))
			this.email.add(email);
		
		else
			return false;
		
		return true;
	}
	
	public boolean verificaSenha(String senha) {
		
		if(senha.length()>=6)
			if(senha.matches("(?=.*[a-zA-Z])(?=.*[0-9]).{8,}")) // + faz ser OBRIGATÓRIO o uso de pelo menos um dos caracteres descritos
				return true;
				this.senha.add(senha);
		return false;
				
		
	}
	
	public boolean verificaTelefone(String telefone) {
		
		if(telefone.length()==11 && telefone.matches(".*[0-9].*"))
			return true;
			this.telefone.add(telefone);
		return false;
		
	}
	
}
