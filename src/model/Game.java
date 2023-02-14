package model;

import model.Board;
import model.Player;

public class Game {
    /*
    Instances
     */
    private Board board;
    private Player[] players;
    int turn = 0;

    /*
    Constructor
     */
    public Game(Board board,Player[] players){
        this.board = board;
        this.players = players;
    }
    /*
    Operations
     */
    public void play_game(){
        int[] moves = new int[2];
        while (!board.available_moves()){ //Keep playing until board is not in a win state;
            while (!board.valid_move(moves)){ //Keep taking input from user until gives a valid move
                System.out.println(players[turn].get_name() + " turn");
                players[turn].get_move(moves);
            }
            board.update(moves[0],moves[1],players[turn].get_symbol()); //Update board with move
            turn = (turn+1)%2; //Keep switching turns between players
            moves[0] = moves[1] = -1; //Making the moves invalid to start taking new moves;
        }
        if(board.is_draw()){
            System.out.println("Its a Draw!!");
            return;
        }
        String winner;
        if(board.is_winner(players[0].get_symbol())){
            winner = players[0].get_name();
        }else{
            winner = players[1].get_name();
        }
        System.out.println(winner + " WINS!!!");
    }
}
