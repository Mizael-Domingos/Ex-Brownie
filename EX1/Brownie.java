package inatel.cdg.EX1;

public class Brownie {

    protected String nome;
    protected String sabor;
    protected double preco;

    public Brownie(String nome, String sabor, double preco){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompra(){
        System.out.println("Brownie adicionado ao Carrinho!");
    }

    public void calculaValorTotaldaCompra(){
        System.out.println("Nome: " + nome + " custa: " + preco);

    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor " + sabor);
    }
}
