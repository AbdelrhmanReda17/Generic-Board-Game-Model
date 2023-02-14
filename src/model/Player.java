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
    public int[] get_move(int x,int y){ // Returns an array of 2 positions [x,y] to validate them
        int[] moves = new int[2];
        Scanner move = new Scanner(System.in);
        System.out.println("Enter X coordinate: ");
        moves[0] =  move.nextInt();
        System.out.println("Enter Y coordinate: ");
        moves[1] = move.nextInt();
        return moves;
    }

    public String get_name(){
        return name;
    }

    public char get_symbol(){
        return symbol;
    }

}
