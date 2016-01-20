public class card{

    /*
        fields
     */
    public int number;
    public int suit;

    /*

    methods: compare the card
     */
    public int compare(int num,int suit)
    {
        if(num==card.num)
        {
            if(suit==card.suit)
                return 1;
            else
                return 0;
        }
        else
            return 0;
    }
}
