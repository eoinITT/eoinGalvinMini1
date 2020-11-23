package eoinMiniProject;

import javax.swing.*;
import java.util.Arrays;


public class gameMenu
{
    private double betAmount;
    private String betAmountAsString;
    private double betWin;

    public gameMenu()
    {
        setBetAmount();
        printBetAmount();
        spinSlot(betAmount);

    }

    public void setBetAmount()
    {
        betAmountAsString = JOptionPane.showInputDialog("Enter the amount you wish to bet: ");
        betAmount = Double.parseDouble(betAmountAsString);
    }
    public void printBetAmount()
    {
        System.out.println("The bet amount is " + betAmount);
    }

    public void spinSlot(double betAmount)
    {
        slotMath s1 = new slotMath();
        bankMenu b = new bankMenu();

        betWin = betAmount * s1.getWinningMultiplier();


        if (s1.getWinningMultiplier() > 0)
        {
            System.out.println(
                    "The numbers displayed in order: \n"
                            + Arrays.toString(s1.getRow1()) + "\n"
                            + Arrays.toString(s1.getRow2()) + "\n"
                            + Arrays.toString(s1.getRow3()) + "\n"
                            + Arrays.toString(s1.getRow4()) + "\n"
                            + Arrays.toString(s1.getRow5())
            );

            System.out.println("The winning multiplier is " + s1.getWinningMultiplier());
           b.updateBalanceAfterWin(betAmount, s1.getWinningMultiplier());
           System.out.println("You have won:" +betWin);
            System.out.println("Your new balance is " +b.getBalance());

        }
        else
            {
            System.out.println("YOU LOSE");
            b.updateBalanceAfterBet(betAmount);
            System.out.println("Your new balance is " +b.getBalance());

            }

    }




}

