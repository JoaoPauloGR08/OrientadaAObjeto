package Atividade5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProdutoWeg prod1 = new MotorEletrico();
		Weg w = new Weg();

		for (int i = 0; i < 3; i++) {
			System.out.print("Insira o tipo do motor: ");
			prod1.setTipo(sc.next());

			w.addProduto(prod1);

			prod1 = new MotorEletrico();
		}

		w.listaProdutos();

		sc.close();

	}

}
