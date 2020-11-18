package eoinMiniProject;

import java.util.Arrays;

public class slotMathTest {
    public static void main(String[] args) {

    slotMath s1 = new slotMath();
    gameHistory g1 = new gameHistory();

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

        System.out.println("DETAILS OF THE GAME " +
                            "\nDate of game: " +g1.getDate() +
                            "\nTime of game: " +g1.getTime() +
                            "\nBalance of user: " +g1.getBalance() +
                            "\nBet of game: " + g1.getBet() );
    }
    else System.out.println("YOU LOSE");





    }
}