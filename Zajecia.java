package com.mycompany.zajecia;

import java.util.Random;

public class Zajecia {
    public static void main(String[] args) {
        
        Random dice = new Random();
        Player player = new Player();
        player.setName("Player");
        
        int number;
        int guess;
        do{
        
        number = dice.nextInt(6)+1;
        System.out.println(number);
        
        guess = player.guess();
        System.out.println(player.getName() + ": " + guess );
        
        if(guess == number){
            System.out.println("Zgadles");
        }else{
            System.out.println("Nie zgadles");
        }
        }while(guess != number);
    }
}
/*zasady otwarte zamknięte
Regresja -
Refaktoryzacja +
*/