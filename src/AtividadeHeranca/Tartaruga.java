package AtividadeHeranca;

public class Tartaruga extends Reptil {

}

class Marinha extends Tartaruga {
	
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

class Terrestre extends Tartaruga {
	
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

class AguaDoce extends Tartaruga {
	
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
