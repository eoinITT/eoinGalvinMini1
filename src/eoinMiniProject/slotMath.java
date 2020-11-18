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
    private int randomNum10;
    private int randomNum11;
    private int randomNum12;
    private int randomNum13;
    private int randomNum14;
    private int randomNum15;
    private int[] row1;
    private int[] row2;
    private int[] row3;
    private int[] row4;
    private int[] row5;


    private double winningMultiplierBasedOnSymbolRow1;
    private double winningMultiplierBasedOnSymbolRow2;
    private double winningMultiplierBasedOnSymbolRow3;
    private double winningMultiplierBasedOnSymbolRow4;
    private double winningMultiplierBasedOnSymbolRow5;
    private double winningMultiplier;

/*
    0 - 12.5 = 1 (apple) 3 in a row = 9x multiplier of bet
    12.5 - 25 = 2 (grape) 3 in a row = 12x multiplier of bet
    25 - 37.5 = 3 (lemon) 3 in a row = 12x multiplier of bet
    37.5 - 50 = 4 (cherry) 3 in a row = 15x multiplier of bet
    50 - 62.5 = 5 (banana) 3 in a row = 15x multiplier of bet
    62.5 - 75 = 6 (watermelon) 3 in a row = 18x multiplier of bet
    75 - 87.5 = 7 (orange) 3 in a row = 24x multiplier of bet
    87.5 - 100 = 8 (BAR) 3 in a row = 30x multiplier of bet

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
    setRandomNum10();
    setRandomNum11();
    setRandomNum12();
    setRandomNum13();
    setRandomNum14();
    setRandomNum15();
    setRow1();
    setRow2();
    setRow3();
    setRow4();
    setRow5();
    setWinningMultiplierBasedOnSymbolRow1();
    setWinningMultiplierBasedOnSymbolRow2();
    setWinningMultiplierBasedOnSymbolRow3();
    setWinningMultiplierBasedOnSymbolRow4();
    setWinningMultiplierBasedOnSymbolRow5();
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

    public void setRandomNum10() {randomNum10 = returnRandom();}

    public void setRandomNum11() {randomNum11 = returnRandom();}

    public void setRandomNum12() {randomNum12 = returnRandom();}

    public void setRandomNum13() {randomNum13 = returnRandom();}

    public void setRandomNum14() {randomNum14 = returnRandom();}

    public void setRandomNum15() {randomNum15 = returnRandom();}

    public void setRow1()
    {
       row1 = new int[] {randomNum1,randomNum2,randomNum3};
    }

    public void setRow2()
    {
        row2 = new int[] {randomNum4,randomNum5,randomNum6};
    }

    public void setRow3()
    {
        row3 = new int[] {randomNum7,randomNum8,randomNum9};
    }

    public void setRow4()
    {
        row4 = new int[] {randomNum10,randomNum11,randomNum12};
    }

    public void setRow5()
    {
        row5 = new int[] {randomNum13,randomNum14,randomNum15};
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

    public int getRandomNum10() {return randomNum1;}

    public int getRandomNum11() {return randomNum2;}

    public int getRandomNum12() {return randomNum3;}

    public int getRandomNum13() {return randomNum4;}

    public int getRandomNum14() {return randomNum5;}

    public int getRandomNum15() {return randomNum6;}

    public int[] getRow1() { return row1;}

    public int[] getRow2() {return row2;}

    public int[] getRow3() {return row3;}

    public int[] getRow4() {return row4;}

    public int[] getRow5() {return row5;}

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
             if (randomNum4 == 1){winningMultiplierBasedOnSymbolRow2 = 9;}
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
             if (randomNum7 == 1){winningMultiplierBasedOnSymbolRow3 = 9;}
        else if (randomNum7 == 2){winningMultiplierBasedOnSymbolRow3 = 12;}
        else if (randomNum7 == 3){winningMultiplierBasedOnSymbolRow3 = 12;}
        else if (randomNum7 == 4){winningMultiplierBasedOnSymbolRow3 = 15;}
        else if (randomNum7 == 5){winningMultiplierBasedOnSymbolRow3 = 15;}
        else if (randomNum7 == 6){winningMultiplierBasedOnSymbolRow3 = 18;}
        else if (randomNum7 == 7){winningMultiplierBasedOnSymbolRow3 = 24;}
        else if (randomNum7 == 8){winningMultiplierBasedOnSymbolRow3 = 30;}
    }
    public void setWinningMultiplierBasedOnSymbolRow4()
    {
             if (randomNum10 == 1){winningMultiplierBasedOnSymbolRow4 = 9;}
        else if (randomNum10 == 2){winningMultiplierBasedOnSymbolRow4 = 12;}
        else if (randomNum10 == 3){winningMultiplierBasedOnSymbolRow4 = 12;}
        else if (randomNum10 == 4){winningMultiplierBasedOnSymbolRow4 = 15;}
        else if (randomNum10 == 5){winningMultiplierBasedOnSymbolRow4 = 15;}
        else if (randomNum10 == 6){winningMultiplierBasedOnSymbolRow4 = 18;}
        else if (randomNum10 == 7){winningMultiplierBasedOnSymbolRow4 = 24;}
        else if (randomNum10 == 8){winningMultiplierBasedOnSymbolRow4 = 30;}
    }
    public void setWinningMultiplierBasedOnSymbolRow5()
    {
             if (randomNum13 == 1){winningMultiplierBasedOnSymbolRow5 = 9;}
        else if (randomNum13 == 2){winningMultiplierBasedOnSymbolRow5 = 12;}
        else if (randomNum13 == 3){winningMultiplierBasedOnSymbolRow5 = 12;}
        else if (randomNum13 == 4){winningMultiplierBasedOnSymbolRow5 = 15;}
        else if (randomNum13 == 5){winningMultiplierBasedOnSymbolRow5 = 15;}
        else if (randomNum13 == 6){winningMultiplierBasedOnSymbolRow5 = 18;}
        else if (randomNum13 == 7){winningMultiplierBasedOnSymbolRow5 = 24;}
        else if (randomNum13 == 8){winningMultiplierBasedOnSymbolRow5 = 30;}
    }

    public static boolean checkArrayEquals (int[] selectedrow) /* DONT FORGET TO REFERENCE STACKOVERFLOW */
    {
        for(int i=1; i<selectedrow.length;i++)
        {
            if(selectedrow[0] != selectedrow[i])
            {
                return false;
            }
        }
                return true;
    }

    public void setWinningMultiplier ()
    {
        if (checkArrayEquals(row1)) {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1;
        }
        if (checkArrayEquals(row2)) {
            winningMultiplier = winningMultiplierBasedOnSymbolRow2;
        }
        if (checkArrayEquals(row3)) {
            winningMultiplier = winningMultiplierBasedOnSymbolRow3;
        }
        if (checkArrayEquals(row4)) {
            winningMultiplier = winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row5)) {
            winningMultiplier = winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row2))
        {
         //* start coding from here tommorow using if sheet */
        }
    }

    public double getWinningMultiplier()
    {
        return winningMultiplier;
    }

}

