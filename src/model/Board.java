package model;

public abstract class Board {
    /*
    Instances
     */
    private int n;
    private final char[][] grid = new char[n][n];
    /*
    Constructor
     */
    public Board(int n){
        //TODO: initialize instance n
    }
    /*
    Operations
     */
    public abstract void update(int x,int y,char s); //Function to be overridden - updates board
    public void display_board(){
        //TODO: Display board in a common way for all kinds of board games
    }
    public abstract boolean is_winner(char sym); //Function to be overridden - determines if given symbol is winner

    public abstract boolean is_draw(); //Function to be overridden - determines if board is in a draw state

}
