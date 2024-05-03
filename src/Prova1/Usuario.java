package Prova1;

import java.util.ArrayList;

public class Usuario extends Evento {

	private String nome;
	private ArrayList<Evento> eventosRegistrados = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEventosSize() {
		int aux = eventosRegistrados.size();
		return aux;
	}
	public ArrayList<Evento> getEventosRegistrados() {
		return eventosRegistrados;
	}
	public void addEventosRegistrados(Evento evento) {
		eventosRegistrados.add(evento);
	}
	
}
