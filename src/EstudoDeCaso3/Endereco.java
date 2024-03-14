package EstudoDeCaso3;

public class Endereco {

    private String rua;
    private String complemento;
    private String Bairro;
    private int numero;
    private String cep;

    public boolean setRua (String rua){}{
        if(rua.length() > 5){
            return True;
            this.rua = rua;
        }
        return False;
    }

    public String getRua(){
        return this.rua;
    }

    public boolean setComplemento (String complemento){

        this.complemento = complemento;
    }

    public void setComplemento(String complemento) {

        return this.complemento;   
    }
    
    public String getComplemento() {

        return this.complemento;
    }
}