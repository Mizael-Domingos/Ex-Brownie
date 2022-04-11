package inatel.cdg.EX1;

public class Main {
    public static void main(String[] args) {
        BrownieCafe b1 = new BrownieCafe("Brownie1", "Café", 2 );
        BrownieNutella b2 = new BrownieNutella("Brownie2", "Nutella", 5);
        BrownieDoceDeLeite b3 = new BrownieDoceDeLeite("Brownie3", "Doce de leite", 3);

        b1.addCafe();
        b2.addCarrinhoDeCompra();
        b3.calculaValorTotaldaCompra();

        b1.mostrarInfo();
    }
}
