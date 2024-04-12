package EstudoDeCaso3;

public class Cliente {

    private String idCliente;
    private String telefone;
    private Endereco endereco;
    private String nome;
    private String login="teste";
    private String senha="123";
    
    
    public Cliente() {
    	
    }
    
    public boolean testeLogin(String login, String senha) {
    	if(login.equals(this.login) && senha.equals(this.senha))
    		return true;
    	return false;
    }

    public void setId (String id) {
        this.idCliente = id;
    }

    public String getId () {
        return this.idCliente;
    }

    public boolean setTelefone (String telefone) {
        if(telefone.length() == 11 && telefone.matches(".*[0-9].*")){
            this.telefone = telefone;
            return true;
        }
        return false;
    }

    public String getTelefone (){
        return this.telefone;
    }
    
    public void setEndereco(Endereco endereco) {
    	this.endereco = endereco;
    }
    
    public Endereco getEndereco() {
    	return this.endereco;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
    
}
