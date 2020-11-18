package eoinMiniProject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;
import javax.swing.*;

public class gameHistory {
private LocalDate date;
private LocalTime time;
private double balance;
private double bet;


public gameHistory()
{
    setDate();
    setTime();
    setBalance();
    setBet();


}

    public LocalDate getDate() {return date;}
    public LocalTime getTime() {return time;}
    public double getBalance() {return balance;}
    public double getBet() {return bet;}

    public void setDate()
    {
        date = LocalDate.now();
    }

    public void setTime()
    {
        time = LocalTime.now();
    }

    public void setBalance() { /* need to work on here later */
        JFrame depositBox = new JFrame("Deposit Here");

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(100,100,140,40);

        JLabel depositAsk = new JLabel();
        depositAsk.setBounds(10,10,100,100);
        JTextField depositAmount = new JTextField();
        depositAmount.setBounds(100, 50, 150, 30);


        depositBox.add(depositButton);
        depositBox.add(depositAsk);
        depositBox.add(depositAmount);
        depositBox.setSize(300,300);
        depositBox.setBackground(Color.white);
        depositBox.setVisible(true);
        depositBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balance = Double.parseDouble(depositAmount.getText()); /* https://stackoverflow.com/questions/20318748/read-in-double-from-java-jtextfield */

            }
        });

    }

    public void setBet() {
        this.bet = bet;
    }
}
