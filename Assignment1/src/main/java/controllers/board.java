package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//board class; dunno what Serializable is but no code break so ok?
public class board implements Serializable
{

    //declares new list; list contains arrays, which contain cards
    public List<ArrayList<card>> boardList = new LinkedList<>();

    //default constructor
    public board()
    {
        //initializes columns
        addFourColumns();
    }

    //add the four columns to the linked list
    public void addFourColumns()
    {
        //possibly unnecessary code? but don't know how to work around it
        ArrayList<card> firstCol = new ArrayList<>();
        ArrayList<card> secondCol = new ArrayList<>();
        ArrayList<card> thirdCol = new ArrayList<>();
        ArrayList<card> fourthCol = new ArrayList<>();
        //add four columns/arrays of cards to the linked list
        boardList.add(firstCol);
        boardList.add(secondCol);
        boardList.add(thirdCol);
        boardList.add(fourthCol);
    }

    //adds the two of spades (default card?) to the column colToAddTo
    public void addDefaultCardToColumn(int colToAddTo)
    {

        card cardToAdd = new card();
        boardList.get(colToAddTo).add(cardToAdd);
    }

    //adds a custom card to the column colToAddTo
    public void addCardToColumn(int colToAddTo, int cardNum, char cardSuit)
    {
        card cardToAdd = new card(cardNum, cardSuit);
        boardList.get(colToAddTo).add(cardToAdd);
    }

}
