package EstudoDeCaso3;

public class Endereco {

    private String rua;
    private String complemento;
    private String bairro;
    private int numero;
    private String cep;

    public boolean setRua (String rua){
        if(rua.length() > 5){
            this.rua = rua;
            return true;
        }
        return false;
    }

    public String getRua(){
        return this.rua;
    }

    public void setComplemento (String complemento){
        this.complemento = complemento;
    }

    public String getComplemento() {
        return this.complemento;
    }
    
    public boolean setBairro(String bairro) {
    	if(bairro.matches(".*[a-zA-Z].*")) {
    		this.bairro = bairro;
    		return true;
    	}
    	return false;
    }
    
    public String getBairro() {
    	return this.bairro;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setCep(String cep) {
    	this.cep = cep;
    }
    
    public String getCep() {
    	return this.cep;
    }
    
}