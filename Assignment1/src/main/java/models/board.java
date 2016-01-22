package models;

import java.io.Serializable;
import java.util.LinkedList;

//board class; dunno what Serializable is but no code break so ok?
public class board implements Serializable
{
    //declares new list; list contains arrays, which contain cards
    public LinkedList<LinkedList<card>> boardList = new LinkedList<>();

    //need copy constructor?

    //need default constructor?

    //constructor
    public board()
    {
        //initializes columns
        addFourColumns();
    }

    //add the four columns to the linked list
    public void addFourColumns()
    {
        LinkedList<card> sampleCol = new LinkedList<>();
        for (int i = 0; i < 4; i++)
        {
            boardList.add(sampleCol);
        }
    }

    //adds the two of spades (default card?) to the column colToAddTo
    public void addDefaultCardToColumn(int colToAddTo) {

        card cardToAdd = new card();
        boardList.get(colToAddTo).add(cardToAdd);
    }

    //adds a custom card to the column colToAddTo
    public void addCardToColumn(int colToAddTo, card cardToAdd)
    {
        boardList.get(colToAddTo).add(cardToAdd);
    }

    //checks the first card in inputted columns for number removability (will be expanded to check top card in column)
    public boolean checkNums(int checkCol, int removeCol)
    {
        if (boardList.get(0).get(0).num > boardList.get(0).get(1).num)
        {
            return true;
        }
        else return false;
    }

    //checks the first card in inputted columns for suit removability (will be expanded to check top card in column)
    public boolean checkSuits(int checkCol, int removeCol)
    {
        if (boardList.get(checkCol).get(0).suit == boardList.get(removeCol).get(0).suit)
        {
            return true;
        }
        else return false;
    }

    //checks the first card in inputted columns for removability (will be expanded to check top card in column)
    public boolean checkIfRemovable(int checkCol, int removeCol)
    {
        if (checkSuits(checkCol, removeCol) && checkNums(checkCol, removeCol))
        {
            return true;
        }
        else return false;
    }

    public card getCardFromDeck()
    {
        card newCardFromDeck = new card();
        return newCardFromDeck;
    }
}
