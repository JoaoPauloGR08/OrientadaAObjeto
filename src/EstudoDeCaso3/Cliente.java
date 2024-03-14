package EstudoDeCaso3;

public class Cliente {

    private int idCliente;
    private String telefone;
    private Endereco endereco;
    

    public void setId (int idCliente) {

        this.idCliente = idCliente;
    }

    public int getId () {

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
}
