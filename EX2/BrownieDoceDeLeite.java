package inatel.cdg.EX2;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }

    public void addDoceDeLeite(){
        System.out.println("Brownie de doce de leite adicionado!");
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Brownie de doce de leite adicionado ao carrinho");
    }
}
