package kolos;

public class Product {
    
    private String name;
    private String code;
    private int price;

    
    public Product(String name, String code, int price){
            setName(name);
            setCode(code);
            setPrice(price);
        }
    
    public String getName(){
        return name;
    }
    
    public String getCode(){
        return code;
    }
    
    public int getPrice(){
        return price;
    }
    
    private void setName(String name){
        if(name != null){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Niepoprawna nazwa!");
        }
    }
    
    private void setCode(String code){
        if(code.matches("^[a-zA-Z]{2}-[M][0-9]{4}")){
            this.code = code;
        }else{
            throw new IllegalArgumentException("Niepoprawny kod!");
        }
        
    }
    
    private void setPrice(int price){
        this.price = price;
    }
    
}
