package models;


import models.board;
import org.junit.Test;

import ninja.NinjaDocTester;

/*

Java test for board class

 */

public class boardTest extends NinjaDocTester {

    @Test
    public void addFourCardsToBoard() {
        board playBoard = new board();
        playBoard.addFourCardsToColumns();
        assert playBoard.boardList.get(0).peekLast().num == 0;
        assert playBoard.boardList.get(1).peekLast().num == 0;
        assert playBoard.boardList.get(2).peekLast().num == 0;
        assert playBoard.boardList.get(3).peekLast().num == 0;
    }

    @Test
    public void testBoardInitialSize() {
        board playBoard = new board();
        assert playBoard.boardList.size() == 4;
        assert playBoard.masterDeck.count() == 52;

    }

    @Test
    public void testAddFourColumns() {
        board playBoard = new board();
        playBoard.addFourColumns();
        assert playBoard.boardList.size() == 8; //as default constructor creates 4 columns already
    }

    @Test
    public void testAddCardToBoard() {
        board playBoard = new board();
        card addCard = new card(2, "hearts");
        playBoard.addCardToColumn(0, addCard);
        assert playBoard.boardList.get(0).peekFirst().num == 2;
        assert playBoard.boardList.get(0).peekFirst().suit == "hearts";
    }

    @Test
    public void testAddCardToTop() {
        board playBoard = new board();
        card firstAddCard = new card(2, "spades");
        playBoard.addCardToColumn(0, firstAddCard);
        card addCard = new card(2, "hearts");
        playBoard.addCardToColumn(0, addCard);
        assert playBoard.boardList.get(0).peekFirst().num == 2;
        assert playBoard.boardList.get(0).peekFirst().suit == "hearts";
    }

    @Test
    public void testBoardContainsDeck() {
        board playBoard = new board();
        assert playBoard.masterDeck.count() != 0;
    }

    @Test
    // Check that target column (to move to) is empty
    public void testEmptyCol() {
        // init board, check that selected column contains no cards
        board playBoard = new board();

        //add card to column 0
        card addCard0 = new card(2, "hearts");
        //card addCard1 = new card(12, "spades");
        //card addCard2 = new card(8, "spades");
        playBoard.addCardToColumn(0, addCard0);
        //playBoard.addCardToColumn(1, addCard1);
        //playBoard.addCardToColumn(2, addCard2);

        // control - column 0 has a card
        assert playBoard.boardList.get(0).peekFirst().num == 2;
        assert playBoard.boardList.get(0).peekFirst().suit == "hearts";

        //can we compare to null to check that a col is empty?
        assert playBoard.boardList.get(3).peekFirst() == null;
    }

    /*@Test
    // Test that the top card is selected from column
    public void testSelectAndMove()
    {
        board playBoard = new board();
        card addedCard = new card(2,"spades");
        //select col + card, move card to empty col
        //Assert that original col no longer contains selected card
        //Assert that new col contains selected card/not empty
    }*/
}