package eoinMiniProject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;



public class gameMenu extends javax.swing.JFrame
{
    private double betAmount = 5;
    private double gameMenuBalance;
    private JFrame gameFrame;
    private JPanel gamePanel;
    JLabel label1 = new JLabel("Label1");
    JLabel label2 = new JLabel("Label2");
    JLabel label3 = new JLabel("Label3");
    JLabel label4 = new JLabel("Label4");
    JLabel label5 = new JLabel("Label5");
    JLabel label6 = new JLabel("Label6");
    JLabel label7 = new JLabel("Label7");
    JLabel label8 = new JLabel("Label8");
    JLabel label9 = new JLabel("Label9");
    JLabel label10 = new JLabel("Label10");
    JLabel label11 = new JLabel("Label11");
    JLabel label12 = new JLabel("Label12");
    JLabel label13 = new JLabel("Label13");
    JLabel label14 = new JLabel("Label14");
    JLabel label15 = new JLabel("Label15");

    private JLabel[] labels;

    ImageIcon imageBanana = new ImageIcon("imageBanana.png");
    ImageIcon imageBar = new ImageIcon("imageBAR.png");

    public void setLabels()
    {
        labels = new JLabel[]{label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15};
    }

    public gameMenu()
    {
        setLabels();
    }

    public void setGameMenuBalance(double balance) {

        gameMenuBalance = balance;

    }


    public void displayGameFrame()
    {
        createGameFrame();
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
        addGameFrameButtons();


    }

    public void createGameFrame() {
        gameFrame = new JFrame();
        gameFrame.setTitle("Game Menu");
        gameFrame.setSize(1280, 720);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gamePanel = new JPanel(null);
        gamePanel.setBackground(Color.WHITE);

    }

    public void addGameFrameButtons() {

        JButton playButton = new JButton();
        try {
            Image img = ImageIO.read(getClass().getResource("spinButton.png"));
            playButton.setIcon(new ImageIcon(img));
            playButton.setBorder(null);
        } catch (Exception ex) {
            System.out.println("failed to add image to button");
        }
        playButton.setBounds(850, 540, 205, 144);

        gamePanel.add(playButton);


        JButton spin5 = new JButton("$5 Spin");
        JButton spin10 = new JButton("$10 Spin");
        JButton spin25 = new JButton("$25 Spin");
        JButton spin50 = new JButton("$50 Spin");
        JButton spin100 = new JButton("$100 Spin");

        spin5.setSize(100, 50);
        spin10.setSize(100, 50);
        spin25.setSize(100, 50);
        spin50.setSize(100, 50);
        spin100.setSize(100, 50);

        spin5.setLocation(100, 575);
        spin10.setLocation(250, 575);
        spin25.setLocation(400, 575);
        spin50.setLocation(550, 575);
        spin100.setLocation(700, 575);

        spin5.setBackground(new Color(59, 89, 182));
        spin10.setBackground(new Color(59, 89, 182));
        spin25.setBackground(new Color(59, 89, 182));
        spin50.setBackground(new Color(59, 89, 182));
        spin100.setBackground(new Color(59, 89, 182));

        spin5.setFont(new Font("Tahoma", Font.BOLD, 12));
        spin10.setFont(new Font("Tahoma", Font.BOLD, 12));
        spin25.setFont(new Font("Tahoma", Font.BOLD, 12));
        spin50.setFont(new Font("Tahoma", Font.BOLD, 12));
        spin100.setFont(new Font("Tahoma", Font.BOLD, 12));

        spin5.setForeground(Color.white);
        spin10.setForeground(Color.white);
        spin25.setForeground(Color.white);
        spin50.setForeground(Color.white);
        spin100.setForeground(Color.white);

        spin5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(5);
                gameFrame.dispose();
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();
                displayGameFrame();

            }
        });

        spin10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(10);
                gameFrame.dispose();
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();
                displayGameFrame();

            }
        });

        spin25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(25);
                gameFrame.dispose();
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();

                    displayGameFrame();

            }
        });

        spin50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(50);
                gameFrame.dispose();
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();

                    displayGameFrame();

            }
        });

        spin100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(100);
                gameFrame.dispose();
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();
                displayGameFrame();

            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spinSlot(betAmount);
                gameFrame.dispose();
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();  /* https://stackoverflow.com/questions/38349445/how-to-delete-all-components-in-a-jpanel-dynamically/38350395 */

                    displayGameFrame();

            }
        });

        gamePanel.add(spin5);
        gamePanel.add(spin10);
        gamePanel.add(spin25);
        gamePanel.add(spin50);
        gamePanel.add(spin100);


        JLabel currentBet = new JLabel("Your current bet is: " + betAmount);
        currentBet.setVisible(true);
        currentBet.setBounds(1075, 580, 200, 50);


        gamePanel.add(currentBet);

        JButton returnToMain = new JButton("Return");
        returnToMain.setVisible(true);
        returnToMain.setSize(100, 50);
        returnToMain.setLocation(1164, 1);
        returnToMain.setBackground(new Color(59, 89, 182));
        returnToMain.setForeground(Color.white);
        returnToMain.setFont(new Font("Tahoma", Font.BOLD, 12));

        returnToMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameFrame.dispose();
                mainMenu m1 = new mainMenu();
                m1.setBalanceAfterGameMenu(gameMenuBalance);
                m1.displayMainMenu();


            }
        });

        gamePanel.add(returnToMain);

        JLabel currentBalance = new JLabel("Your current balance is: " + gameMenuBalance);
        currentBalance.setVisible(true);
        currentBalance.setBounds(100, 625, 200, 50);


        gamePanel.add(currentBalance);

        JLabel insufficientFundsLabel = new JLabel("You have insufficient funds to place this bet.");
        insufficientFundsLabel.setVisible(true);
        insufficientFundsLabel.setBounds(400, 625, 400, 50);


        if (betAmount > gameMenuBalance) {
            gamePanel.add(insufficientFundsLabel);
        }

        slotMath s1 = new slotMath();


        label1.setBounds(500, 20, 80, 80);
        label2.setBounds(600, 20, 80, 80);
        label3.setBounds(700, 20, 80, 80);
        label4.setBounds(500, 120, 80, 80);
        label5.setBounds(600, 120, 80, 80);
        label6.setBounds(700, 120, 80, 80);
        label7.setBounds(500, 220, 80, 80);
        label8.setBounds(600, 220, 80, 80);
        label9.setBounds(700, 220, 80, 80);
        label10.setBounds(500, 320, 80, 80);
        label11.setBounds(600, 320, 80, 80);
        label12.setBounds(700, 320, 80, 80);
        label13.setBounds(500, 420, 80, 80);
        label14.setBounds(600, 420, 80, 80);
        label15.setBounds(700, 420, 80, 80);



        for (int i = 0; i <= 14; i = i + 1)
        {
            if (s1.getFullRows(i) == 1)
            {
                labels[i].setIcon(new ImageIcon("imageBanana.png"));
            }
            else if (s1.getFullRows(i) == 2)
            {
                labels[i].setIcon(new ImageIcon("imageBAR.png"));
            }
            else if (s1.getFullRows(i) == 3)
            {
                labels[i].setIcon(new ImageIcon("imageCherry.png"));
            }
            else if (s1.getFullRows(i) == 4 )
            {
                labels[i].setIcon(new ImageIcon("imageGrape.png"));
            }
            else if (s1.getFullRows(i) == 5 )
            {
                labels[i].setIcon(new ImageIcon("imageLemon.png"));
            }
            else if (s1.getFullRows(i) == 6 )
            {
                labels[i].setIcon(new ImageIcon("imageMelon.png"));
            }
            else if (s1.getFullRows(i) == 7 )
            {
                labels[i].setIcon(new ImageIcon("imageOrange.png"));
            }
            else if (s1.getFullRows(i) == 8 )
            {
                labels[i].setIcon(new ImageIcon("imageSeven.png"));
            }

            gamePanel.add(label1);
            gamePanel.add(label2);
            gamePanel.add(label3);
            gamePanel.add(label4);
            gamePanel.add(label5);
            gamePanel.add(label6);
            gamePanel.add(label7);
            gamePanel.add(label8);
            gamePanel.add(label9);
            gamePanel.add(label10);
            gamePanel.add(label11);
            gamePanel.add(label12);
            gamePanel.add(label13);
            gamePanel.add(label14);
            gamePanel.add(label15);
        }
    }

    public void spinSlot(double betAmount) {
        slotMath s1 = new slotMath();

        double betWin = betAmount * s1.getWinningMultiplier();

        if (betAmount <= gameMenuBalance) {

            if (s1.getWinningMultiplier() > 0) {
                System.out.println(
                        "The numbers displayed in order: \n"
                                + Arrays.toString(s1.getRow1()) + "\n"
                                + Arrays.toString(s1.getRow2()) + "\n"
                                + Arrays.toString(s1.getRow3()) + "\n"
                                + Arrays.toString(s1.getRow4()) + "\n"
                                + Arrays.toString(s1.getRow5())
                );


                System.out.println("The winning multiplier is " + s1.getWinningMultiplier());
                gameMenuBalance = gameMenuBalance - betAmount;
                gameMenuBalance = gameMenuBalance + (betAmount * s1.getWinningMultiplier());
                System.out.println("You have won:" + betWin);

            } else {
                System.out.println("YOU LOSE");
                gameMenuBalance = gameMenuBalance - betAmount;
            }
            System.out.println("Your new balance is " + gameMenuBalance);
        } else {
            System.out.println("You do not have enough funds to make this bet. Please lower your bet. Your balance is :" + gameMenuBalance);
        }
        if (gameMenuBalance <= 0) {
            System.out.println("You cannot place a bet with no money. Please Deposit. Your balance is " + gameMenuBalance);
        }



    }

    public void setBetAmount(double betAmount)
    {
        this.betAmount = betAmount;
    }

    public double getGameMenuBalance()
    {
        return gameMenuBalance;
    }

    public double getBetAmount()
    {
        return betAmount;
    }

}