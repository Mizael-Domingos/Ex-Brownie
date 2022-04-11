package inatel.cdg.EX3;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }

    public void addCafe(){
        System.out.println("Brownie de café adicionado!");
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Brownie de cafe adicionado ao carrinho");
    }

}
