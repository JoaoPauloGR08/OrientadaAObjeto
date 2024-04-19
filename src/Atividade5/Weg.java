package Atividade5;

import java.util.ArrayList;

public class Weg {

	private ArrayList<ProdutoWeg> listaProd = new ArrayList<ProdutoWeg>();
	private ArrayList<ServicoManutencao> listaManut = new ArrayList<ServicoManutencao>();
	
	public void addProduto(ProdutoWeg prod) {
		listaProd.add(prod);
	}
	
	public void addServico(ServicoManutencao servManut) {
		listaManut.add(servManut);
	}
	
	public void listaProdutos() {
		for (int i = 0; i < listaProd.size(); i++) {
            System.out.println(listaProd.get(i));
        }
	}
	
	public void listaManutencao() {
		for (int i = 0; i < listaManut.size(); i++) {
            System.out.println(listaManut.get(i));
        }
	}
	
}
