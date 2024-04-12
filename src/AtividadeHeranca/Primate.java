package AtividadeHeranca;

public class Primate extends Mamifero {

}

class Macaco extends Primate {
	
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

class Chimpanze extends Primate {
	
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

class Gorila extends Primate {
	
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
