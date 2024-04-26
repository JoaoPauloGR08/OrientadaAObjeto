/**
 * 
 * @author João Paulo
 * 
 */

package Atividade5;

import java.util.ArrayList;

public class Weg {

	private ArrayList<Gerador> ge = new ArrayList<Gerador>();
	private ArrayList<InversorFrequencia> iv = new ArrayList<InversorFrequencia>();
	private ArrayList<MotorEletrico> me = new ArrayList<MotorEletrico>();
	private ArrayList<ServicoManutencao> listaManut = new ArrayList<ServicoManutencao>();

	public void addServico(ServicoManutencao servManut) {
		listaManut.add(servManut);
	}

	public void listaProdutos() {
		System.out.println("-======== Geradores ========-");
		for (int i = 0; i < ge.size(); i++) {
			System.out.println();
			System.out.println("Gerador: [" + (1+i) + "]");
			System.out.println("Código: [" + ge.get(i).getCodigo() + "]");
			System.out.println("Tipo: [" + ge.get(i).getTipo() + "]");
			System.out.println("Potência: [" + ge.get(i).getPotencia() + "]");
			System.out.println("Tensão: [" + ge.get(i).getTensao() + "]");
			System.out.println("Capacidade: [" + ge.get(i).getCapacidade() + "]");
			System.out.println("Preço: [" + ge.get(i).getPreco() + "]");
			System.out.println("combustível: [" + ge.get(i).getCombustivel() + "]");
			System.out.println("Autonomia: [" + ge.get(i).getAutonomia() + "]");
		}
		System.out.println();
		System.out.println("-= Inversores de Frequência =-");
		for (int i = 0; i < iv.size(); i++) {
			System.out.println();
			System.out.println("Inversor de Frequência: [" + (1+i) + "]");
			System.out.println("Código: [" + iv.get(i).getCodigo() + "]");
			System.out.println("Tipo: [" + iv.get(i).getTipo() + "]");
			System.out.println("Potência: [" + iv.get(i).getPotencia() + "]");
			System.out.println("Tensão: [" + iv.get(i).getTensao() + "]");
			System.out.println("Capacidade: [" + iv.get(i).getCapacidade() + "]");
			System.out.println("Preço: [" + iv.get(i).getPreco() + "]");
			System.out.println("Capacidade de frequência: [" + iv.get(i).getCapFreq() + "]");
			System.out.println("Número de fases: [" + iv.get(i).getNumeroFases() + "]");
		}
		System.out.println();
		System.out.println("-===== Motores Elétricos =====-");
		for (int i = 0; i < me.size(); i++) {
			System.out.println();
			System.out.println("Motor Elétrico: [" + (1+i) + "]");
			System.out.println("Código: [" + me.get(i).getCodigo() + "]");
			System.out.println("Tipo: [" + me.get(i).getTipo() + "]");
			System.out.println("Potência: [" + me.get(i).getPotencia() + "]");
			System.out.println("Tensão: [" + me.get(i).getTensao() + "]");
			System.out.println("Capacidade: [" + me.get(i).getCapacidade() + "]");
			System.out.println("Preço: [" + me.get(i).getPreco() + "]");
			System.out.println("Tipo de rolamento: [" + me.get(i).getTipoRolamento() + "]");
			System.out.println("Eficiência: [" + me.get(i).getEficiencia() + "]");
		}
		System.out.println();
	}

	public void listaManutencao() {
		for (int i = 0; i < listaManut.size(); i++) {
			System.out.println(listaManut.get(i).getDescricao());
			System.out.println(listaManut.get(i).getCusto());
		}
		System.out.println();

	}

	public void addGe(Gerador prod) {
		if(ge.size() > 0) {
			for (int i = 0; i < me.size(); i++) {
				if(ge.get(i).getCodigo() == prod.getCodigo()) {
					System.out.println("Já existe um gerador com o ID " + prod.getCodigo() + ".");
				} else {
					ge.add(prod);
				}
			}
		} else {
			ge.add(prod);
		}
	}

	public void addIv(InversorFrequencia prod) {
		if (!iv.contains(prod)) {
			iv.add(prod);
		} else {
			System.out.println("Já existe um inversor de frequência com o ID " + prod.getCodigo() + ".");
		}
	}

	public void addMe(MotorEletrico prod) {
		if (!me.contains(prod)) {
			me.add(prod);
		} else {
			System.out.println("Já existe um motor elétrico com o ID " + prod.getCodigo() + ".");
		}
	}

}
