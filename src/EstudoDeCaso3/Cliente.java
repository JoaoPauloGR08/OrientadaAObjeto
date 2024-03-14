package EstudoDeCaso3;

public class Cliente {

    private ArrayList <Integer> idCliente = new ArrayList<>();
    private String telefone;
    private String endereco;
    

    public void setId (int idCliente) {

        this.idCliente = idCliente;
    }

    public int getId () {

        return this.idCliente;
    }

    public boolean setTelefone (String telefone) {

        if(telefone.length() == 11 && telefone.matches(".*[0-9].*")){
            this.telefone = telefone;
            return True;
        }
        return False;
    }

    public String getTelefone (){

        return this.telefone;
    }
}
