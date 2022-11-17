package com.mycompany.zajecia;

import java.util.Scanner;

public class PlayerHuman extends Player{
       
    private final Scanner scanner = new Scanner(System.in);
    
    public PlayerHuman(){}
    public PlayerHuman(String name){
        super(name);    //wywołuje konstruktor klasy nadrzędnej, musi być pierszy nad wszystkim
    }
    
    public int guess(){
        System.out.println("Podaj liczbe: ");
        return scanner.nextInt();
    }
}