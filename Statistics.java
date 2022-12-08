package com.mycompany.zajecia;

import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private Map<String, Integer> stats = new HashMap<>();

    public void winner(Player player){
        String name = player.getName();
        //Integer s = stats.get(name);
        //if(s == null){
        //    s = 0;
        //}
        stats.put(name, stats.getOrDefault(name, 0) + 1);
    }

    public void print(){
        System.out.println("-----STATS-----");
        for(Map.Entry<String, Integer> entry : stats.entrySet()){
            System.out.println( entry.getKey() +" : "+ entry.getValue());
            //stats forEach
        }
        
    }

    public void clear(){

    }
    
}
