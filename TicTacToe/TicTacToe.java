package tictactoe;

public class TicTacToe {
    private final ValueOfCell[][]  board = new ValueOfCell[3][3];
    public Player[] players = new Player[2];
    public TicTacToe(){
        for (int rows = 0; rows < board.length; rows++){
            for (int column = 0; column < board.length; column++){
                board[rows][column] = ValueOfCell.EMPTY;
            }
        }

        Player playerOne = new Player(1,ValueOfCell.X);
        Player playerTwo = new Player(2, ValueOfCell.O);
        players[0] = playerOne;
        players[1] = playerTwo;
    }
    public ValueOfCell[][] getGameBoard() {
        return board;
    }

    public int getNumberOfPlayers(){
        return players.length;
    }


    public Player[] getPlayers() {

        return players;
    }
    public void markBoard(int playerId){
        
    }

}
