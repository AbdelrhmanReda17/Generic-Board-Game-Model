package model;

public abstract class Board {
    /*
    Instances
     */
    private int n;
    private char[][] grid = new char[n][n];
    /*
    Constructor
     */
    public Board(int n){ this.n = n;}
    /*
    Operations
     */
    public abstract void update(int x,int y,char s); //Function to be overridden - updates board
    public void display_board(){ //Common display for all boards
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public abstract boolean is_winner(char sym); //Function to be overridden - determines if given symbol is winner

    public abstract boolean is_draw(); //Function to be overridden - determines if board is in a draw state

    public abstract boolean valid_move(int[] move); //Function to be overridden - Validates if the given coordinates can be placed on board

    public abstract boolean available_moves(); //Function to be overridden - returns true if game is not in a draw or win state

}
