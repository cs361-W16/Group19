package models;

import java.util.Random;

import java.io.Serializable;
import java.util.ArrayList;


public class deck implements Serializable
{
    //initialize static array of 52 card objects
    card[] deck_array = new card[52];
    int[] num = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public deck()
    {

    }

    public void create_deck()
    {
        int count = 0;
        int j;
        for(j=0;j<13;++j)
        {

            deck_array[j] = new card(num[count], "heart");
            ++count;
        }

        int count2 = 0;
        for(int i = 13;i<26;++i)
        {

            deck_array[i] = new card(num[count2], "spade");
            ++count2;
        }

        int count3 = 0;
        int i;
        for(i=26;i<39;++i)
        {

            deck_array[i] = new card(num[count3], "diamond");
            ++count3;
        }

        int count4 = 0;
        for(i=39;i<52;++i)
        {

            deck_array[i] = new card(num[count4], "clubs");
            ++count4;
        }

    }

    //deal

    public int randomInteger(int min, int max)
    {

        Random rand = new Random();

        // nextInt excludes the top value so we have to add 1 to include the top value
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public int count() {
        return deck_array.length;
    }


}
