package com.mycompany.zajecia.statistics;

import com.mycompany.zajecia.players.Player;

public interface Statistics {
    void winner(Player player);
    void print();
    void clear(); 
}