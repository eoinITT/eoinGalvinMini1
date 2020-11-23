package eoinMiniProject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bankMenu {
    private JFrame bankFrame;
    private JPanel bankPanel;
    private String depositAmountAsString;
    private int depositAmount;
    private String withdrawAmountAsString;
    private int withdrawAmount;
    private double balance;


    

    public bankMenu()
    {

    }
    public void displayBankMenu()
    {
        createBankFrame();
        bankFrame.add(bankPanel);
        bankFrame.setVisible(true);
        addBankButtons();
    }

    public void createBankFrame()
    {
        bankFrame = new JFrame();
        bankFrame.setTitle("Bank Menu");
        bankFrame.setVisible(true);
        bankFrame.setSize(400,400);
        bankFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        bankPanel = new JPanel();
        bankPanel.setBackground(Color.white);
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
                }
                if (depositAmount > 0 && depositAmount <= 1000)
                {
                    JOptionPane.showMessageDialog(null, "You have deposited " + depositAmountAsString + " Euros");
                    updateBalanceAfterDeposit(Double.parseDouble(depositAmountAsString));
                }


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
            public void actionPerformed(ActionEvent e) {

                while (withdrawAmount > 0 || withdrawAmount <= balance)
                {
                    withdrawAmountAsString = JOptionPane.showInputDialog("Enter the amount you wish to Withdraw: ");
                    withdrawAmount = Integer.parseInt(withdrawAmountAsString);


                    if (withdrawAmount > balance) {
                        JOptionPane.showMessageDialog(null, "You cannot withdraw more than " + balance);

                    }

                }

                if (withdrawAmount > 0 && withdrawAmount <= balance)
                {
                    JOptionPane.showMessageDialog(null, "You have withdrawn " + withdrawAmountAsString + " Euros");
                    updateBalanceAfterWithdrawal(Double.parseDouble(withdrawAmountAsString));
                }

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
            }
        });
        bankPanel.add(backButton);

    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }


    public void updateBalanceAfterBet(double betAmount)
    {
        balance = balance - betAmount;
    }
    public void updateBalanceAfterWin(double betAmount,double winningMultiplier)
    {
        balance = balance + (betAmount * winningMultiplier);
    }
    public void updateBalanceAfterDeposit(double depositAmount)
    {
        balance = balance + depositAmount;
    }
    public void updateBalanceAfterWithdrawal(double withdrawAmount)
    {
        balance = balance - withdrawAmount;
    }

    public double getBalance()
    {
        return balance;
    }
}

