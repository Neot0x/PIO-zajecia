package com.mycompany.szyfrowanie;

public class Szyfrowanie {

    public static void main(String[] args) {

        String text = "ABC";
        int key = 13;
        
        StringBuilder sb = new StringBuilder();

        
        text.chars()
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
