package EstudoDeCaso3;

import java.util.Date;

/*
 * CÓDIGO REALIZADO DURANTE AS AULAS DE PROGRAMAÇÃO ORIENTADA A OBJETO, SENAI+CENTROWEG
 * 08/03 - INICIO DA PROGRAMAÇÃO
 * 14/03 - CRIAÇÃO DOS METODOS E CLASSES
 * 15/03 - ARRUMANDO OS POSSÍVEIS ERROS PRESENTES NO CÓDIGO
 * 21/03 - CRIANDOS OUTRAS CLASSES E MÉTODOS NO CÓDIGO
 * 22/03 - REVISÃO DAS CLASSES E CORREÇÃO PARA ATENDER OS REQUISITOS SOLICITADOS
 */

public class Main {

	public static void main(String[] args) {

		ComponenteFabrica componente1 = new ComponenteFabrica();
		componente1.setId(1);
		componente1.setNome("Componente 1");

		ComponenteFabrica componente2 = new ComponenteFabrica();
		componente2.setId(2);
		componente2.setNome("Componente 2");

		Produto produto1 = new Produto();
		produto1.setIdProduto(1);
		produto1.setPreco(100);
		produto1.setTempoProducao(5);
		produto1.setProcessoFabricacao("Processo 1");

		produto1.adicionarComponente(componente1);
		produto1.adicionarComponente(componente2);

		System.out.println("ID do Produto: " + produto1.getIdProduto());
		System.out.println("Preço do Produto: " + produto1.getPreco());
		System.out.println("Tempo de Produção do Produto: " + produto1.getTempoProducao());
		System.out.println("Processo de Fabricação do Produto: " + produto1.getProcessoFabricacao());

		System.out.println("ID do Componente 1: " + componente1.getId());
		System.out.println("Nome do Componente 1: " + componente1.getNome());
		System.out.println("ID do Componente 2: " + componente2.getId());
		System.out.println("Nome do Componente 2: " + componente2.getNome());

		Entrega entrega1 = new Entrega();
		entrega1.setId(1);
		entrega1.setPrevisao(new Date());
		entrega1.setDataEnvio(new Date());

		System.out.println("ID da Entrega: " + entrega1.getId());
		System.out.println("Previsão de Entrega: " + entrega1.getPrevisao());
		System.out.println("Data de Envio: " + entrega1.getDataEnvio());

	}

}
