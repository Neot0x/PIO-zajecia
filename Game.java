package com.mycompany.zajecia;

import java.util.Random;

public class Game {
    
    private Player player;
    
    public void addPlayer(Player player){
        //Player player = new PlayerComp("Ktos");
        this.player = player;
    }
    
    public void play(){
                
        Random dice = new Random();
        
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
// wzorzec nullobject