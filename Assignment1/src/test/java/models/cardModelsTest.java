//Tests for the Card Class
package models;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;


public class cardModelsTest {


    //test to see if a card exists
    //test is see if you can match the cards (Return a card match)


    @Test
    public void testcardExists()
    {
        card mini_card = new card();
        assertNotNull(mini_card);
    }


       @Test
    public void compareCards()
       {
           int num =9;
           String suit = "heart";
        card mini_card = new card(9,"heart");
        assertEquals(1, mini_card.compare(num,suit));
    }

}
