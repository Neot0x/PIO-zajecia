package kolos;

public class Kolos {

    public static void main(String[] args) {
        String name = "Nazwa";
        String code = "DF-M8642";
        int price = 100;
        
        String nazwa = "Domyslna";
        String kod = "KA-M4138";
        int cena = 20;
        
        Cart cart = new Cart();
        
        cart.addItem(new Product(name, code, price));
        cart.addItem(new Product(nazwa, kod, cena));
        
        
        cart.printItems();
        cart.removeItem(code);
        cart.printItems();
    }
    
}
