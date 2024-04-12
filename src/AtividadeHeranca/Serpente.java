package AtividadeHeranca;

public class Serpente extends Reptil {

}

class Cobra extends Serpente {
	
	private String habitat;
	private int expectativaDeVida;
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Habitat: " + habitat);
		System.out.println("Expectativa de vida: " + expectativaDeVida);
	}
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getExpectativaDeVida() {
		return expectativaDeVida;
	}
	public void setExpectativaDeVida(int expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}
	
}

class Anaconda extends Serpente {
	
	private String habitat;
	private int expectativaDeVida;
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Habitat: " + habitat);
		System.out.println("Expectativa de vida: " + expectativaDeVida);
	}
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getExpectativaDeVida() {
		return expectativaDeVida;
	}
	public void setExpectativaDeVida(int expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}
	
}

class Piton extends Serpente {
	
	private String habitat;
	private int expectativaDeVida;
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Habitat: " + habitat);
		System.out.println("Expectativa de vida: " + expectativaDeVida);
	}
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getExpectativaDeVida() {
		return expectativaDeVida;
	}
	public void setExpectativaDeVida(int expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}
	
}
