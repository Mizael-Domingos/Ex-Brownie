package inatel.cdg.EX3;

public class Main {
    public static void main(String[] args) {
        inatel.cdg.EX3.BrownieCafe b1 = new BrownieCafe("Brownie1", "Café", 2 );
        inatel.cdg.EX3.BrownieNutella b2 = new BrownieNutella("Brownie2", "Nutella", 5);
        inatel.cdg.EX3.BrownieDoceDeLeite b3 = new BrownieDoceDeLeite("Brownie3", "Doce de leite", 3);

        Comprador comprador = new Comprador("Comprador1", 100);

        comprador.efetuarCompra(b1);
        comprador.efetuarCompra(b2);

    }
}
