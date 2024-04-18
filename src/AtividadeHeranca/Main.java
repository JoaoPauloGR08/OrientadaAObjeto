package AtividadeHeranca;

public class Main {

	public static void main(String[] args) {
	
		// Leão
		Leao leao = new Leao();
		leao.setNome("Leão");
		leao.setIdade(12);
		leao.setPeso(78.5);
		leao.setMediaPorGeracao(3);
		leao.setHabitat("Savana");
		leao.setExpectativaDeVida(13);
		
		// Tigre
		Tigre tigre = new Tigre();
		tigre.setNome("Tigre");
		tigre.setIdade(10);
		tigre.setPeso(120.3);
		tigre.setMediaPorGeracao(2);
		tigre.setHabitat("Floresta");
		tigre.setExpectativaDeVida(15);

		// Leopardo
		Leopardo leo = new Leopardo();
		leo.setNome("Leopardo");
		leo.setIdade(8);
		leo.setPeso(60.7);
		leo.setMediaPorGeracao(2);
		leo.setHabitat("Selva");
		leo.setExpectativaDeVida(12);

		// Cachorro
		Cachorro dog = new Cachorro();
		dog.setNome("Cachorro");
		dog.setIdade(5);
		dog.setPeso(25.0);
		dog.setMediaPorGeracao(6);
		dog.setHabitat("Doméstico");
		dog.setExpectativaDeVida(15);

		// Lobo
		Lobo lobo = new Lobo();
		lobo.setNome("Lobo");
		lobo.setIdade(7);
		lobo.setPeso(35.0);
		lobo.setMediaPorGeracao(4);
		lobo.setHabitat("Floresta");
		lobo.setExpectativaDeVida(12);

		// Raposa
		Raposa rap = new Raposa();
		rap.setNome("Raposa");
		rap.setIdade(4);
		rap.setPeso(10.5);
		rap.setMediaPorGeracao(5);
		rap.setHabitat("Floresta");
		rap.setExpectativaDeVida(8);

		// Macaco
		Macaco mac = new Macaco();
		mac.setNome("Macaco");
		mac.setIdade(6);
		mac.setPeso(12.0);
		mac.setMediaPorGeracao(2);
		mac.setHabitat("Floresta");
		mac.setExpectativaDeVida(20);

		// Chimpanzé
		Chimpanze chimps = new Chimpanze();
		chimps.setNome("Chimpanzé");
		chimps.setIdade(10);
		chimps.setPeso(45.0);
		chimps.setMediaPorGeracao(1);
		chimps.setHabitat("Floresta");
		chimps.setExpectativaDeVida(40);

		// Gorila
		Gorila gor = new Gorila();
		gor.setNome("Gorila");
		gor.setIdade(15);
		gor.setPeso(200.0);
		gor.setMediaPorGeracao(1);
		gor.setHabitat("Floresta");
		gor.setExpectativaDeVida(35);

		// Aguia
		Aguia aguia = new Aguia();
		aguia.setNome("Águia");
		aguia.setIdade(8);
		aguia.setPeso(7.0);
		aguia.setMediaPorGeracao(2);
		aguia.setHabitat("Montanhas");
		aguia.setExpectativaDeVida(25);

		// Falcão
		Falcao falc = new Falcao();
		falc.setNome("Falcão");
		falc.setIdade(6);
		falc.setPeso(3.0);
		falc.setMediaPorGeracao(2);
		falc.setHabitat("Planícies");
		falc.setExpectativaDeVida(15);

		// Coruja
		Coruja coruja = new Coruja();
		coruja.setNome("Coruja");
		coruja.setIdade(4);
		coruja.setPeso(2.0);
		coruja.setMediaPorGeracao(3);
		coruja.setHabitat("Floresta");
		coruja.setExpectativaDeVida(10);

		// Pato
		Pato pato = new Pato();
		pato.setNome("Pato");
		pato.setIdade(3);
		pato.setPeso(4.5);
		pato.setMediaPorGeracao(6);
		pato.setHabitat("Lagos");
		pato.setExpectativaDeVida(12);

		// Ganso
		Ganso ganso = new Ganso();
		ganso.setNome("Ganso");
		ganso.setIdade(5);
		ganso.setPeso(5.0);
		ganso.setMediaPorGeracao(4);
		ganso.setHabitat("Campo");
		ganso.setExpectativaDeVida(15);

		// Garça
		Garca garca = new Garca();
		garca.setNome("Garça");
		garca.setIdade(6);
		garca.setPeso(3.5);
		garca.setMediaPorGeracao(2);
		garca.setHabitat("Pântanos");
		garca.setExpectativaDeVida(20);

		// Cobra
		Cobra cobra = new Cobra();
		cobra.setNome("Cobra");
		cobra.setIdade(8);
		cobra.setPeso(5.0);
		cobra.setMediaPorGeracao(10);
		cobra.setHabitat("Floresta");
		cobra.setExpectativaDeVida(20);

		// Anaconda
		Anaconda anac = new Anaconda();
		anac.setNome("Anaconda");
		anac.setIdade(12);
		anac.setPeso(150.0);
		anac.setMediaPorGeracao(20);
		anac.setHabitat("Pântanos");
		anac.setExpectativaDeVida(30);

		// Piton
		Piton python = new Piton();
		python.setNome("Piton");
		python.setIdade(10);
		python.setPeso(80.0);
		python.setMediaPorGeracao(15);
		python.setHabitat("Selva");
		python.setExpectativaDeVida(25);

		// Tartaruga Marinha
		Marinha mar = new Marinha();
		mar.setNome("Tartaruga Marinha");
		mar.setIdade(20);
		mar.setPeso(100.0);
		mar.setMediaPorGeracao(50);
		mar.setHabitat("Oceanos");
		mar.setExpectativaDeVida(80);

		// Tartaruga Terrestre
		Terrestre terra = new Terrestre();
		terra.setNome("Tartaruga Terrestre");
		terra.setIdade(30);
		terra.setPeso(20.0);
		terra.setMediaPorGeracao(10);
		terra.setHabitat("Deserto");
		terra.setExpectativaDeVida(50);

		// Tartaruga de Água Doce
		AguaDoce aguaD = new AguaDoce();
		aguaD.setNome("Tartaruga de Água Doce");
		aguaD.setIdade(25);
		aguaD.setPeso(15.0);
		aguaD.setMediaPorGeracao(20);
		aguaD.setHabitat("Rios");
		aguaD.setExpectativaDeVida(60);

		// Sapo Comum
		Comum com = new Comum();
		com.setNome("Sapo Comum");
		com.setIdade(2);
		com.setPeso(0.5);
		com.setMediaPorGeracao(100);
		com.setHabitat("Pântanos");
		com.setExpectativaDeVida(8);

		// Sapo Boi
		Boi boi = new Boi();
		boi.setNome("Sapo Boi");
		boi.setIdade(5);
		boi.setPeso(2.0);
		boi.setMediaPorGeracao(50);
		boi.setHabitat("Floresta");
		boi.setExpectativaDeVida(15);

		// Sapo Venenoso
		Venenoso ven = new Venenoso();
		ven.setNome("Sapo Venenoso");
		ven.setIdade(3);
		ven.setPeso(0.7);
		ven.setMediaPorGeracao(30);
		ven.setHabitat("Floresta");
		ven.setExpectativaDeVida(10);
		
		//Mostrar infos
		
		leao.mostrarInfo();
		tigre.mostrarInfo();
		leo.mostrarInfo();
		dog.mostrarInfo();
		lobo.mostrarInfo();
		rap.mostrarInfo();
		mac.mostrarInfo();
		chimps.mostrarInfo();
		gor.mostrarInfo();
		aguia.mostrarInfo();
		falc.mostrarInfo();
		coruja.mostrarInfo();
		pato.mostrarInfo();
		ganso.mostrarInfo();
		garca.mostrarInfo();
		cobra.mostrarInfo();
		anac.mostrarInfo();
		python.mostrarInfo();
		mar.mostrarInfo();
		terra.mostrarInfo();
		aguaD.mostrarInfo();
		com.mostrarInfo();
		boi.mostrarInfo();
		ven.mostrarInfo();
	
	}
	
}
