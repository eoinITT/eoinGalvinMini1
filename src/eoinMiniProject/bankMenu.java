package eoinMiniProject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bankMenu {
    private JFrame frame;
    private JPanel panel1;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton backButton;
    private String depositAmountAsString;
    private int depositAmount;
    private String withdrawAmountAsString;
    private int withdrawAmount;
    private double balance;

    public bankMenu()
    {
        createFrame();
        frame.add(panel1);
        frame.setVisible(true);
        createWithdrawFrame();
        addButtons();
        addWithdrawButtons();
    }

    public void createFrame()
    {
        frame = new JFrame();
            frame.setTitle("Bank Menu");
            frame.setVisible(true);
            frame.setSize(400,400);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            panel1 = new JPanel();
            panel1.setBackground(Color.cyan);
    }
    public void createWithdrawFrame()
    {
        frame = new JFrame();
        frame.setTitle("Withdraw Menu");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setBackground(Color.red);

    }
    public void addButtons()
    {
        depositButton = new JButton("Deposit");
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
                    balance = balance + depositAmount;
                }

            }
        });
        panel1.add(depositButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.setSize(100,30);
        withdrawButton.setLocation(130,0);
        withdrawButton.setBackground(Color.red);
        withdrawButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
        panel1.add(withdrawButton);

        backButton = new JButton("Return");
        backButton.setSize(100,30);
        backButton.setLocation(260,0);
        backButton.setBackground(Color.white);
        backButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /* RETURN TO THE BANK MENU MAIN */
            }
        });
        panel1.add(backButton);
    }

    public void addWithdrawButtons()
    {
      JLabel balanceLabel = new JLabel("Balance:");


    }













}

