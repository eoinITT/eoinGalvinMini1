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
    private double balance = 1000;



    public mainMenu()
    {
        setBalance(balance);
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
        mainPanel.setBackground(Color.darkGray);
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
                b1.setBankMenuBalance(balance);
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
                mainFrame.dispose();
                gameMenu g1 = new gameMenu();
                g1.setGameMenuBalance(balance);


                    g1.displayGameFrame();




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
        mainBalance.setForeground(Color.white);
        mainBalance.setVisible(true);

        mainPanel.add(mainBalance);
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalanceAfterGameMenu (double gameMenuBalance)
    {
        balance = gameMenuBalance;
    }
    public void setBalanceAfterBank(double bankMenuBalance)
    {
        balance = bankMenuBalance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}
