package com.mycompany.szyfrowanie;

public class Szyfrowanie {

    public static void main(String[] args) {
        //long t = System.currentTimeMillis();
        
        //String text = "*";
        //StringBuilder sb = new StringBuilder();
        //for(int i = 0; i < 1000000; i++){
            //sb.append("*");
        //    sb.append('*');             //pojedynczy znak
        //}
        //String text = sb.toString();
        //System.out.print((System.currentTimeMillis() - t) + "ms");
        
        String text = "ABC";
        int key = 13;
        
        StringBuilder sb = new StringBuilder();
        //for(int i = 0; i < text.length(); i++){
        //    int c = text.charAt(i);
        //    c = c + key;
        //    sb.append((char)c);
        //}
        
        text.chars()
                //.filter(c -> c >= '0' && c <='9')
                //.limit(3)
                .mapToObj(c -> {
                    return (char)(c + key);
                            })
                .forEach(c ->{
                        sb.append(c);
                        System.out.println(c);
                        });
                
        String encryptedText = sb.toString();
        System.out.println(encryptedText);
    }
}
// unikac magic numbers, liczb tak po protsu dodanych
// zdefinowanie alfbetu