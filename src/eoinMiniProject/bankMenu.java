package eoinMiniProject;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class bankMenu
{
    private JFrame bankFrame;
    private JPanel bankPanel;
    private String depositAmountAsString;
    private int depositAmount;
    private String withdrawAmountAsString;
    private int withdrawAmount;
    private double bankMenuBalance;

    public bankMenu()
    {

    }

    public void updateBalanceAfterDeposit(double depositAmount)
    {
        bankMenuBalance = bankMenuBalance + depositAmount;
    }
    public void updateBalanceAfterWithdrawal(double withdrawAmount)
    {
        bankMenuBalance = bankMenuBalance - withdrawAmount;
    }

    public void setBankMenuBalance(double balance)
    {
        bankMenuBalance = balance;
    }


    public void createBankFrame()
    {
        bankFrame = new JFrame();
        bankFrame.setTitle("Bank Menu");
        bankFrame.setVisible(true);
        bankFrame.setSize(400,400);
        bankFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        bankPanel = new JPanel();
        bankPanel.setBackground(Color.darkGray);
    }



    public void displayBankMenu()
    {
        createBankFrame();
        bankFrame.add(bankPanel);
        bankFrame.setVisible(true);
        addBankButtons();
    }

    public double getBankMenuBalance()
    {
        return bankMenuBalance;
    }

    public void addBankButtons()
    {
        JButton depositButton = new JButton("Deposit");
        depositButton.setSize(100,30);
        depositButton.setLocation(0,0);
        depositButton.setBackground(Color.green);

        depositButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                while (depositAmount <= 0 || depositAmount > 1000)
                {
                    depositAmountAsString = JOptionPane.showInputDialog("Enter the amount you wish to deposit: ");
                    depositAmount = Integer.parseInt(depositAmountAsString);


                    if (depositAmount > 1000) {
                        JOptionPane.showMessageDialog(null, "You cannot deposit more than 1000 Euro");

                    }
                    if (depositAmount < 0) {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number");
                    }

                    else {
                        JOptionPane.showMessageDialog(null, "You have deposited " + depositAmountAsString + " Euros");
                        updateBalanceAfterDeposit(Double.parseDouble(depositAmountAsString));
                        bankFrame.dispose();
                        displayBankMenu();
                    }
                }
                mainMenu m1 = new mainMenu();
                m1.setBalanceAfterBank(bankMenuBalance);
            }
        });
        bankPanel.add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setSize(100,30);
        withdrawButton.setLocation(130,0);
        withdrawButton.setBackground(Color.red);
        withdrawButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                withdrawAmountAsString = JOptionPane.showInputDialog("Enter the amount you wish to Withdraw: ");
                withdrawAmount = Integer.parseInt(withdrawAmountAsString);


                if (withdrawAmount > bankMenuBalance) {
                    JOptionPane.showMessageDialog(null, "You cannot withdraw more than " + bankMenuBalance);
                }

                if (withdrawAmount > 0 && withdrawAmount <= bankMenuBalance)
                {
                    JOptionPane.showMessageDialog(null, "You have withdrawn " + withdrawAmountAsString + " Euros");
                    updateBalanceAfterWithdrawal(Double.parseDouble(withdrawAmountAsString));
                    bankFrame.dispose();
                    displayBankMenu();
                }
                mainMenu m1 = new mainMenu();
                m1.setBalanceAfterBank(bankMenuBalance);
            }
        });
        bankPanel.add(withdrawButton);

        JButton backButton = new JButton("Return");
        backButton.setSize(100,30);
        backButton.setLocation(260,0);
        backButton.setBackground(Color.white);
        backButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bankFrame.dispose();
                mainMenu m1 = new mainMenu();
                m1.setBalanceAfterBank(bankMenuBalance);
                m1.displayMainMenu();

            }
        });
        bankPanel.add(backButton);

        JLabel bankBalance = new JLabel("your current balance is " +bankMenuBalance);
        bankBalance.setVisible(true);
        bankBalance.setForeground(Color.white);
        bankPanel.add(bankBalance);
    }
}

