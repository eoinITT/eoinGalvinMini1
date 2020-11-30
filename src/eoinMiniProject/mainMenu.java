package eoinMiniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class mainMenu
{
    private JFrame mainFrame;
    private JPanel mainPanel;
    private double balance = 500;



    public mainMenu()
    {

    }

    public void displayMainMenu()
    {
        createMainFrame();
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
        addMainButtons();

    }
    public void createMainFrame()
    {
        mainFrame = new JFrame();
        mainFrame.setTitle("Main Menu");
        mainFrame.setVisible(true);
        mainFrame.setSize(400,400);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
    }

    public void addMainButtons()
    {

        JButton BankButton = new JButton("Bank");
        BankButton.setSize(100,30);
        BankButton.setLocation(0,0);
        BankButton.setBackground(new Color(59,89,182));

        BankButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mainFrame.dispose();
                bankMenu b1 = new bankMenu();
                b1.displayBankMenu();
            }
        });
        mainPanel.add(BankButton);

        JButton playButton = new JButton("Play");
        playButton.setSize(100,30);
        playButton.setLocation(130,0);
        playButton.setBackground(new Color(59,89,182));
        playButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameMenu g1 = new gameMenu();

                try
                {
                    g1.displayGameFrame();
                } catch (IOException ioException)
                {
                    ioException.printStackTrace();
                }
                mainFrame.dispose();


            }
        });
        mainPanel.add(playButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setSize(100,30);
        exitButton.setLocation(260,0);
        exitButton.setBackground(new Color(59,89,182));
        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        mainPanel.add(exitButton);

        JLabel mainBalance = new JLabel("Your balance is " + balance);
        mainBalance.setVisible(true);

        mainPanel.add(mainBalance);
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalanceAfterGameMenu ()
    {
        gameMenu g1 = new gameMenu();
        this.balance =  g1.getGameMenuBalance();

    }
    public void setBalanceAfterBank()
    {
        bankMenu b1 = new bankMenu();
        balance = b1.getBankMenuBalance();
    }
}
