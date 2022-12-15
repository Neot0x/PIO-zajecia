package com.mycompany.zajecia;

import com.mycompany.zajecia.players.Player;
import com.mycompany.zajecia.statistics.Statistics;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
    private Statistics statistics;
    private Random dice = new Random();
    
    private Player player;
    private List<Player> players = new ArrayList<>();
    
    public Game(){
        this(null);
    }
    
    public Game(Statistics statistics){
        if(statistics != null)
            this.statistics = statistics;
        else
            this.statistics = NullStatistics();
        
    }

    public void addPlayer(Player player){
        if(nameExists(player.getName())){
            player.setName(player.getName() + dice.nextInt(10));
            addPlayer(player);
        }else{
            //this.player = player;
            players.add(player);
        }
    }

    public void printPlayers(){
        System.out.println("-------");
        players.forEach(player -> {System.out.println(player.getName());});
            
    }

    public void removePlayer(String name){
/*        for(int i=0; i < players.size(); ++i){
            if(players.get(i).getName().equals(name)){
                players.remove(i);
                break;
            }        
        }*/

        for(Iterator<Player> it=players.iterator(); it.hasNext();){
            if(it.next().getName().equals(name)){
                it.remove();
                break;
            }
        }

//        players.removeIf( player -> player.getName().equals(name)); //zawsze przejży całość

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
                statistics.winner(player);
            }else{
                System.out.println("Nie zgadles");
            }
            }
        }while(repeat);
    }

    public void printStats(){
        statistics.print();
    }

}