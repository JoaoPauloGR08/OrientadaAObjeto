/**
 * Esta classe representa a gestão dos produtos e serviços da empresa Weg.
 * Permite adicionar, remover e exibir produtos, como geradores, inversores de frequência,
 * motores elétricos, e serviços de manutenção associados a esses produtos.
 * 
 * @author João Paulo
 * @version 1.0
 * 
 */
package Atividade5;

import java.util.ArrayList;

public class Weg {

    private ArrayList<Gerador> ge = new ArrayList<Gerador>();
    private ArrayList<InversorFrequencia> iv = new ArrayList<InversorFrequencia>();
    private ArrayList<MotorEletrico> me = new ArrayList<MotorEletrico>();
    private ArrayList<ServicoManutencao> listaManut = new ArrayList<ServicoManutencao>();

    /**
     * Obtém o produto Weg com o código especificado.
     * 
     * @param cod O código do produto Weg a ser obtido.
     * @return O produto Weg com o código especificado, ou null se não for encontrado.
     */
    public ProdutoWeg getMaquinaCode(int cod) {
        for (int i = 0; i < ge.size(); i++) {
            if (ge.get(i).getCodigo() == cod) {
                return ge.get(i);
            }
        }
        return null;
    }

    /**
     * Adiciona um serviço de manutenção à lista de serviços.
     * 
     * @param servManut O serviço de manutenção a ser adicionado.
     */
    public void addServico(ServicoManutencao servManut) {
        if (listaManut.size() > 0) {
            boolean productFound = false;
            for (int i = 0; i < listaManut.size(); i++) {
                if (listaManut.get(i).getCodigo() == servManut.getCodigo()) {
                    System.out.println("Já existe um serviço com o ID " + servManut.getCodigo() + ".");
                    System.out.println();
                    productFound = true;
                    break;
                }
            }
            if (!productFound) {
                listaManut.add(servManut);
            }
        } else {
            listaManut.add(servManut);
        }
    }

    /**
     * Lista os produtos Weg disponíveis.
     */
    public void listaProdutos() {
        System.out.println("-======== Geradores ========-");
        for (int i = 0; i < ge.size(); i++) {
            System.out.println();
            System.out.println("Gerador: [" + (1 + i) + "]");
            System.out.println("Código: [" + ge.get(i).getCodigo() + "]");
            System.out.println("Tipo: [" + ge.get(i).getTipo() + "]");
            System.out.println("Potência: [" + ge.get(i).getPotencia() + "]");
            System.out.println("Tensão: [" + ge.get(i).getTensao() + "]");
            System.out.println("Capacidade: [" + ge.get(i).getCapacidade() + "]");
            System.out.println("Preço: [" + ge.get(i).getPreco() + "]");
            System.out.println("Combustível: [" + ge.get(i).getCombustivel() + "]");
            System.out.println("Autonomia: [" + ge.get(i).getAutonomia() + "]");
        }
        System.out.println();
        System.out.println("-= Inversores de Frequência =-");
        for (int i = 0; i < iv.size(); i++) {
            System.out.println();
            System.out.println("Inversor de Frequência: [" + (1 + i) + "]");
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
            System.out.println("Motor Elétrico: [" + (1 + i) + "]");
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

    /**
     * Lista os serviços de manutenção disponíveis.
     */
    public void listaManutencao() {
        for (int i = 0; i < listaManut.size(); i++) {
            System.out.println();
            System.out.println("Manutenção: [" + (1 + i) + "]");
            System.out.println("Código: [" + listaManut.get(i).getCodigo() + "]");
            System.out.println("Descrição: [" + listaManut.get(i).getDescricao() + "]");
            System.out.println("Custo: [" + listaManut.get(i).getCusto() + "]");
            System.out.println("Código Máquina: [" + listaManut.get(i).getProdCod() + "]");
        }
        System.out.println();
    }

    /**
     * Realiza a manutenção de um serviço.
     * 
     * @param cod O código do serviço a ser removido.
     */
    public void realizarManutencao(int cod) {
        for (int i = 0; i < listaManut.size(); i++) {
            if (listaManut.get(i).getCodigo() == cod) {
                listaManut.remove(i);
            }
        }
        System.out.println();
    }

    /**
     * Remove um gerador com o código especificado.
     * 
     * @param cod O código do gerador a ser removido.
     */
    public void remGe(int cod) {
        for (int i = 0; i < ge.size(); i++) {
            if (ge.get(i).getCodigo() == cod) {
                ge.remove(i);
            }
        }
        System.out.println();
    }

    /**
     * Remove um inversor de frequência com o código especificado.
     * 
     * @param cod O código do inversor de frequência a ser removido.
     */
    public void remIv(int cod) {
        for (int i = 0; i < iv.size(); i++) {
            if (iv.get(i).getCodigo() == cod) {
                iv.remove(i);
            }
        }
        System.out.println();
    }

    /**
     * Remove um motor elétrico com o código especificado.
     * 
     * @param cod O código do motor elétrico a ser removido.
     */
    public void remMe(int cod) {
        for (int i = 0; i < me.size(); i++) {
            if (me.get(i).getCodigo() == cod) {
                me.remove(i);
            }
        }
        System.out.println();
    }

    /**
     * Adiciona um gerador à lista de produtos Weg.
     * 
     * @param prod O gerador a ser adicionado.
     */
    public void addGe(Gerador prod) {
        if (ge.size() > 0) {
            boolean productFound = false;
            for (int i = 0; i < ge.size(); i++) {
                if (ge.get(i).getCodigo() == prod.getCodigo()) {
                    System.out.println("Já existe um gerador com o ID " + prod.getCodigo() + ".");
                    System.out.println();
                    productFound = true;
                    break;
                }
            }
            if (!productFound) {
                ge.add(prod);
            }
        } else {
            ge.add(prod);
        }
    }

    /**
     * Adiciona um inversor de frequência à lista de produtos Weg.
     * 
     * @param prod O inversor de frequência a ser adicionado.
     */
    public void addIv(InversorFrequencia prod) {
        if (iv.size() > 0) {
            boolean productFound = false;
            for (int i = 0; i < iv.size(); i++) {
                if (iv.get(i).getCodigo() == prod.getCodigo()) {
                    System.out.println("Já existe um gerador com o ID " + prod.getCodigo() + ".");
                    System.out.println();
                    productFound = true;
                    break;
                }
            }
            if (!productFound) {
                iv.add(prod);
            }
        } else {
            iv.add(prod);
        }
    }

    /**
     * Adiciona um motor elétrico à lista de produtos Weg.
     * 
     * @param prod O motor elétrico a ser adicionado.
     */
    public void addMe(MotorEletrico prod) {
        if (me.size() > 0) {
            boolean productFound = false;
            for (int i = 0; i < me.size(); i++) {
                if (me.get(i).getCodigo() == prod.getCodigo()) {
                    System.out.println("Já existe um gerador com o ID " + prod.getCodigo() + ".");
                    System.out.println();
                    productFound = true;
                    break;
                }
            }
            if (!productFound) {
                me.add(prod);
            }
        } else {
            me.add(prod);
        }
    }

}
