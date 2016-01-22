
package models;

import org.hibernate.annotations.UpdateTimestamp;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Isaac on 1/22/2016.
 */
public class deckTest {

    @Test
    public void testDeckExists()
    {
        deck testDeck = new deck();
        testDeck.create_deck();
        assertNotNull(testDeck);
    }

    @Test
    public void testRandomNumber()
    {
        int smallNum = 0; int bigNum = 10000;
        deck testDeck = new deck();
        int randomNum = testDeck.randomInteger(smallNum,bigNum);
        int randomNum2 = testDeck.randomInteger(smallNum,bigNum);
        assert randomNum != randomNum2;
    }

    @Test
    public void testGetCount()
    {
        deck testDeck = new deck();
        testDeck.create_deck();
        int deckCount = testDeck.count();
        assert deckCount == 52;
    }

}

