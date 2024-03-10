package tictactoe;

public class Player {
    private int id;
    private ValueOfCell cellType;

    public Player(int id, ValueOfCell cellType) {
        this.id = id;
        this.cellType = cellType;
    }

    public int getId() {
        return id;
    }
    public ValueOfCell getCellType(){
        return cellType;
    }

    public void play(int cellNumber) {
       int row = convertToRowFrom(cellNumber);
       int column =convertToColumnFrom(cellNumber);


    }

    private static int convertToRowFrom(int cellNumber) {
        int row = (cellNumber -1) /3;
        return row;
    }

    private static int convertToColumnFrom(int cellNumber) {
        int column = (cellNumber - 1) % 3;
        return column;
    }

}
