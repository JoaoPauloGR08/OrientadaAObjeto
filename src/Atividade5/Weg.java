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
			System.out.println(ge.get(i).getCodigo());
			System.out.println(ge.get(i).getTipo());
			System.out.println(ge.get(i).getPotencia());
			System.out.println(ge.get(i).getTensao());
			System.out.println(ge.get(i).getCapacidade());
			System.out.println(ge.get(i).getPreco());
			System.out.println(ge.get(i).getCombustivel());
			System.out.println(ge.get(i).getAutonomia());
		}
		System.out.println();
		System.out.println("-= Inversores de Frequência =-");
		for (int i = 0; i < iv.size(); i++) {
			System.out.println(iv.get(i).getCodigo());
			System.out.println(iv.get(i).getTipo());
			System.out.println(iv.get(i).getPotencia());
			System.out.println(iv.get(i).getTensao());
			System.out.println(iv.get(i).getCapacidade());
			System.out.println(iv.get(i).getPreco());
			System.out.println(iv.get(i).getCapFreq());
			System.out.println(iv.get(i).getNumeroFases());
		}
		System.out.println();
		System.out.println("-===== Motores Elétricos =====-");
		for (int i = 0; i < me.size(); i++) {
			System.out.println(me.get(i).getCodigo());
			System.out.println(me.get(i).getTipo());
			System.out.println(me.get(i).getPotencia());
			System.out.println(me.get(i).getTensao());
			System.out.println(me.get(i).getCapacidade());
			System.out.println(me.get(i).getPreco());
			System.out.println(me.get(i).getTipoRolamento());
			System.out.println(me.get(i).getEficiencia());
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
		if (!ge.contains(prod)) {
			ge.add(prod);
		} else {
			System.out.println("Já existe um gerador com o ID " + prod.getCodigo() + ".");
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
