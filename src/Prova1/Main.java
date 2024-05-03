package Prova1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Usuario usuario = new Usuario();
		Evento evento = new Evento();
		SistemaEvento sistema = new SistemaEvento();
		int op;
		
		do {
			
			System.out.println("-========== MENU ==========-");
	        System.out.println(" 1 - Adicionar");
	        System.out.println(" 2 - Remover");
	        System.out.println(" 3 - Exibir");
	        System.out.println(" 0 - Sair");
	        System.out.print(" Insira a opção: ");
	        op = sc.nextInt();
	        System.out.println();
	        
	        if(op == 1) {
	        	
	        	 System.out.println("-===== MENU ADICIONAR =====-");
	             System.out.println(" 1 - Evento");
	             System.out.println(" 0 - Sair");
	             System.out.print(" Insira a opção: ");
	             op = sc.nextInt();
	             System.out.println();
	             
	             if(op == 1) {
	            	 
	            	 sc.nextLine();
	            	 System.out.print("Insira seu nome: ");
	            	 usuario.setNome(sc.nextLine());
	            	 
	            	 System.out.print("Insira o titulo do evento: ");
	            	 evento.setTitulo(sc.nextLine());
	           
	            	 System.out.print("Insira a data do evento: ");
	            	 evento.setData(sc.nextLine());
	            	 
	            	 System.out.print("Insira a localização do evento: ");
	            	 evento.setLocalizacao(sc.nextLine());
	            	 
	            	 System.out.print("Insira a descrição do evento: ");
	            	 evento.setDescricao(sc.nextLine());
	            	 
	            	 System.out.println();
	            	 
	            	 sistema.addEventoGeral(evento);
	            	 
	            	 if(sistema.usuarioExists(usuario) == true) {
	            		 usuario.addEventosRegistrados(evento);
	            		 sistema.replaceEventos(usuario);
	            		 sistema.setUsuarioExists(sistema.usuarioExistsInt(usuario), usuario);
	            	 } else {
	            		 usuario.addEventosRegistrados(evento);
	            		 sistema.addUsuario(usuario);
	            	 }
	            	 
	            	 
	             }
	        	
	        } else if(op == 2) {
	        	
	        	System.out.println("-===== MENU REMOVER =====-");
                System.out.println(" 1 - Evento");
                System.out.println(" 0 - Sair");
                System.out.print(" Insira a opção: ");
                op = sc.nextInt();
                System.out.println();
	        	
	        } else if(op == 3) {
	        	
	        	System.out.println("-===== EXIBIR LISTAS =====-");
                System.out.println(" 1 - Lista de Eventos Geral");
                System.out.println(" 2 - Lista de Eventos Privada");
                System.out.println(" 0 - Sair");
                System.out.print(" Insira a opção: ");
                op = sc.nextInt();
                System.out.println();
	        	
                if(op == 1) {
                	
                	sistema.exibirInformacoesGerais();
                	
                } else if(op == 2) {
                	
                	
                	
                }
                
	        }
        
		} while(op != 0);
		
		sc.close();
		
	}
	
}
