package Prova1;

import java.util.ArrayList;

public class SistemaEvento {

	private ArrayList<Usuario> usuario = new ArrayList<Usuario>();
	private ArrayList<Evento> eventoA = new ArrayList<Evento>();

	public void addUsuario(Usuario usuarioT) {
		usuario.add(usuarioT);
	}

	public boolean usuarioExists(Usuario usuario) {
		if (this.usuario.size() > 0) {
			boolean productFound = false;
			for (int i = 0; i < this.usuario.size(); i++) {
				if (this.usuario.get(i).getNome() == usuario.getNome()) {
					return true;
				}
			}
			if (!productFound) {
				this.usuario.add(usuario);
			}
		} else {
			this.usuario.add(usuario);
		}
		return false;
	}

	public int usuarioExistsInt(Usuario usuario) {
		if (this.usuario.size() > 0) {
			boolean productFound = false;
			for (int i = 0; i < this.usuario.size(); i++) {
				if (this.usuario.get(i).getNome() == usuario.getNome()) {
					return i;
				}
			}
			if (!productFound) {
				this.usuario.add(usuario);
			}
		} else {
			this.usuario.add(usuario);
		}
		return -1;
	}

	public void addEventoExists(String nome, Evento evento) {
		for (int i = 0; i < this.usuario.size(); i++) {
			if (this.usuario.get(i).getNome() == nome) {
				this.usuario.get(i).addEventosRegistrados(evento);
			}
		}
	}

	public void addEventoGeral(Evento evento) {
		eventoA.add(evento);
	}

	public void exibirInformacoesGerais() {
		for (int i = 0; i < eventoA.size(); i++) {
			System.out.println(" Responsável: " + eventoA.get(i).getNome());
			System.out.println(" Título: " + eventoA.get(i).getTitulo());
			System.out.println(" Data: " + eventoA.get(i).getData());
			System.out.println(" Localização: " + eventoA.get(i).getLocalizacao());
			System.out.println(" Descrição: " + eventoA.get(i).getDescricao());
			System.out.println();
		}
	}

	public void exibirInformacoesPrivado(String nome) {
		System.out.println("Eventos pertencentes ao usuário: " + nome);
		System.out.println();
		for (int i = 0; i < eventoA.size(); i++) {
			if (eventoA.get(i).getNome().equals(nome)) {
				System.out.println(" Título: " + eventoA.get(i).getTitulo());
				System.out.println(" Data: " + eventoA.get(i).getData());
				System.out.println(" Localização: " + eventoA.get(i).getLocalizacao());
				System.out.println(" Descrição: " + eventoA.get(i).getDescricao());
				System.out.println();
			}
		}
	}

	public void remEvento(String titulo) {
		for (int i = 0; i < eventoA.size(); i++) {
			if (eventoA.get(i).getTitulo().equals(titulo)) {
				System.out.println(" Evento com titulo '" + titulo + "' removido com sucesso.");
				eventoA.remove(i);
			}
		}
	}

}
