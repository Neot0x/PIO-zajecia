package com.mycompany.zajecia;

import com.mycompany.zajecia.players.PlayerComp;

public class Zajecia {
    public static void main(String[] args) {

        Game game = new Game(null); //wstrzykiwanie zależności
        
        game.addPlayer(new PlayerComp("Stefan"));
        game.addPlayer(new PlayerComp("Krycha"));


        game.printPlayers();
        //game.removePlayer("Zocha");
        //game.printPlayers();
        for(int i = 0; i<100; i++)
            game.play();

        game.printStats();
    }
}