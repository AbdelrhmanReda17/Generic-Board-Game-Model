import XO_Game.XOBoard;
import model.Board;
import model.Game;
import model.Player;

public class Main {
    public static void main(String[] args) {
        Board board = new XOBoard(3);
        Player[] players = new Player[2];
        players[0] = new Player("P1",'X');
        players[1] = new Player("P2",'O');
        Game game = new Game(board,players);

        game.play_game();
    }
}