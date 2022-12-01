package com.mycompany.zajecia;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Game {
    Random dice = new Random();
    
    private Player player;
    private List<Player> players = new ArrayList<>();
      
    public void addPlayer(Player player){
        if(nameExists(player.getName())){
            player.setName(player.getName() + dice.nextInt(10));
            addPlayer(player);
        }else{
            //this.player = player;
            players.add(player);
        }
    }

    private boolean nameExists(String name){
        for(Player player : players){
            if(player.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public void play(){

        int number;
        int guess;
        
        boolean repeat = true;
        
        do{
        number = dice.nextInt(6)+1;
        System.out.println(number);
        
        for(Player player : players){
            guess = player.guess();
            System.out.println(player.getName() + ": " + guess );

            if(guess == number){
                System.out.println("Zgadles");
                repeat = false;
            }else{
                System.out.println("Nie zgadles");
            }
            }
        }while(repeat);
    }
}
// wzorzec nullobject
// zastanowić się w jaki sposób usuwać graczy o danym imieniu 