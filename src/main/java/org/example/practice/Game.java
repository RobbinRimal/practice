package org.example.practice;

public class Game {
    public static String rps(String p1, String p2) {
        int flag=0;
        switch (p1){
            case "scissors":
                if(p2=="paper"){
                    flag=1;
                }
                else if(p2=="rock"){
                    flag=2;
                }else flag=0;
                break;
            case "paper":
                if(p2=="scissors"){
                    flag=2;
                }
                else if(p2=="rock"){
                    flag=1;
                }else flag=0;
                break;
            case "rock":
                if(p2=="scissors"){
                    flag=1;
                }
                else if(p2=="paper"){
                    flag=2;
                }else flag=0;
                break;

        }
        switch (flag){
            case 0 :
                return "Draw!";
            case 1 :
                return "Player 1 won!";
            case 2 :
                return "Player 2 won!";

        }
        return null;
    }
}
