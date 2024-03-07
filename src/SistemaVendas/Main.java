package SistemaVendas;

import java.util.Date;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Endereco end1 = new Endereco();
	static Pessoa per1 = new Pessoa();
	static Produto prod1 = new Produto();
	static Pedido ped1 = new Pedido();

	public static void main(String[] args) {

		/*System.out.print("Insira seu nome: ");
		per1.setNome(sc.nextLine());
		
		System.out.print("Insira sua data de nascimento: ");
		String dataStr = sc.nextLine();
		int dia = Integer.parseInt(dataStr.substring(0,2));
		int mes = Integer.parseInt(dataStr.substring(3,5))-1;
		int ano = Integer.parseInt(dataStr.substring(6,10));
		@SuppressWarnings("deprecation")
		Date data = new Date(ano,mes,dia);
		
		ped1.setDate(data);

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
		end1.setCEP(sc.next());*/
		
		System.out.print("Insira quantos produtos deseja adicionar na loja: ");
		int i = sc.nextInt();
		
		for(int i2 = 0; i2 < i; i2++) {
			System.out.print("Insira o nome do produto: ");
			prod1.setNome(sc.next());
			System.out.print("Insira o valor do produto: ");
			prod1.setPreco(sc.nextFloat());
			System.out.print("Insira a descrição do produto: ");
			prod1.setNome(sc.next());
				
			ped1.addProduto(prod1);
		}
		
		/*Pessoa joao = new Pessoa(); // associa uma pessoa com um endereço
		joao.setEndereco(end1);
		
		System.out.println(joao.getEndereco().getRua());

		System.out.println(per1.getNome() + " dono do cpf: " + per1.getCpf() + " e do rg: " + per1.getRg());
		System.out
				.println("Você mora na rua " + end1.getRua() + " número " + end1.getNumero() + " CEP " + end1.getCEP());*/
		
		System.out.println("Carrinho: ");
		for(int i3 = 0; i3 < i; i3++) {
			System.out.println(ped1.getProduto(i3).getNome());
		}
		
		System.out.println("O valor total da compra foi: R$" + ped1.getValorTotal());
		
	}

}
