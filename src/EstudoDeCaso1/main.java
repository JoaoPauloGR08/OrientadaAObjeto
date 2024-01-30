package EstudoDeCaso1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<String> carrinhoNome = new ArrayList<>();
	static String login;
	static String senha;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean LCb = false;
		
		System.out.println("1  Sign In\n2  Sign Up");
		int LC = sc.nextInt();
		
		if(LC == 1) {
			
			while(LCb == false) {
				
				LCb = signin();
				
				if(LCb = false) {
					
					System.out.println("Usuário ou senha inválidos.");
					
				} else if(LCb = true) {
					
				}
				
			}
			
		} else if (LC == 2) {
			
			while(LCb == false) {
				
				LCb = signup();
				
				if(LCb = false) {
					
					System.out.println("Senhas não estão iguais.");
					
				} else if(LCb = true) {
					
				}
				
			}
			
		}
		
	}
	
	public static boolean signin() {
		
		String login1 = null, senha1 = null;
		
		System.out.print("Insira seu login: ");
		login1 = sc.next();
		
		System.out.print("Insira sua senha: ");
		senha1 = sc.next();
		
		if(login1.equals(login) || senha1.equals(senha)) {
			
			return(true);
			
		}
		
		return(false);
		
	}
	
	public static boolean signup() {
		
		String senha1 = null;
		
		System.out.print("Insira seu login: ");
		login = sc.next();
		
		System.out.print("Insira sua senha: ");
		senha = sc.next();
		
		System.out.print("Insira novamente sua senha: ");
		senha1 = sc.next();
		
		if(senha.equals(senha1)) {
			
			return(true);
			
		}
		
		return(false);
		
	}

}
