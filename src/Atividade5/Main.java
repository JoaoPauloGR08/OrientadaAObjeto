package Atividade5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MotorEletrico me = new MotorEletrico();
		InversorFrequencia iv = new InversorFrequencia();
		Gerador ge = new Gerador();
		Weg w = new Weg();
		ServicoManutencao sm = new ServicoManutencao();
		int op = 10;
		int opA = 10, opA2 = 10;

		do {

			System.out.println("-========== MENU ==========-");
			System.out.println(" 1 - Adicionar");
			System.out.println(" 2 - Exibir");
			System.out.println(" 0 - Sair");
			System.out.print(" Insira a opção: ");
			op = sc.nextInt();
			System.out.println();

			if (op == 1) {

				System.out.println("-===== MENU ADICIONAR =====-");
				System.out.println(" 1 - Produtos");
				System.out.println(" 2 - Serviços");
				System.out.println(" 0 - Sair");
				System.out.print(" Insira a opção: ");
				opA = sc.nextInt();
				System.out.println();

				if (opA == 1) {

					System.out.println("-=== ADICIONAR PRODUTO ===-");
					System.out.println(" 1 - Gerador");
					System.out.println(" 2 - Inversor de Frequencia");
					System.out.println(" 3 - Motor Eletrico");
					System.out.println(" 0 - Sair");
					System.out.print(" Insira a opção: ");
					opA2 = sc.nextInt();
					System.out.println();

					if (opA2 == 1) {

						ge = new Gerador(353, "Elétrico", 10000, 220, 20000, 15000, "Energia", 50);
						w.addGe(ge);

					} else if (opA2 == 2) {

						iv = new InversorFrequencia(3902, "Inversor de Frequência Industrial", 5500, 380, 100, 12000,
								500, 3);
						w.addIv(iv);

					} else if (opA2 == 3) {

						me = new MotorEletrico(9324, "Motor Elétrico de Indução Trifásico", 7500, 440, 15, 10000,
								"Rolamento de Esferas", 92);
						w.addMe(me);

					} else {
					}

				} else if (opA == 2) {

					System.out.println("-=== ADICIONAR SERVIÇO ===-");
					System.out.println(" 1 - Manutenção");
					System.out.println(" 0 - Sair");
					System.out.print(" Insira a opção: ");
					opA2 = sc.nextInt();
					System.out.println();

					if (opA2 == 1) {

						sm = new ServicoManutencao("Limpeza leve", 250);
						w.addServico(sm);

					} else {
					}

				} else {
				}

			} else if (op == 2) {
				System.out.println("-===== EXIBIR LISTAS =====-");
				System.out.println(" 1 - Lista de Produtos");
				System.out.println(" 2 - Lista de Manutenção");
				System.out.println(" 0 - Sair");
				System.out.print(" Insira a opção: ");
				opA = sc.nextInt();
				System.out.println();

				if (opA == 1) {

					System.out.println("=== Lista de Produtos ===");
					w.listaProdutos();

				} else if (opA == 2) {

					System.out.println("=== Lista de Manutenção ===");
					w.listaManutencao();

				} else {
				}

			}

		} while (op != 0);

		sc.close();

	}

}
