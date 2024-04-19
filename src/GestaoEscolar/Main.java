package GestaoEscolar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Professor professor1 = new Professor("Eduardo", 40, "Programação Orientada a Objeto");
        
        Aluno aluno1 = new Aluno("João", 20, 1234);
        Aluno aluno2 = new Aluno("Caio", 19, 5678);
        
        Disciplina disciplina1 = new Disciplina("Programação Orientada a Objeto", professor1);
        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
       
        professor1.apresentar();
        System.out.println();
        aluno1.apresentar();
        aluno2.apresentar();
        System.out.println();
        disciplina1.listarAlunos();
    }
}

class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

class Professor extends Pessoa {
   
    private String especialidade;
    
    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
    
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou professor na área de " + especialidade + ".");
    }
}

class Aluno extends Pessoa {
    
    private int matricula;
    
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Meu número de matrícula é " + matricula + ".");
    }
}

class Disciplina {

    private String nome;
	@SuppressWarnings("unused")
	private Professor professor;
    private List<Aluno> alunos;
    
    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void listarAlunos() {
        System.out.println("Alunos matriculados na disciplina de " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
}
