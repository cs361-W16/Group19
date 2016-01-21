package controllers;


public class card
{


    public int num;
    public char suit;

    //default constructor
    public card()
    {
        num = 2;
        suit = 'S';
    }

    //custom constructor
    public card(int numToSet, char suitToSet)
    {
        num = numToSet;
        suit = suitToSet;
    }

    //helper function to set number of card to desired input
    public void setNum(int numToSet)
    {
        num = numToSet;
    }

    //helper function to set suit of card to desired input
    public void setSuit(char suitToSet) { suit = suitToSet; }
}