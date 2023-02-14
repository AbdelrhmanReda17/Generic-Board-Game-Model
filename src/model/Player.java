package model;

import java.util.Scanner;

public class Player{
    /*
      Class Instances
     */
    private String name;
    private char symbol;
    /*
      Constructor
     */
    public Player(String name,char symbol){
        this.name = name;
        this.symbol = symbol;
    }
    /*
        Class Methods
     */
    public void get_move(int[] moves){ // updates given coordinates in array of moves
        Scanner move = new Scanner(System.in);
        System.out.println("Enter X coordinate: ");
        moves[0] =  move.nextInt();
        System.out.println("Enter Y coordinate: ");
        moves[1] = move.nextInt();
    }

    public String get_name(){
        return name;
    }

    public char get_symbol(){
        return symbol;
    }

}
