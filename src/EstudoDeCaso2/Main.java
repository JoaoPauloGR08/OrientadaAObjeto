package EstudoDeCaso2;

import java.util.Scanner;

public class Main {
	
	static Cadastro c = new Cadastro();
	static CadastroCM cCM = new CadastroCM();
	static Scanner sc = new Scanner(System.in);
	static int acao = 4;
	
	public static void main(String[] args) {
		
		while(acao != 3 && acao != 1 && acao != 2) {
			
			System.out.println("Insira a ação que deseja realizar: \n1   Cadastro de Aluno/Professor\n2   Cadastro de Curso/Matéria\n3   Sair");
			acao = sc.nextInt();
			
			if(acao == 1)
				cadastroAP();
			else if(acao == 2)
				cadastroCM();
			else if(acao == 3)
				System.out.println("Menu fechado com sucesso!");
			else
				System.out.println("Ação inválida detectada, tente novamente.");
			
		}
		
	}
	
	public static void cadastroAP() {
		
		System.out.print("Insira o primeiro nome: ");
		String nome = sc.next();
		c.nome.add(nome);
		
		System.out.print("\nCracha de Professor(a): < 100\nMatricula de Aluno: > 500\nInsira o número de cadastro: ");
		while(!c.verificaID(sc.nextInt())) {
			System.out.print("Insira novamente o número de cadastro: ");
		}
		
		System.out.print("Insira o email: ");
		while(!c.verificaEmail(sc.next())) {
			System.out.print("Insira novamente o email: ");
		}
		
		System.out.print("Insira a senha: ");
		while(!c.verificaSenha(sc.next())) {
			System.out.print("Insira novamente a senha: ");
		}
		
		System.out.print("Insira o número de telefone: ");
		while(!c.verificaTelefone(sc.next())) {
			System.out.print("Insira novamente o número de telefone: ");
		}
		
		
		
		acao = 4;
		
	}
	
	public static void cadastroCM() {
		
		System.out.print("Insira o nome do curso: ");
		cCM.nome.add(sc.next());
	
		acao = 4;
		
	}
	
}
