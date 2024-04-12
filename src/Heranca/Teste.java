package Heranca;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro caoInfernal = new Cachorro();
		Lobo fenrir = new Lobo();
		
		caoInfernal.setNome("Cão de 3 cabeças do inferno");
		caoInfernal.latir();
		
		fenrir.setNome("Fenrir");
		fenrir.uivo();
		
	}
	
}
