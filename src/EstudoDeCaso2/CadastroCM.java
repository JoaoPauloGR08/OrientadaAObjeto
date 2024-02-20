package EstudoDeCaso2;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCM {

	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<String> nomeC = new ArrayList<String>();
	static ArrayList<Integer> cargaHorariaC = new ArrayList<Integer>();
	static ArrayList<Float> valorC = new ArrayList<Float>();
	ArrayList<String> nomeM = new ArrayList<String>();
	static ArrayList<Integer> cargaHorariaM = new ArrayList<Integer>();
	static ArrayList<String> ligacao1 = new ArrayList<String>();
	static ArrayList<String> ligacao2 = new ArrayList<String>();
	
	
	public boolean CadastroCurso() {
		
		System.out.print("Insira o nome do curso: ");
		nomeC.add(sc.next());
		
		System.out.print("Insira a carga horária do curso (em horas): ");
		cargaHorariaC.add(sc.nextInt());
		
		System.out.print("Insira o valor do curso: ");
		valorC.add(sc.nextFloat());
		
		return true;
		
	}
	
	public boolean CadastroMateria() {
		
		String aux;
		String aux2;
		
		System.out.print("Insira o nome da matéria: ");
		aux2 = sc.next();
		nomeM.add(aux2);
		
		System.out.print("Insira a carga horária da matéria (em horas): ");
		cargaHorariaM.add(sc.nextInt());
		
		System.out.print("Insira o curso que a matéria faz parte: " + nomeC.toString() + ": ");
		aux = sc.next();
		
		ligacao1.add(aux);
		ligacao2.add(aux2);
		
		return true;
		
	}
	
	public void mostrarC() {
		
		System.out.println("Os cursos cadastrados são: " + nomeC.toString());
		
	}
	
}
