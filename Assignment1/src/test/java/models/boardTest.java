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
    public void dealCardToBoard()
    {
        board playBoard = new board();
        playBoard.addCardToColumn(0, playBoard.masterDeck.deck_array[playBoard.masterDeck.randomInteger(0,52)]);
        assert playBoard.boardList.get(0).size() == 1;
    }

    @Test
    public void testBoardInitialSize()
    {
        board playBoard = new board();
        assert playBoard.boardList.size() == 4;
        assert playBoard.masterDeck.count() == 52;

    }

    @Test
    public void testAddFourColumns()
    {
        board playBoard = new board();
        playBoard.addFourColumns();
        assert playBoard.boardList.size() == 8; //as default constructor creates 4 columns already
    }

    @Test
    public void testAddCardToBoard()
    {
        board playBoard = new board();
        card addCard = new card(2,"hearts");
        playBoard.addCardToColumn(0,addCard);
        assert playBoard.boardList.get(0).peekFirst().num == 2;
        assert playBoard.boardList.get(0).peekFirst().suit == "hearts";
    }

    @Test
    public void testAddCardToTop()
    {
        board playBoard = new board();
        card firstAddCard = new card(2,"spades");
        playBoard.addCardToColumn(0,firstAddCard);
        card addCard = new card(2,"hearts");
        playBoard.addCardToColumn(0,addCard);
        assert playBoard.boardList.get(0).peekFirst().num == 2;
        assert playBoard.boardList.get(0).peekFirst().suit == "hearts";
    }

    @Test
    public void testBoardContainsDeck()
    {
        board playBoard = new board();
        assert playBoard.masterDeck.count() != 0;
    }


}