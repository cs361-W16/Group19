package models;

/**
 * Created by Isaac on 1/21/2016.
 */
public class deck {
    card[] deckArray = new card[52];


    public deck() {
        for (int i = 0; i < 52; ++i) {
            if (i / 13 == 1) {
                deckArray[i].setSuit('C');
            }
        }
    }
}
