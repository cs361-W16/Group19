package models;

import javax.crypto.NoSuchPaddingException;
import java.util.Random;


public class card extends deck{

    /*
        fields
     */

    public int num;
    public String suit;


    //default constructors
    public card() {
        num = 0;
        suit = null;
    }


    //constructor
    public card(int num,String suit){
        this.num = num;
        this.suit = suit;
    }


    //copy constructor
    public card(card acard){
        this.num = acard.num;
        this.suit = acard.suit;
    }


    //compare function of the number and suit to determine if the number are the same
    public int compare(int num, String suit)
    {
        //if the number is greater than or equal to so
        if(this.num <= num)
        {
            if(suit.equals(this.suit))
                return 1;
            else
                return 0;
        }
        else
            return 0;
    }
}