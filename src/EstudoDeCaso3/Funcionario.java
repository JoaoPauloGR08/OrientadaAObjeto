package EstudoDeCaso3;

public class Funcionario () {
    
    private String idFuncionario;
    private String nome;
    private String cargo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Date dataAdmisao;
    private float cargaHoraria;
    private float salario;

    public boolean setId(String idFuncionario){
        this.idFuncionario = idFuncionario;
    }

    public String getId(){
        return this.idFuncionario;
    }

    public boolean setNome(String nome){
        if(nome.matches(".*[a-zA-Z].*")){
            this.nome = nome;
            return True;
        }
        return False;
    }

    public String getNome(){
        return this.nome;
    }

}
