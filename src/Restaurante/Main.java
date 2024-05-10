package Restaurante;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        PratoPrincipal prato1 = new PratoPrincipal();
        prato1.setNome("Bife com Fritas");
        prato1.setPreco(25.99);
        prato1.setDescricao("Um suculento bife acompanhado de batatas fritas");

        Sobremesa sobremesa1 = new Sobremesa();
        sobremesa1.setNome("Bolo de Chocolate");
        sobremesa1.setPreco(12.50);
        sobremesa1.setTipo("Bolo");

        restaurante.addMenu(prato1);
        restaurante.addMenu(sobremesa1);

        restaurante.listarMenu();
    }

}

class ItemMenu {

    private String nome;
    private double preco;
    
    public ItemMenu() {
    	
    }
    public ItemMenu(String nome, double preco) {
    	setNome(nome);
    	setPreco(preco);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String returnItem() {
        return "Nome: " + getNome() + "\nPreço: " + getPreco();
    }

}

class PratoPrincipal extends ItemMenu {

    private String descricao;
    
    public PratoPrincipal() {
    	
    }
    public PratoPrincipal(String nome, double preco, String descricao) {
    	super(nome, preco);
    	setDescricao(descricao);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String returnItem() {
        return super.returnItem() + "\nDescrição: " + getDescricao();
    }

}

class Sobremesa extends ItemMenu {

    private String tipo;
    
    public Sobremesa() {
    	
    }    
    public Sobremesa(String nome, double preco, String tipo) {
    	super(nome, preco);
    	setTipo(tipo);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String returnItem() {
        return super.returnItem() + "\nTipo: " + getTipo();
    }

}

class Restaurante {

    private ArrayList<ItemMenu> menu = new ArrayList<>();

    public void addMenu(ItemMenu item) {
        menu.add(item);
    }

    public void remMenu(ItemMenu item) {
        menu.remove(item);
    }

    public void listarMenu() {
        for (ItemMenu item : menu) {
            System.out.println(item.returnItem());
        }
    }

}
