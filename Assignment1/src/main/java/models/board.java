package models;

import java.io.Serializable;
import java.util.LinkedList;

//board class; dunno what Serializable is but no code break so ok?
public class board implements Serializable
{
    //declares new list; list contains arrays, which contain cards
    public LinkedList<LinkedList<card>> boardList = new LinkedList<>();
    public deck masterDeck = new deck();
    //need copy constructor?

    //need default constructor?

    //constructor
    public board()
    {
        //initializes columns
        addFourColumns();
        masterDeck.create_deck();
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

    //adds a custom card to the column colToAddTo
    public void addCardToColumn(int colToAddTo, card cardToAdd)
    {
        boardList.get(colToAddTo).add(cardToAdd);
    }



    public card getCardFromDeck()
    {
        card newCardFromDeck = new card();
        return newCardFromDeck;
    }
}
