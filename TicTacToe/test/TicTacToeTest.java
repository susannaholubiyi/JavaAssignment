package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tictactoe.Player;
import tictactoe.TicTacToe;
import tictactoe.ValueOfCell;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {
    private TicTacToe ticTacToe;
    @BeforeEach
    public void setUpTicTacToe (){
        ticTacToe = new TicTacToe();
    }
    @Test
    public void boardElementsAreEmptyTest(){
        ValueOfCell[][] expected = {{ValueOfCell.EMPTY, ValueOfCell.EMPTY, ValueOfCell.EMPTY},
                                    {ValueOfCell.EMPTY, ValueOfCell.EMPTY, ValueOfCell.EMPTY},
                                    {ValueOfCell.EMPTY,ValueOfCell.EMPTY, ValueOfCell.EMPTY}};
        assertArrayEquals(expected, ticTacToe.getGameBoard());
    }
    @Test
    public void testThatThereAreTwoPlayers(){
        int numberOfPlayers = ticTacToe.getNumberOfPlayers();
        assertEquals(2, numberOfPlayers);
    }
    @Test
    public void playerOneMakesAMove_XIsPlayedTest(){
        Player playerOne = ticTacToe.getPlayers()[1];
        playerOne.play(1);

    }

}
