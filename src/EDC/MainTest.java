package EDC;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	
	static ArrayList<String> carrinho = new ArrayList<>();
	
     @SuppressWarnings("unused")
	public static void main(String[] args) {
    	 
            Scanner sc = new Scanner(System.in);

            float valorTotal = 0.0f;
            int aux = 0;
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

                while(aux == 0) {
                
	                System.out.println("Você deseja analisar qual produto?:" + "\nProduto 1" + "\nProduto 2" + "\nProduto 3" + "\nProduto 4");
	                int produto = sc.nextInt();
	
	                if (produto >= 1 && produto <= 4) {
	                	
	                    System.out.println(usuario + ", você deseja:" + "\n1-Comprar o produto"
	                            + "\n2-Adicionar o produto no carrinho" + "\n3-Voltar para o menu de interação");
	                    int escolha = sc.nextInt();
	
	                    if (escolha == 1) {
	                    	
	                    	if(produto == 1) {
	 	                        
	                    		carrinho.add("Produto 1");
	                    		valorTotal += 100;
		                        	
	                    	} else if(produto == 2) {
		                        	
	                    		carrinho.add("Produto 2");
	                    		valorTotal += 200;
		                        	
	                    	} else if(produto == 3) {
		                        	
	                    		carrinho.add("Produto 3");
	                    		valorTotal += 300;
		                        	
	                    	} else if(produto == 4) {
		                        	
	                    		carrinho.add("Produto 4");
	                    		valorTotal += 400;
		                        	
	                    	}
	                    	
	                    	System.out.println(carrinho + " : valor total de R$ " + valorTotal);
	                    	
	                        System.out.println("Adicione a forma de pagamento:" + "\n1-Cartão" + "\n2-Boleto" + "\n3-Pix");
	                        int pagamento = sc.nextInt();
	
	                        aux = 1;
	                        
	                        while(aux == 1) {
	                        
	                        	aux = 1;
	                        	
		                        if (pagamento >= 1 && pagamento <= 3) {
		                        	
		                        	aux = 2;
		                        	
		                            System.out.println("Pagamento aprovado.");
		                            
		                            System.out.println("Deseja voltar à página inicial?");
		                            String resposta2 = sc.next().toLowerCase();
		
		                            if (resposta2.equals("sim") || resposta2.equals("s")) {
		                            	
		                                System.out.println("Ótimo! Sinta-se à vontade para comprar novamente.");
		                                
		                                aux = 0;
		                                
		                            } else if (resposta2.equals("nao") || resposta2.equals("n")) {
		                            	
		                            	aux = 2;
		                            	
		                                System.out.println("Ok, talvez na próxima vez.");
		                                
		                            } else {
		                            	
		                                System.out.println("Resposta inválida.");
		                                
		                            }
		                            
		                        } else {
		                        	
		                            System.out.println("Opção de pagamento inválida.");
		                            
		                        }
		                        
	                        }
	                        
	                    } else if (escolha == 2) {
	                    	
	                        System.out.println("Produto adicionado ao carrinho.");
	                        
	                        if(produto == 1) {
	 	                        
	                        	carrinho.add("Produto 1");
	                        	valorTotal += 100;
	                        	
	                        } else if(produto == 2) {
	                        	
	                        	carrinho.add("Produto 2");
	                        	valorTotal += 200;
	                        	
	                        } else if(produto == 3) {
	                        	
	                        	carrinho.add("Produto 3");
	                        	valorTotal += 300;
	                        	
	                        } else if(produto == 4) {
	                        	
	                        	carrinho.add("Produto 4");
	                        	valorTotal += 400;
	                        	
	                        }
	                        
	                    } else if (escolha == 3) {
	                        
	                    } else {
	                    	
	                        System.out.println("Opção inválida.");
	                        
	                    }
	                    
	                } else {
	                	
	                    System.out.println("Opção de produto inválida.");
	                    
	                }
                
                }
                
            } else if (resposta.equals("nao") || resposta.equals("n")) {
            	
                System.out.println("Ok, talvez na próxima vez.");
                
            } else {
            	
                System.out.println("Resposta inválida.");
                
            }
            
            sc.close();
            
        }
    }