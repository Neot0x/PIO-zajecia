package com.mycompany.zajecia;

import java.util.Scanner;

public class PlayerHuman extends Player{
       
    private Scanner scanner = new Scanner(System.in);
    
    public int guess(){
        System.out.println("Podaj liczbe: ");
        return scanner.nextInt();
    }
}
