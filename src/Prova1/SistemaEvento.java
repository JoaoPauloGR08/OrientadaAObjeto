package Prova1;

import java.util.ArrayList;

public class SistemaEvento {

	private Usuario usuarioB = new Usuario();
	private ArrayList<Usuario> usuario = new ArrayList<Usuario>();
	private Evento evento = new Evento();
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
	
	public Usuario replaceEventos(Usuario usuario) {
		if (this.usuario.size() > 0) {
            boolean productFound = false;
            for (int i = 0; i < this.usuario.size(); i++) {
                if (this.usuario.get(i).getNome() == usuario.getNome()) {
                	for(int i2 = 0; i2 < this.usuario.get(i).getEventosSize(); i2++) {
	                    evento.setTitulo(this.usuario.get(i).getTitulo());
	                    evento.setData(this.usuario.get(i).getData());
	                    evento.setLocalizacao(this.usuario.get(i).getLocalizacao());
	                    evento.setDescricao(this.usuario.get(i).getDescricao());
	                    
	
	            		usuario.addEventosRegistrados(evento);
                	}
                }
            }
            if (!productFound) {
            	this.usuario.add(usuario);
            }
        } else {
        	this.usuario.add(usuario);
        }
		return usuarioB;
	}
	
	public void setUsuarioExists(int i, Usuario usuario) {
		this.usuario.set(i, usuario);
	}
	
	public void addEventoGeral(Evento evento) {
		eventoA.add(evento);
	}
	
	public void exibirInformacoesGerais() {
		for (int i = 0; i < eventoA.size(); i++) {
            System.out.println("Título: " + eventoA.get(i).getTitulo());
            System.out.println("Data: " + eventoA.get(i).getData());
            System.out.println("Localização: " + eventoA.get(i).getLocalizacao());
            System.out.println("Descrição: " + eventoA.get(i).getDescricao());
        }
	}
	
}
