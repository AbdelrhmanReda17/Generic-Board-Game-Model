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
        board.display_board();
        int[] moves = new int[2];
        moves[0]= moves[1] = -1;
        while (board.available_moves() && !board.is_winner(players[0].get_symbol()) && !board.is_winner(players[1].get_symbol())){ //Keep playing until board is not in a win state;
            while (!board.valid_move(moves)){ //Keep taking input from user until gives a valid move
                System.out.println(players[turn].get_name() + " turn");
                players[turn].get_move(moves);
            }
            board.update(moves[0],moves[1],players[turn].get_symbol()); //Update board with move
            board.display_board();
            turn = (turn+1)%2; //Keep switching turns between players
            moves[0] = moves[1] = -1; //Making the moves invalid to start taking new moves;
        }

        if(board.is_winner(players[0].get_symbol())){
            System.out.println(players[0].get_name() + " WINS!!!");
            return;
        }
        if(board.is_winner(players[1].get_symbol())){
            System.out.println(players[1].get_name() + " WINS!!!");
            return;
        }
        if(board.is_draw()){
            System.out.println("Its a Draw!!");
        }

    }
}
