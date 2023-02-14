package XO_Game;

import model.Board;

public class XOBoard extends Board {

    public XOBoard(int n) {
        super(n);
    }

    @Override
    public void update(int x, int y, char s) {
        grid[x][y] = s;
    }

    @Override
    public boolean is_winner(char sym) {
        //Check all rows
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==sym) count++;
            }
            if(count==n) return true;
        }
        //check all cols
        for(int j=0;j<n;j++){
            int count = 0;
            for(int i=0;i<n;i++){
                if(grid[i][j]==sym) count++;
            }
            if(count==n) return true;
        }
        //Check diagonal 1
        int count = 0;
        for(int i=0,j=0;i<n&&j<n;i++,j++){
            if(grid[i][j]!=sym) break;
            count++;
        }
        if(count==n) return true;count = 0;
        //Check diagonal 2
        for(int i=n-1,j=0;i>=0&&j<n;i--,j++){
            if(grid[i][j]!=sym) break;
            count++;
        }
        return count == n;
    }

    @Override
    public boolean is_draw() {
        return !available_moves();
    }

    @Override
    public boolean valid_move(int[] move) {
        return move[0]<n && move[0]>=0 && move[1]<n && move[1]>=0 && grid[move[0]][move[1]]=='_';
    }

    @Override
    public boolean available_moves() {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='_') return true;
            }
        }
        return false;
    }
}
