package models;


import models.board;
import org.junit.Test;

import ninja.NinjaDocTester;

/*

Java test for board class

 */

public class boardTest extends NinjaDocTester
{

    @Test
    public void addFourCardsToBoard()
    {
        board playBoard = new board();
        playBoard.addCardToColumn(0,playBoard.getCardFromDeck());
        playBoard.addCardToColumn(1,playBoard.getCardFromDeck());
        playBoard.addCardToColumn(2,playBoard.getCardFromDeck());
        playBoard.addCardToColumn(3,playBoard.getCardFromDeck());
        assert playBoard.boardList.get(0).peekLast().num == 0;
        assert playBoard.boardList.get(1).peekLast().num == 0;
        assert playBoard.boardList.get(2).peekLast().num == 0;
        assert playBoard.boardList.get(3).peekLast().num == 0;
    }

    @Test
    public void testBoardInitialSize()
    {
        board playBoard = new board();
        assert playBoard.boardList.size() == 4;

    }

    @Test
    public void testBoardContainsDeck()
    {
        board playBoard = new board();
        assert playBoard.masterDeck.count() != 0;
    }


}