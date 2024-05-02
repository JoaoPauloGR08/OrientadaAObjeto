/**
 * Esta classe contém o método principal (main) que representa a execução do programa de gerenciamento da empresa WEG.
 * 
 * Permite adicionar, remover e exibir manutenções e produtos, tais como geradores, inversores de frequência e motores elétricos.
 * 
 * @author João Paulo
 * @version 1.0
 * 
 */

package Atividade5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instanciando objetos e atributos
        Scanner sc = new Scanner(System.in);
        MotorEletrico me = new MotorEletrico();
        InversorFrequencia iv = new InversorFrequencia();
        Gerador ge = new Gerador();
        Weg w = new Weg();
        ServicoManutencao sm = new ServicoManutencao();
        int op = 10;
        int opA = 10, opA2 = 10;

        // Loop principal do menu
        do {

            System.out.println("-========== MENU ==========-");
            System.out.println(" 1 - Adicionar");
            System.out.println(" 2 - Remover");
            System.out.println(" 3 - Exibir");
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
                    System.out.println(" 2 - Inversor de Frequência");
                    System.out.println(" 3 - Motor Elétrico");
                    System.out.println(" 0 - Sair");
                    System.out.print(" Insira a opção: ");
                    opA2 = sc.nextInt();
                    System.out.println();

                    if (opA2 == 1) {
                        // Adicionar gerador
                    	ge = new Gerador(333, "Elétrico", 10000, 220, 20000, 15000, "Energia", 50);
                        w.addGe(ge);
                    } else if (opA2 == 2) {
                        // Adicionar inversor de frequência
                    	iv = new InversorFrequencia(3902, "Inversor de Frequência Industrial", 5500, 380, 100, 12000, 500, 3);
                        w.addIv(iv);
                    } else if (opA2 == 3) {
                        // Adicionar motor elétrico
                    	me = new MotorEletrico(9324, "Motor Elétrico de Indução Trifásico", 7500, 440, 15, 10000, "Rolamento de Esferas", 92);
                        w.addMe(me);
                    }

                } else if (opA == 2) {

                    System.out.println("-=== ADICIONAR SERVIÇO ===-");
                    System.out.println(" 1 - Manutenção");
                    System.out.println(" 0 - Sair");
                    System.out.print(" Insira a opção: ");
                    opA2 = sc.nextInt();
                    System.out.println();

                    if (opA2 == 1) {
                        // Adicionar serviço de manutenção
                        ProdutoWeg ge2 = new Gerador(333, "Elétrico", 10000, 220, 20000, 15000, "Energia", 50);
                        sm = new ServicoManutencao(222, "Limpeza leve", 250, ge2);
                        w.addServico(sm);
                    }
                }

            } else if (op == 3) {
                System.out.println("-===== EXIBIR LISTAS =====-");
                System.out.println(" 1 - Lista de Produtos");
                System.out.println(" 2 - Lista de Manutenção");
                System.out.println(" 0 - Sair");
                System.out.print(" Insira a opção: ");
                opA = sc.nextInt();
                System.out.println();

                if (opA == 1) {
                    // Exibir lista de produtos
                    System.out.println("=== Lista de Produtos ===");
                    w.listaProdutos();
                } else if (opA == 2) {
                    // Exibir lista de manutenção
                    System.out.println("=== Lista de Manutenção ===");
                    w.listaManutencao();
                }

            } else if (op == 2) {

                System.out.println("-===== MENU REMOVER =====-");
                System.out.println(" 1 - Produtos");
                System.out.println(" 2 - Serviços");
                System.out.println(" 0 - Sair");
                System.out.print(" Insira a opção: ");
                opA = sc.nextInt();
                System.out.println();

                if (opA == 1) {

                    System.out.println("-=== REMOVER PRODUTO ===-");
                    System.out.println(" 1 - Gerador");
                    System.out.println(" 2 - Inversor de Frequência");
                    System.out.println(" 3 - Motor Elétrico");
                    System.out.println(" 0 - Sair");
                    System.out.print(" Insira a opção: ");
                    opA2 = sc.nextInt();
                    System.out.println();

                    if (opA2 == 1) {
                        // Remover gerador
                        w.remGe(333);
                    } else if (opA2 == 2) {
                        // Remover inversor de frequência
                        w.remIv(3902);
                    } else if (opA2 == 3) {
                        // Remover motor elétrico
                        w.remMe(9324);
                    }

                } else if (opA == 2) {

                    System.out.println("-=== REMOVER SERVIÇO ===-");
                    System.out.println(" 1 - Manutenção");
                    System.out.println(" 0 - Sair");
                    System.out.print(" Insira a opção: ");
                    opA2 = sc.nextInt();
                    System.out.println();

                    if (opA2 == 1) {
                        // Realizar manutenção
                        w.realizarManutencao(222);
                    }

                }
            }

        } while (op != 0);

        sc.close();

    }

}
