package SistemaVendas;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Endereco end1 = new Endereco();
	static Pessoa per1 = new Pessoa();

	public static void main(String[] args) {

		System.out.print("Insira seu nome: ");
		per1.setNome(sc.nextLine());

		System.out.print("Insira seu CPF: ");
		per1.setCpf(sc.nextLine());

		System.out.print("Insira seu RG: ");
		per1.setRg(sc.nextLine());

		System.out.print("Insira a rua de sua residência: ");
		end1.setRua(sc.nextLine());

		System.out.print("Insira o número de sua residência: ");
		while (!end1.setNumero(sc.nextInt())) {
			System.out.print("Insira novamente o número de sua residência: ");
		}

		System.out.print("Insira seu CEP: ");
		end1.setCEP(sc.next());
		
		Pessoa joao = new Pessoa(); // associa uma pessoa com um endereço
		joao.setEndereco(end1);
		
		System.out.println(joao.getEndereco().getRua());

		System.out.println(per1.getNome() + " dono do cpf: " + per1.getCpf() + " e do rg: " + per1.getRg());
		System.out
				.println("Você mora na rua " + end1.getRua() + " número " + end1.getNumero() + " CEP " + end1.getCEP());
		
	}

}
