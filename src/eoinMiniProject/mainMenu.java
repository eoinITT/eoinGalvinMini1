package eoinMiniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class mainMenu
{
    private JFrame mainFrame;
    private JPanel mainPanel;
    private double balance;
    File outFile = new File("file.data");
    File inFile = new File("file.data");


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

        mainFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(mainFrame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
                {

                    try {
                        balanceToFile(balance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });
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
                try {
                    balanceToFile(balance);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                System.exit(0);
            }
        });
        mainPanel.add(exitButton);

        JLabel mainBalance = new JLabel("Your balance is " + balance);
        mainBalance.setForeground(Color.white);
        mainBalance.setVisible(true);

        mainPanel.add(mainBalance);

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

    public void balanceToFile(double balance) throws Exception
    {

        FileOutputStream outStream = new FileOutputStream(outFile);

        DataOutputStream dataOutStream = new DataOutputStream(outStream);

        dataOutStream.writeDouble(balance);
    }
    public void setBalanceFromFile() throws Exception
    {

        FileInputStream inputStream = new FileInputStream(inFile);
        DataInputStream dataInStream = new DataInputStream(inputStream);

        if (inFile.exists())
        {
            balance = dataInStream.readDouble();

            inputStream.close();

            setBalance(balance);
        }
    }
    public void balanceFileExistsCheck()
    {
        if(inFile.exists())
        {
            try {
                setBalanceFromFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



}

