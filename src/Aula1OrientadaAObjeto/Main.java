package Aula1OrientadaAObjeto;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	// Criando o aluno objeto.
	static Aluno aluno1 = new Aluno();
	static Curso alunoC1 = new Curso();
	
	public static void main(String[] args) {
		
		System.out.print("Insira o tipo de ensino que o aluno participa(médio ou fundamental): ");
		alunoC1.tipo = sc.nextLine();
		
		System.out.print("Insira a modalidade do ensino que o aluno participa: ");
		alunoC1.modalidade = sc.nextLine();
		
		System.out.print("Insira o horário que o aluno frequenta(matutino ou noturno): ");
		alunoC1.horario = sc.nextLine();
		
		System.out.print("Insira o nome do aluno: ");
		aluno1.nome = sc.nextLine();
		
		System.out.print("Insira sua senha: ");
		//Mais de 6 caracs, números, maíuscula, minúscula
		aluno1.senha = sc.nextLine();
		
		System.out.print("Insira seu email: ");
		while(!aluno1.verificaEmail(sc.nextLine())) {
			System.out.print("Informe o email novamente:");
		}
		
		System.out.println(aluno1.mostrarDados());
		System.out.println(alunoC1.mostrarDados());
		
	}
	
}
