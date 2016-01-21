package controllers;


import org.junit.Test;

import ninja.NinjaDocTester;

import java.lang.management.PlatformLoggingMXBean;
import java.lang.reflect.Array;

/*

Java test for board class

 */
public class boardTest extends NinjaDocTester
{

    @Test
    public void testBoardInitialSize()
    {
        board playBoard = new board();
        assert playBoard.boardList.size() == 4;

    }

    @Test
    public void testCardDefaultAdd()
    {
        board playBoard = new board();
        playBoard.addDefaultCardToColumn(0);
        assert playBoard.boardList.get(0).get(0).suit == 'S';
    }

    @Test
    public void testFourCardDefaultAdd() {
        board playBoard = new board();
        for (int i = 0; i < 4; i++)
        {
            playBoard.addDefaultCardToColumn(i);
            assert playBoard.boardList.get(i).get(0).suit == 'S';
        }

    }

    @Test
    public void testCardAdd()
    {
        board playBoard = new board();
        playBoard.addCardToColumn(0,2,'C');
        assert playBoard.boardList.get(0).get(0).suit == 'C';
    }

    /*@Test
    public void testAddCardToColumn()
    {

        board playBoard = new board();

        playBoard.addCardToColumn(1);
        assert playBoard.boardList.get(1).size() != 0;




    }*/


}