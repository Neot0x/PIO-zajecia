package kolos;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Cart {
    
    private Product product;
    private List<Product> products = new ArrayList<>();
            
    public void addItem(Product product){
            products.add(product);
    }
    
    public void printItems(){
        System.out.println("-------");
        products.forEach(product -> {System.out.println(product.getName() + " " + product.getCode() + " " + product.getPrice() );});
    }
    
    public void removeAll(){
        for(int i=0; i < products.size(); ++i){
                products.remove(i);
                
        }
    }
    
    public void removeItem(String code){
        for(Iterator<Product> it=products.iterator(); it.hasNext();){
            if(it.next().getCode().equals(code)){
                it.remove();
                break;
            }
        }
    }
    
}