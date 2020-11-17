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
    private int winningMultiplierBasedOnSymbolrow1;
    private int winningMultiplierBasedOnSymbolrow2;
    private int winningMultiplierBasedOnSymbolrow3;
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
    setWinningMultiplierBasedOnSymbolrow1();
    setWinningMultiplierBasedOnSymbolrow2();
    setWinningMultiplierBasedOnSymbolrow3();
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
        randomResultArray = new int[]{randomNum1, randomNum2, randomNum3, randomNum4, randomNum5, randomNum6, randomNum7, randomNum8, randomNum9};
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

    public void setWinningMultiplierBasedOnSymbolrow1()
    {
        if (randomNum1 == 1){winningMultiplierBasedOnSymbolrow3 = 9;}
        else if (randomNum1 == 2){winningMultiplierBasedOnSymbolrow1 = 12;}
        else if (randomNum1 == 3){winningMultiplierBasedOnSymbolrow1 = 12;}
        else if (randomNum1 == 4){winningMultiplierBasedOnSymbolrow1 = 15;}
        else if (randomNum1 == 5){winningMultiplierBasedOnSymbolrow1 = 15;}
        else if (randomNum1 == 6){winningMultiplierBasedOnSymbolrow1 = 18;}
        else if (randomNum1 == 7){winningMultiplierBasedOnSymbolrow1 = 24;}
        else if (randomNum1 == 8){winningMultiplierBasedOnSymbolrow1 = 30;}
    }
    public void setWinningMultiplierBasedOnSymbolrow2()
    {
        if (randomNum2 == 1){winningMultiplierBasedOnSymbolrow2 = 9;}
        else if (randomNum2 == 2){winningMultiplierBasedOnSymbolrow2 = 12;}
        else if (randomNum2 == 3){winningMultiplierBasedOnSymbolrow2 = 12;}
        else if (randomNum2 == 4){winningMultiplierBasedOnSymbolrow2 = 15;}
        else if (randomNum2 == 5){winningMultiplierBasedOnSymbolrow2 = 15;}
        else if (randomNum2 == 6){winningMultiplierBasedOnSymbolrow2 = 18;}
        else if (randomNum2 == 7){winningMultiplierBasedOnSymbolrow2 = 24;}
        else if (randomNum3 == 8){winningMultiplierBasedOnSymbolrow2 = 30;}
    }
    public void setWinningMultiplierBasedOnSymbolrow3()
    {
        if (randomNum3 == 1){winningMultiplierBasedOnSymbolrow3= 9;}
        else if (randomNum3 == 2){winningMultiplierBasedOnSymbolrow3 = 12;}
        else if (randomNum3 == 3){winningMultiplierBasedOnSymbolrow3 = 12;}
        else if (randomNum3 == 4){winningMultiplierBasedOnSymbolrow3 = 15;}
        else if (randomNum3 == 5){winningMultiplierBasedOnSymbolrow3 = 15;}
        else if (randomNum3 == 6){winningMultiplierBasedOnSymbolrow3 = 18;}
        else if (randomNum3 == 7){winningMultiplierBasedOnSymbolrow3 = 24;}
        else if (randomNum3 == 8){winningMultiplierBasedOnSymbolrow3 = 30;}
    }

    public void setWinningMultiplier ()
    {
    if (randomNum1 == randomNum4 && randomNum1 == randomNum7)   /* ROW 1 =*/
    {
        winningMultiplier = winningMultiplierBasedOnSymbolrow1;
    }
    else if (randomNum2 == randomNum5 && randomNum2 == randomNum8) /* ROW 2 =*/
    {
        winningMultiplier = winningMultiplierBasedOnSymbolrow2;
    }
    else if (randomNum3 == randomNum6 && randomNum3 == randomNum9) /* ROW 3 =*/
    {
        winningMultiplier = winningMultiplierBasedOnSymbolrow3;
    }
    else if (randomNum1 == randomNum4 && randomNum1 == randomNum7 && randomNum2 == randomNum5 && randomNum2 == randomNum8) /* ROW 1 = AND ROW 2 = */

    {
        winningMultiplier = winningMultiplierBasedOnSymbolrow1 * winningMultiplierBasedOnSymbolrow2;
    }
    else if (randomNum1 == randomNum4 && randomNum1 == randomNum7 && randomNum3 == randomNum6 && randomNum3 == randomNum9) /* ROW 1 = AND ROW 3 = */
    {
     winningMultiplier = winningMultiplierBasedOnSymbolrow1 * winningMultiplierBasedOnSymbolrow3;
    }
    else if (randomNum2 == randomNum5 && randomNum2 == randomNum8 && randomNum3 == randomNum6 && randomNum3 == randomNum9) /* ROW 2 = AND ROW 3 = */
    {
        winningMultiplier = winningMultiplierBasedOnSymbolrow2 * winningMultiplierBasedOnSymbolrow3;
    }
    else if (randomNum1 == randomNum4 && randomNum1 == randomNum7 && randomNum2 == randomNum5 && randomNum2 == randomNum8 && randomNum3 == randomNum6 && randomNum3 == randomNum9) /* ROW 1 = ROW 2 = ROW 3 = */
    {
        winningMultiplier = winningMultiplierBasedOnSymbolrow1 *winningMultiplierBasedOnSymbolrow2 * winningMultiplierBasedOnSymbolrow3;
    }
    }

    public int getWinningMultiplier()
    {
        return winningMultiplier;
    }

}

