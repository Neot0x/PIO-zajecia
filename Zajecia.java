package com.mycompany.zajecia;

//import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zajecia {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList();
        list.add("cos");
        list.add("cos innego");
        System.out.println(list);
        System.out.println("----------");
                
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)) ;
        }
        
        System.out.println("----------");
        
        for(String el:list){
            System.out.println(el);
        }
        
        System.out.println("----------");
        
        /*Iterator<String> it = list.iterator();
        
        while(it.hasNext()){
            String el = it.next();
            System.out.println(el);
        }
        */
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        
        /*Game game = new Game();
        game.addPlayer(new PlayerComp());
        game.play();*/
        
    }
}