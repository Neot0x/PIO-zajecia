package com.mycompany.zajecia.statistics;

import com.mycompany.zajecia.players.Player;
import java.util.HashMap;
import java.util.Map;

public class WinStatistics implements Statistics{

    private Map<String, Integer> stats = new HashMap<>();

    public void winner(Player player){
        String name = player.getName();
        stats.put(name, stats.getOrDefault(name, 0) + 1);
    }

    public void print(){
        System.out.println("-----STATS-----");
        stats.forEach( (name,score) -> { System.out.println(name +" : "+ score);});
        
    }

    public void clear(){

    }   
}
