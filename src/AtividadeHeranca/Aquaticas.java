package AtividadeHeranca;

public class Aquaticas extends Ave {

}

class Pato extends Aquaticas {
	
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

class Ganso extends Aquaticas {
	
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

class Garca extends Aquaticas {
	
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
