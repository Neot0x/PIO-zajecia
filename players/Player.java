package com.mycompany.zajecia.players;

abstract public class Player{
                
        private String name = "Player";
        
        public Player(){}
        public Player(String name){
            setName(name);
        }
        
        public final String getName(){
            return name;
        }
        
        public final void setName(String name){
            if(name != null && name.matches("^[a-zA-Z\\d._\\-]{3,}$"))
                this.name = name;
            else
//              System.err.println("Bledna nazwa gracza");
                throw new IllegalArgumentException("Niepoprawne imie");
        }
        
        abstract public int guess();
}