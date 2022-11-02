package com.mycompany.zajecia;

import java.util.Random;

public class Player{
        
        private Random brain = new Random();
        private String name = "Player";
        
        public Player(){}
        public Player(String name){
            setName(name);
        }
        
        public void setName(String name){
            if(name != null && !name.isEmpty())
                this.name = name;
            else
                System.err.println("Bledna nazwa");
        }
        
        public String getName(){
            return name;
        }
        
        public int guess(){
            return brain.nextInt(6)+1;
        }
        
}

/*  REGEX - wyrażenia regularne
    regex101.com
    ^[a-zA-Z0-9.\-_+]{3,}$
*/
