package inatel.cdg.EX3;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }

    public void addNutella(){
        System.out.println("Brownie de nutella adicionado!");
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Brownie de nutella adicionado ao carrinho");
    }
}
