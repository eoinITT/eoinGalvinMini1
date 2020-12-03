package eoinMiniProject;
import java.io.*;



public class runSlotMachine
{


    public static void main(String[] args) throws Exception
    {
        mainMenu m1 = new mainMenu();

        m1.balanceFileExistsCheck();
        m1.displayMainMenu();
    }
}