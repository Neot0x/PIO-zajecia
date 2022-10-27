package com.mycompany.zajecia;

import java.util.Random;

public class Player {
        
        private Random brain = new Random();
        private String name;
        
        public void setName(String name){
            this.name = name;
        }
        
        public String getName(){
            return name;
        }
        
        public int guess(){
            return brain.nextInt(6)+1;
        }
        
}
/////
package com.mycompany.zajecia;

import java.util.Random;

public class Player{
        
        private Random brain = new Random();
        private String name = "Player"; // dobrze jest przypisać poprawną wartość i blokujemy niepoprawne wartości
        
        public Player(){}
        public Player(String name){
            setName(name);
        }
        
        public void setName(String name){
            //if(name != null && !name.isEmpty()) //w tej kolejności metoda nie będzie wywoływana dla null, bo
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
