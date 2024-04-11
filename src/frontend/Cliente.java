package frontend;

public class Cliente {

	private String nome;
	private String login="teste";
	private String senha="123";
	
	public boolean verificarLogin(String login, String senha) {
		if(login.equals(this.login) && senha.equals(this.senha)) {
			return true;
		}
		return false;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
