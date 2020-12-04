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
    private int[] fullRows;
    private int[] randomNumsForWinningMultipliers;



    private double winningMultiplierBasedOnSymbolRow1;
    private double winningMultiplierBasedOnSymbolRow2;
    private double winningMultiplierBasedOnSymbolRow3;
    private double winningMultiplierBasedOnSymbolRow4;
    private double winningMultiplierBasedOnSymbolRow5;
    private double winningMultiplier;
    private double[] arrayWinningMultipliers;

/*
    0 - 12.5 = 1 (banana) 3 in a row = 9x multiplier of bet
    12.5 - 25 = 2 (BAR) 3 in a row = 12x multiplier of bet
    25 - 37.5 = 3 (Cherry) 3 in a row = 12x multiplier of bet
    37.5 - 50 = 4 (Grape) 3 in a row = 15x multiplier of bet
    50 - 62.5 = 5 (Lemon) 3 in a row = 15x multiplier of bet
    62.5 - 75 = 6 (watermelon) 3 in a row = 18x multiplier of bet
    75 - 87.5 = 7 (orange) 3 in a row = 24x multiplier of bet
    87.5 - 100 = 8 (seven) 3 in a row = 30x multiplier of bet

    */

public slotMath ()
{
    setFullRows();
}
    public void callSetters()
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
        setArrayWinningMultipliers();
        setRandomNumsForWinningMultipliers();
        setFullRows();
        setWinningMultiplierBasedOnSymbolAndRow();
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

    public void setFullRows()
    {
        fullRows = new int[]{randomNum1,randomNum2,randomNum3,randomNum4,randomNum5,randomNum6,randomNum7,randomNum8,randomNum9,randomNum10,randomNum11,randomNum12,randomNum13,randomNum14,randomNum15};
    }
    public void setArrayWinningMultipliers()
    {
        arrayWinningMultipliers = new double[]{winningMultiplierBasedOnSymbolRow1,winningMultiplierBasedOnSymbolRow2,winningMultiplierBasedOnSymbolRow3,winningMultiplierBasedOnSymbolRow4,winningMultiplierBasedOnSymbolRow5};
    }

    public void setRandomNumsForWinningMultipliers()
    {
        randomNumsForWinningMultipliers = new int[]{randomNum1,randomNum4,randomNum7,randomNum10,randomNum13};
    }

    public void setWinningMultiplierBasedOnSymbolAndRow()
    {
        for (int i=0;i<=4;i++) {
            if (randomNumsForWinningMultipliers[i] == 1)
            {
                arrayWinningMultipliers[i] = 9;
            }
            else if (randomNumsForWinningMultipliers[i] == 2)
            {
                arrayWinningMultipliers[i] = 12;
            }
            else if (randomNumsForWinningMultipliers[i] == 3)
            {
                arrayWinningMultipliers[i] = 12;
            }
            else if (randomNumsForWinningMultipliers[i] == 4)
            {
                arrayWinningMultipliers[i] = 15;
            }
            else if (randomNumsForWinningMultipliers[i] == 5)
            {
                arrayWinningMultipliers[i] = 15;
            }
            else if (randomNumsForWinningMultipliers[i] == 6)
            {
                arrayWinningMultipliers[i] = 18;
            }
            else if (randomNumsForWinningMultipliers[i] == 7)
            {
                arrayWinningMultipliers[i] = 24;
            }
            else if (randomNumsForWinningMultipliers[i] == 8)
            {
                arrayWinningMultipliers[i] = 30;
            }
        }
            winningMultiplierBasedOnSymbolRow1 = arrayWinningMultipliers[0];
            winningMultiplierBasedOnSymbolRow2 = arrayWinningMultipliers[1];
            winningMultiplierBasedOnSymbolRow3 = arrayWinningMultipliers[2];
            winningMultiplierBasedOnSymbolRow4 = arrayWinningMultipliers[3];
            winningMultiplierBasedOnSymbolRow5 = arrayWinningMultipliers[4];

    }

    public static boolean checkArrayEquals (int[] selectedrow)
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
       /*
       1 ROW WINS
        */

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

        /*
        2 ROW WINS
         */

        if (checkArrayEquals(row1) && checkArrayEquals(row2))
        {
         winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row3))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow3;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row4))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row2) && checkArrayEquals(row3))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3;
        }
        if (checkArrayEquals(row2) && checkArrayEquals(row4))
        {
          winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row2) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row3) && checkArrayEquals(row4))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row3) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow5;
        }
        if( checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }
        /*
        3 ROW WINS
         */

        if (checkArrayEquals(row1) && checkArrayEquals(row2) && checkArrayEquals(row3))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row2) && checkArrayEquals(row4))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row2) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row3) && checkArrayEquals(row4))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row3) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row2) && checkArrayEquals(row3) && checkArrayEquals(row4))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row2) && checkArrayEquals(row3) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row2) && checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row3) && checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }

        /*
        4 ROW WINS
         */

        if (checkArrayEquals(row1) && checkArrayEquals(row2) && checkArrayEquals(row3) && checkArrayEquals(row4))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row2) && checkArrayEquals(row3) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row2) && checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row1) && checkArrayEquals(row3) && checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }
        if (checkArrayEquals(row2) && checkArrayEquals(row3) && checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }
        /*
        5 ROW WIN
         */
        if (checkArrayEquals(row1) && checkArrayEquals(row2) && checkArrayEquals(row3) && checkArrayEquals(row4) && checkArrayEquals(row5))
        {
            winningMultiplier = winningMultiplierBasedOnSymbolRow1 * winningMultiplierBasedOnSymbolRow2 * winningMultiplierBasedOnSymbolRow3 * winningMultiplierBasedOnSymbolRow4 * winningMultiplierBasedOnSymbolRow5;
        }
        if(!checkArrayEquals(row1) && !checkArrayEquals(row2) && !checkArrayEquals(row3) && !checkArrayEquals(row4) && !checkArrayEquals(row5))
        {
            winningMultiplier = 0;
        }
    }


    public double getWinningMultiplier()
    {
        return winningMultiplier;
    }

    public int getFullRows(int i)
    {
        return fullRows[i];
    }
}

