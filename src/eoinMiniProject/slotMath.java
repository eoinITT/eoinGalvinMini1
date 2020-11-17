package eoinMiniProject;
public class slotMath {

    private int randomNum1;
    private int randomNum2;
    private int randomNum3;
    private int randomNum4;
    private int randomNum5;
    private int randomNum6;
    private int randomNum7;
    private int randomNum8;
    private int randomNum9;
    private int[] randomResultArray;
    private int winningMultiplierBasedOnSymbolRow1;
    private int winningMultiplierBasedOnSymbolRow2;
    private int winningMultiplierBasedOnSymbolRow3;
    private double winningMultiplierBasedOnSymbolRow1W2S;
    private double winningMultiplierBasedOnSymbolRow2W2S;
    private double winningMultiplierBasedOnSymbolRow3W2S;
    private int winningMultiplier;

/*
    0 - 12.5 = 1 (apple) 3 in a row = 9x multiplier of bet
    12.5 - 25 = 2 (grape) 3 in a row = 12x multiplier of bet
    25 - 37.5 = 3 (lemon) 3 in a row = 12x multiplier of bet
    37.5 - 50 = 4 (cherry) 3 in a row = 15x multiplier of bet
    50 - 62.5 = 5 (banana) 3 in a row = 15x multiplier of bet
    62.5 - 75 = 6 (watermelon) 3 in a row = 18x multiplier of bet
    75 - 87.5 = 7 (orange) 3 in a row = 24x multiplier of bet
    87.5 - 100 = 8 (BAR) 3 in a row = 30x multiplier of bet

    How to win: if num 1,4,7 are all the same (multiplier based on symbol)
                if num 2,5,8 are all the same (multiplier based on symbol)
                if num 3,6,9 are all the same (multiplier based on symbol)

                if num 1,4,7 are all the same and 2,5,8 are also the same. (multiplier of 2 symbols are multi together. eg: 12x x 24x x 36x)
                if num 1,4,7 are all the same and 3,6,9 are also the same. (multiplier of 2 symbols are multi together.)
                if num 2,5,8 are all the same and 3,6,9 are all the same.  (multiplier of 2 symbols are multi together.)

                if 1,4,7 are all the same, 2,5,8 are all the same and 3,6,9 are all the same. (multiplier of all 3 symbols are multi together. eg: 12x x 24x x 24x)

    */

public slotMath ()
{
    setRandomNum1();
    setRandomNum2();
    setRandomNum3();
    setRandomNum4();
    setRandomNum5();
    setRandomNum6();
    setRandomNum7();
    setRandomNum8();
    setRandomNum9();
    setRandomResultArray();
    setWinningMultiplierBasedOnSymbolRow1();
    setWinningMultiplierBasedOnSymbolRow2();
    setWinningMultiplierBasedOnSymbolRow3();
    setWinningMultiplierBasedOnSymbolRow1W2S();
    setWinningMultiplierBasedOnSymbolRow2W2S();
    setWinningMultiplierBasedOnSymbolRow3W2S();
    setWinningMultiplier();


}
    public int returnRandom ()
    {
        int randomNum = 0;
        float randomGenNum = (float) (Math.random() * 100);

        if (randomGenNum <= 12.5){randomNum = 1;}
        else if (randomGenNum > 12.5 && randomGenNum <= 25) {randomNum = 2;}
        else if (randomGenNum > 25 && randomGenNum <= 37.5) {randomNum = 3;}
        else if (randomGenNum > 37.5 && randomGenNum <= 50) {randomNum = 4;}
        else if (randomGenNum > 50 && randomGenNum <= 62.5) {randomNum = 5;}
        else if (randomGenNum > 62.5 && randomGenNum <= 75) {randomNum = 6;}
        else if (randomGenNum > 75 && randomGenNum <= 87.5) {randomNum = 7;}
        else if (randomGenNum > 87.5) {randomNum = 8;}

        return randomNum;
    }

    public void setRandomNum1() {randomNum1 = returnRandom();}

    public void setRandomNum2() {randomNum2 = returnRandom();}

    public void setRandomNum3() {randomNum3 = returnRandom();}

    public void setRandomNum4() {randomNum4 = returnRandom();}

    public void setRandomNum5() {randomNum5 = returnRandom();}

    public void setRandomNum6() {randomNum6 = returnRandom();}

    public void setRandomNum7() {randomNum7 = returnRandom();}

    public void setRandomNum8() {randomNum8 = returnRandom();}

    public void setRandomNum9() {randomNum9 = returnRandom();}

    public void setRandomResultArray()
    {
        randomResultArray = new int[]{randomNum1, randomNum2, randomNum3,randomNum4, randomNum5, randomNum6, randomNum7, randomNum8, randomNum9};
    }

    public int getRandomNum1() {return randomNum1;}

    public int getRandomNum2() {return randomNum2;}

    public int getRandomNum3() {return randomNum3;}

    public int getRandomNum4() {return randomNum4;}

    public int getRandomNum5() {return randomNum5;}

    public int getRandomNum6() {return randomNum6;}

    public int getRandomNum7() {return randomNum7;}

    public int getRandomNum8() {return randomNum8;}

    public int getRandomNum9() {return randomNum9;}

    public int[] getRandomResultArray() {return randomResultArray;}

    public void setWinningMultiplierBasedOnSymbolRow1()
    {
        if (randomNum1 == 1){winningMultiplierBasedOnSymbolRow1 = 9;}
        else if (randomNum1 == 2){winningMultiplierBasedOnSymbolRow1 = 12;}
        else if (randomNum1 == 3){winningMultiplierBasedOnSymbolRow1 = 12;}
        else if (randomNum1 == 4){winningMultiplierBasedOnSymbolRow1 = 15;}
        else if (randomNum1 == 5){winningMultiplierBasedOnSymbolRow1 = 15;}
        else if (randomNum1 == 6){winningMultiplierBasedOnSymbolRow1 = 18;}
        else if (randomNum1 == 7){winningMultiplierBasedOnSymbolRow1 = 24;}
        else if (randomNum1 == 8){winningMultiplierBasedOnSymbolRow1 = 30;}
    }
    public void setWinningMultiplierBasedOnSymbolRow2()
    {
        if (randomNum2 == 1){winningMultiplierBasedOnSymbolRow2 = 9;}
        else if (randomNum4 == 2){winningMultiplierBasedOnSymbolRow2 = 12;}
        else if (randomNum4 == 3){winningMultiplierBasedOnSymbolRow2 = 12;}
        else if (randomNum4 == 4){winningMultiplierBasedOnSymbolRow2 = 15;}
        else if (randomNum4 == 5){winningMultiplierBasedOnSymbolRow2 = 15;}
        else if (randomNum4 == 6){winningMultiplierBasedOnSymbolRow2 = 18;}
        else if (randomNum4 == 7){winningMultiplierBasedOnSymbolRow2 = 24;}
        else if (randomNum4 == 8){winningMultiplierBasedOnSymbolRow2 = 30;}
    }
    public void setWinningMultiplierBasedOnSymbolRow3()
    {
        if (randomNum3 == 1){winningMultiplierBasedOnSymbolRow3= 9;}
        else if (randomNum7 == 2){winningMultiplierBasedOnSymbolRow3 = 12;}
        else if (randomNum7 == 3){winningMultiplierBasedOnSymbolRow3 = 12;}
        else if (randomNum7 == 4){winningMultiplierBasedOnSymbolRow3 = 15;}
        else if (randomNum7 == 5){winningMultiplierBasedOnSymbolRow3 = 15;}
        else if (randomNum7 == 6){winningMultiplierBasedOnSymbolRow3 = 18;}
        else if (randomNum7 == 7){winningMultiplierBasedOnSymbolRow3 = 24;}
        else if (randomNum7 == 8){winningMultiplierBasedOnSymbolRow3 = 30;}
    }
    public void setWinningMultiplierBasedOnSymbolRow1W2S()
    {
        winningMultiplierBasedOnSymbolRow1W2S = winningMultiplierBasedOnSymbolRow1 * (1/6);
    }

    public void setWinningMultiplierBasedOnSymbolRow2W2S()
    {
        winningMultiplierBasedOnSymbolRow2W2S = winningMultiplierBasedOnSymbolRow2 * (1/6);
    }

    public void setWinningMultiplierBasedOnSymbolRow3W2S()
    {
        winningMultiplierBasedOnSymbolRow3W2S = winningMultiplierBasedOnSymbolRow3 * (1/6);
    }

    public void setWinningMultiplier ()
    {
    if (randomNum1 == randomNum2 && randomNum1 == randomNum3)   /* ROW 1 =*/
    {
        winningMultiplier = winningMultiplierBasedOnSymbolRow1;
    }
    else if (randomNum4 == randomNum5 && randomNum4 == randomNum6) /* ROW 2 =*/
    {
        winningMultiplier = winningMultiplierBasedOnSymbolRow2;
    }
    else if (randomNum7 == randomNum8 && randomNum7 == randomNum9) /* ROW 3 =*/
    {
        winningMultiplier = winningMultiplierBasedOnSymbolRow3;
    }
    else if (randomNum1 == randomNum2 && randomNum1 == randomNum3 && randomNum4 == randomNum5 && randomNum4 == randomNum6) /* ROW 1 = AND ROW 2 = */
    {
        winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2;
    }
    else if (randomNum1 == randomNum2 && randomNum1 == randomNum3 && randomNum7 == randomNum8 && randomNum7 == randomNum9) /* ROW 1 = AND ROW 3 = */
    {
     winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow3;
    }
    else if (randomNum4 == randomNum5 && randomNum4 == randomNum6 && randomNum7 == randomNum8 && randomNum7 == randomNum9) /* ROW 2 = AND ROW 3 = */
    {
        winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3;
    }
    else if (randomNum1 == randomNum2 && randomNum1 == randomNum3 && randomNum4 == randomNum5 && randomNum4 == randomNum6 && randomNum7 == randomNum8 && randomNum7 == randomNum9) /* ROW 1 = ROW 2 = ROW 3 = */
    {
        winningMultiplier = winningMultiplierBasedOnSymbolRow1 *winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3;
    }
    

























    }

    public int getWinningMultiplier()
    {
        return winningMultiplier;
    }

}

