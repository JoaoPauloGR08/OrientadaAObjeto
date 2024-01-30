package EDC;

import java.util.Scanner;

public class Main {
	
     @SuppressWarnings("unused")
	public static void main(String[] args) {
    	 
            Scanner sc = new Scanner(System.in);

            String usuario = null;

            System.out.println("1 Sign in" + "\n2 Sign Up");
            int conta = sc.nextInt();

            if (conta == 1) {
            	
                System.out.print("Digite o seu nome de usuário: ");
                usuario = sc.next();
                
                System.out.print("Digite sua senha: ");
                String senhaLogin = sc.next();
                
                System.out.println("Bem-vindo(a) " + usuario);

            } else if (conta == 2) {
            	
                System.out.print("Crie um nome de usuário: ");
                usuario = sc.next();
                
                System.out.print("Crie uma senha: ");
                String senhaCadastro1 = sc.next();
                
                System.out.print("Repita a senha: ");
                String senhaCadastro2 = sc.next();

                if (!senhaCadastro1.equals(senhaCadastro2)) {
                	
                    System.out.println("As senhas não se coincidem, tente novamente.");
                    
                }
                
                System.out.println("Bem-vindo(a) " + usuario);
                
            }

            System.out.print("Você deseja vasculhar produtos? (sim/nao): ");
            String resposta = sc.next().toLowerCase();

            if (resposta.equals("sim") || resposta.equals("s")) {
            	
                System.out.println("Ótimo! Você está pronto para explorar os produtos.");

                System.out.println("Você deseja analisar qual produto?:" + "\nProduto 1" + "\nProduto 2" + "\nProduto 3" + "\nProduto 4");
                int produto = sc.nextInt();

                if (produto >= 1 && produto <= 4) {
                	
                    System.out.println(usuario + ", você deseja:" + "\n1-Comprar o produto"
                            + "\n2-Adicionar o produto no carrinho" + "\n3-Voltar para o menu de interação");
                    int escolha = sc.nextInt();

                    if (escolha == 1) {
                    	
                        System.out.println("Adicione a forma de pagamento:" + "\n1-Cartão" + "\n2-Boleto" + "\n3-Pix");
                        int pagamento = sc.nextInt();

                        if (pagamento >= 1 && pagamento <= 3) {
                        	
                            System.out.println("Pagamento aprovado.");
                            
                            System.out.println("Deseja voltar à página inicial?");
                            String resposta2 = sc.next().toLowerCase();

                            if (resposta2.equals("sim") || resposta2.equals("s")) {
                            	
                                System.out.println("Ótimo! Sinta-se à vontade para comprar novamente.");
                                
                            } else if (resposta2.equals("nao") || resposta2.equals("n")) {
                            	
                                System.out.println("Ok, talvez na próxima vez.");
                                
                            } else {
                            	
                                System.out.println("Resposta inválida.");
                                
                            }
                            
                        } else {
                        	
                            System.out.println("Opção de pagamento inválida.");
                            
                        }
                        
                    } else if (escolha == 2) {
                    	
                        System.out.println("Produto adicionado ao carrinho.");
                        
                    } else if (escolha == 3) {
                        
                    } else {
                    	
                        System.out.println("Opção inválida.");
                        
                    }
                    
                } else {
                	
                    System.out.println("Opção de produto inválida.");
                    
                }
                
            } else if (resposta.equals("nao") || resposta.equals("n")) {
            	
                System.out.println("Ok, talvez na próxima vez.");
                
            } else {
            	
                System.out.println("Resposta inválida.");
                
            }
            
            sc.close();
            
        }
    }