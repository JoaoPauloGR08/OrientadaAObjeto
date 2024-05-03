package Prova1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		Evento evento = new Evento();
		SistemaEvento sistema = new SistemaEvento();
		int opMenuPrincipal, opSubMenu;

		do {

			System.out.println("-========== MENU ==========-");
			System.out.println(" 1 - Adicionar");
			System.out.println(" 2 - Remover");
			System.out.println(" 3 - Exibir");
			System.out.println(" 0 - Sair");
			System.out.print(" Insira a opção: ");
			opMenuPrincipal = sc.nextInt();
			System.out.println();

			if (opMenuPrincipal == 1) {
				System.out.println("-===== MENU ADICIONAR =====-");
				System.out.println(" 1 - Evento");
				System.out.println(" 0 - Sair");
				System.out.print(" Insira a opção: ");
				opSubMenu = sc.nextInt();
				System.out.println();

				if (opSubMenu == 1) {
					sc.nextLine();
					System.out.print(" Insira seu nome: ");
					evento.setNome(sc.nextLine());

					System.out.print(" Insira o título do evento: ");
					evento.setTitulo(sc.nextLine());

					System.out.print(" Insira a data do evento (modelo: XX XX XXXX): ");
					evento.setDia(sc.nextInt());
					evento.setMes(sc.nextInt());
					evento.setAno(sc.nextInt());
					evento.setData();

					sc.nextLine();
					System.out.print(" Insira a localização do evento: ");
					evento.setLocalizacao(sc.nextLine());

					do {
						System.out.print(" Insira a descrição do evento: ");
					} while (!evento.setDescricao(sc.nextLine()));

					System.out.println();

					sistema.addEventoGeral(evento);

					if (sistema.usuarioExists(evento)) {
						sistema.addEventoExists(evento.getNome(), evento);
					} else {
						usuario.addEventosRegistrados(evento);
						sistema.addUsuario(evento);
					}

					evento = new Evento();
				}

			} else if (opMenuPrincipal == 2) {

				System.out.println("-===== MENU REMOVER =====-");
				System.out.println(" 1 - Evento");
				System.out.println(" 0 - Sair");
				System.out.print(" Insira a opção: ");
				opSubMenu = sc.nextInt();
				sc.nextLine();
				System.out.println();

				if (opSubMenu == 1) {

					String titulo;

					System.out.print("Insira o titulo do evento que deseja remover: ");
					titulo = sc.nextLine();

					sistema.remEvento(titulo);

				}

			} else if (opMenuPrincipal == 3) {

				System.out.println("-===== EXIBIR LISTAS =====-");
				System.out.println(" 1 - Lista de Eventos Geral");
				System.out.println(" 2 - Lista de Eventos Privada");
				System.out.println(" 0 - Sair");
				System.out.print(" Insira a opção: ");
				opSubMenu = sc.nextInt();
				sc.nextLine();
				System.out.println();

				if (opSubMenu == 1) {

					System.out.println("-===== EVENTOS GERAIS =====-");
					System.out.println();
					sistema.exibirInformacoesGerais();

				} else if (opSubMenu == 2) {

					String nome;

					System.out.print(" Insira o nome que deseja ver as reservas: ");
					nome = sc.nextLine();
					System.out.println();

					sistema.exibirInformacoesPrivado(nome);

				}

			}

		} while (opMenuPrincipal != 0);

		sc.close();

	}

}
