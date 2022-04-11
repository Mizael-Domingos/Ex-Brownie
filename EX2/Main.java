package inatel.cdg.EX2;

import inatel.cdg.EX3.BrownieCafe;
import inatel.cdg.EX3.BrownieDoceDeLeite;
import inatel.cdg.EX3.BrownieNutella;

public class Main {
    public static void main(String[] args) {
        inatel.cdg.EX3.BrownieCafe b1 = new BrownieCafe("Brownie1", "Café", 2 );
        inatel.cdg.EX3.BrownieNutella b2 = new BrownieNutella("Brownie2", "Nutella", 5);
        inatel.cdg.EX3.BrownieDoceDeLeite b3 = new BrownieDoceDeLeite("Brownie3", "Doce de leite", 3);

        b1.addCarrinhoDeCompra();
        b2.addCarrinhoDeCompra();
        b3.addCarrinhoDeCompra();

    }
}
