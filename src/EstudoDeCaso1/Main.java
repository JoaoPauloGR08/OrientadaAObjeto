package EstudoDeCaso1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static ArrayList<String> carNom = new ArrayList<>();
	static ArrayList<Float> carPrec = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static String login, senha, prodC;
	static float precC, valorTotal;
	static int categ = 5;
	static Random rand = new Random();

	public static void main(String[] args) {

		int ls = 0, auxls = 0;

		while (auxls == 0) {

			System.out.println("1   Sign in\n2   Sign up");
			ls = sc.nextInt();

			if (ls == 1) {
				signin();
				auxls = 1;
			} else if (ls == 2) {
				signup();
			} else {
				System.out.println("Código não cadastrado, tente novamente.");
			}

		}

		categorias();

	}

	public static void signin() {

		int aux = 0;
		boolean auxB = false;
		String login1 = "a", senha1 = "a";

		while (auxB == false) {

			if (aux != 0) {
				System.out.println("Usuário ou senha incorretos.");
			}

			System.out.print("Insira seu usuário: ");
			login1 = sc.next();

			System.out.print("Insira sua senha: ");
			senha1 = sc.next();

			if (login.equals(login1) && senha.equals(senha1)) {
				auxB = true;
			}

			aux++;

		}

	}

	@SuppressWarnings("unused")
	public static void signup() {

		int aux = 0;
		String senha = "b", senha1 = "a", nome = null, sobrenome = null, email = null;

		while (!senha.equals(senha1)) {

			if (aux != 0) {
				System.out.println("Senhas não coincidem.");
			}

			System.out.print("Insira seu nome: ");
			nome = sc.next();

			System.out.print("Insira seu sobrenome: ");
			sobrenome = sc.next();

			System.out.print("Insira seu e-mail: ");
			email = sc.next();

			System.out.print("Crie um usuário: ");
			login = sc.next();

			System.out.print("Crie uma senha: ");
			senha = sc.next();

			System.out.print("Insira sua senha novamente: ");
			senha1 = sc.next();

			aux++;

		}

	}

	public static void categorias() {

		while (categ != 0) {

			System.out.println("Insira a categoria que deseja acessar:" + "\n1   Doméstica" + "\n2   Eletrônica"
					+ "\n3   Vestuários" + "\n4   Finalizar Compra" + "\n0   Sair");
			categ = sc.nextInt();

			if (categ == 1) {
				domestica();
			} else if (categ == 2) {
				eletronica();
			} else if (categ == 3) {
				vestuario();
			} else if (categ == 4) {
				finalizarCompra();
			} else if (categ == 0) {
				System.out.println("Site fechado com sucesso!");
			}

		}

	}

	public static void domestica() {

		int estoqueA1 = rand.nextInt(20);
		int estoqueA2 = rand.nextInt(25);
		int estoqueA3 = rand.nextInt(7);

		int prod = 0, acao = 0;

		System.out.println("Insira o código do produto que deseja abrir mais informações:"
				+ "\n1   Cafeteira Elétrica Arno Perfectta CFPI Inox (R$ 159,00) | Estoque: " + (estoqueA1 + 1)
				+ "\n2   Caixa Térmica Mor (R$ 99,00) | Estoque: " + (estoqueA2 + 1)
				+ "\n3   Conjunto de Panelas Nigro Gourmet (R$ 899,99) | Estoque: " + (estoqueA3 + 1) + "\n4   Voltar");
		prod = sc.nextInt();

		if (prod == 1) {

			prodC = "Cafeteira Elétrica Arno Perfectta CFPI Inox Preta";
			precC = 159.0f;

			valorTotal += precC;

			System.out.println(
					"Nome: Cafeteira Elétrica Arno Perfectta CFPI\nCor: Preto\nTamanhos: 600ml\nMaterial: Inox\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA1--;
			} else if (acao == 2) {
				carrinho();
				estoqueA1--;
			}

		}

		if (prod == 2) {

			prodC = "Caixa Térmica Mor 25108161";
			precC = 99.0f;

			valorTotal += precC;

			System.out.println("Nome: Caixa Térmica Mor\nCor: Azul\nTamanhos: 34 Litros\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA2--;
			} else if (acao == 2) {
				carrinho();
				estoqueA2--;
			}

		}

		if (prod == 3) {

			prodC = "Conjunto de Panelas Nigro Gourmet";
			precC = 899.99f;

			valorTotal += precC;

			System.out.println(
					"Nome: Conjunto de Panelas Nigro Gourmet\nCor: Bege\nEspecificações: 7 peças de alumínio\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA3--;
			} else if (acao == 2) {
				carrinho();
				estoqueA3--;
			}

		}

		if (prod == 4) {

		}

	}

	public static void eletronica() {

		int estoqueA1 = rand.nextInt(15);
		int estoqueA2 = rand.nextInt(6);
		int estoqueA3 = rand.nextInt(10);

		int prod = 0, acao = 0;

		System.out.println("Insira o código do produto que deseja abrir mais informações:"
				+ "\n1   Iphone 15 (R$ 5.599,99) | Estoque: " + (estoqueA1 + 1)
				+ "\n2   Notebook Acer Nitro 5 (R$ 7.789,05) | Estoque: " + (estoqueA2 + 1)
				+ "\n3   Monitor Acer 23.8' (R$ 899,99) | Estoque: " + (estoqueA3 + 1) + "\n4   Voltar");
		prod = sc.nextInt();

		if (prod == 1) {

			prodC = "Iphone 15";
			precC = 5599.0f;

			valorTotal += precC;

			System.out.println(
					"Nome: Iphone 15\nCor: Preto\nTamanhos: 6.1'\nConfig: Camêra 48MP, Chipset A16 Bionic, rede 5G\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA1--;
			} else if (acao == 2) {
				carrinho();
				estoqueA1--;
			}

		}

		if (prod == 2) {

			prodC = "Notebook Acer Nitro 5";
			precC = 7789.05f;

			valorTotal += precC;

			System.out.println(
					"Nome: Notebook Acer Nitro 5\nCor: Preto\nTamanhos: 15.6'\nConfig: Ryzen 7, 16gb Ram, 144hz, Full HD, Nvidia 3070 Ti 8gb VRam\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA2--;
			} else if (acao == 2) {
				carrinho();
				estoqueA2--;
			}

		}

		if (prod == 3) {

			prodC = "Monitor Acer 23.8'";
			precC = 899.99f;

			valorTotal += precC;

			System.out.println(
					"Nome: Monitor Acer 23.8'\nCor: Preto\nTamanhos: 23.8'\nConfig: 23.8' (polegadas), 144hz, Full HD\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA3--;
			} else if (acao == 2) {
				carrinho();
				estoqueA3--;
			}

		}

		if (prod == 4) {

		}

	}

	public static void vestuario() {

		int estoqueA1 = rand.nextInt(4);
		int estoqueA2 = rand.nextInt(2);
		int estoqueA3 = rand.nextInt(10);

		int prod = 0, acao = 0;

		System.out.println("Insira o código do produto que deseja abrir mais informações:"
				+ "\n1   Corteiz Calça Cargo Guerillaz Preta (R$ 1.700,00) | Estoque: " + (estoqueA1 + 1)
				+ "\n2   Tênis LV Trainer (R$ 8.100,00) | Estoque: " + (estoqueA2 + 1)
				+ "\n3   SYNAWORLD ‘SYNA LOGO’ TRACKSUIT ($ 249,99 - R$ 741,67) | Estoque: " + (estoqueA3 + 1)
				+ "\n4   Voltar");
		prod = sc.nextInt();

		if (prod == 1) {

			prodC = "Corteiz Calça Cargo Guerillaz Preta";
			precC = 1700.0f;

			valorTotal += precC;

			System.out.println(
					"Nome: Corteiz Calça Cargo Guerillaz Preta\nCor: Preta\nTamanhos: G (L): cm x cm GG (XL): cm x cm \nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA1--;
			} else if (acao == 2) {
				carrinho();
				estoqueA1--;
			}

		}

		if (prod == 2) {

			prodC = "Tênis LV Trainer";
			precC = 8100.0f;

			valorTotal += precC;

			System.out.println("Nome: Tênis LV Trainer\nCor: Noir\nTamanhos: 2.0 - 14.0\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA2--;
			} else if (acao == 2) {
				carrinho();
				estoqueA2--;
			}

		}

		if (prod == 3) {

			prodC = "SYNAWORLD ‘SYNA LOGO’ TRACKSUIT – GREY/PINK";
			precC = 741.67f;

			valorTotal += precC;

			System.out.println(
					"Nome: SYNAWORLD ‘SYNA LOGO’ TRACKSUIT\nCor: Grey/Pink\nTamanhos: XS, S, M, L, XL, 2XL\nCondição: Novo.");
			System.out.println("Insira a ação que deseja realizar:" + "\n1   Comprar produto"
					+ "\n2   Adicionar ao carrinho" + "\n3   Voltar");
			acao = sc.nextInt();

			if (acao == 1) {
				finalizarCompra();
				estoqueA3--;
			} else if (acao == 2) {
				carrinho();
				estoqueA3--;
			}

		}

		if (prod == 4) {

		}

	}

	public static void carrinho() {

		carNom.add(prodC);
		carPrec.add(precC);

		System.out.println("Produto adicionado no carrinho com sucesso!");

	}

	@SuppressWarnings("unused")
	public static void finalizarCompra() {

		float preco = 0.0f;
		int formaPg = 0, aux = 0, tam = 0;
		String contNav = null, nome = null;

		tam = carNom.size();

		System.out.println("Produtos: " + carNom);

		for (int i = 0; i < tam; i++) {

			nome = carNom.get(i);
			preco = carPrec.get(i);

			valorTotal += preco;

		}

		valorTotal /= 2;

		System.out.println("Valor total da compra: " + valorTotal);

		carNom.clear();
		carPrec.clear();

		while (aux == 0) {

			System.out.println("Insira o método de pagamento:" + "\n1   Crédito" + "\n2   Débito" + "\n3   Pix");
			formaPg = sc.nextInt();

			if (formaPg >= 1 && formaPg <= 3) {

				System.out.println("Pagamento realizado com sucesso!");

				System.out.println("Deseja continuar navegando na loja ? (sim/não)");
				contNav = sc.next();

				aux = 1;

			} else {

				System.out.println("Método de pagamento inválido inserido, tente novamente.");

			}

		}

		if (contNav.equals("sim") || contNav.equals("s")) {

			categorias();

		} else if (contNav.equals("não") || contNav.equals("nao") || contNav.equals("n")) {

			System.out.println("Muito obrigado pela sua confiança!");

		}

		categ = 0;

	}

}