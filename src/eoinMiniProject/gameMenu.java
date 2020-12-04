package eoinMiniProject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameMenu extends javax.swing.JFrame
{
    private double betAmount = 5;
    private double gameMenuBalance;
    private JFrame gameFrame;
    private JPanel gamePanel;
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel label7 = new JLabel();
    JLabel label8 = new JLabel();
    JLabel label9 = new JLabel();
    JLabel label10 = new JLabel();
    JLabel label11 = new JLabel();
    JLabel label12 = new JLabel();
    JLabel label13 = new JLabel();
    JLabel label14 = new JLabel();
    JLabel label15 = new JLabel();

    slotMath s1 = new slotMath();

    private JLabel[] labels;


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
    public void displayGameFrameNoFlash()
    {
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
        addGameFrameButtons();
    }

    public void createGameFrame() {
        gameFrame = new JFrame();
        gameFrame.setTitle("Game Menu");
        gameFrame.setSize(1280, 720);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setBackground(new Color(0,175,206));

        gamePanel = new JPanel(null);
        gamePanel.setBackground(new Color(0,175,206));

        gameFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(gameFrame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
                {

                    mainMenu m1 = new mainMenu();
                    try {
                        m1.balanceToFile(gameMenuBalance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });


    }

    public void spinSlot(double betAmount)
    {
        s1.callSetters();

        if (betAmount <= gameMenuBalance) {

            if (s1.getWinningMultiplier() > 0)
            {
                gameMenuBalance = gameMenuBalance - betAmount;
                gameMenuBalance = gameMenuBalance + (betAmount * s1.getWinningMultiplier());


            } else
                {

                gameMenuBalance = gameMenuBalance - betAmount;
            }

        }




    }

    public void setBetAmount(double betAmount)
    {
        this.betAmount = betAmount;
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

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spinSlot(betAmount);
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();  /* https://stackoverflow.com/questions/38349445/how-to-delete-all-components-in-a-jpanel-dynamically/38350395 */
                displayGameFrameNoFlash();

            }
        });

        gamePanel.add(playButton);


        JButton spin5 = new JButton("€5 Spin");
        JButton spin10 = new JButton("€10 Spin");
        JButton spin25 = new JButton("€25 Spin");
        JButton spin50 = new JButton("€50 Spin");
        JButton spin100 = new JButton("€100 Spin");

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

                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();
                displayGameFrameNoFlash();

            }
        });

        spin10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(10);
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();
                displayGameFrameNoFlash();

            }
        });

        spin25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(25);
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();
                displayGameFrameNoFlash();

            }
        });

        spin50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(50);
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();

                displayGameFrameNoFlash();

            }
        });

        spin100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBetAmount(100);
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint();
                displayGameFrameNoFlash();
            }
        });


        gamePanel.add(spin5);
        gamePanel.add(spin10);
        gamePanel.add(spin25);
        gamePanel.add(spin50);
        gamePanel.add(spin100);


        JLabel currentBet = new JLabel("Your current bet is: €" + betAmount);
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

        JLabel currentBalance = new JLabel("Your current balance is: €" + gameMenuBalance);
        currentBalance.setVisible(true);
        currentBalance.setBounds(100, 625, 200, 50);


        gamePanel.add(currentBalance);

        JLabel insufficientFundsLabel = new JLabel("You have insufficient funds to place this bet.");
        insufficientFundsLabel.setVisible(true);
        insufficientFundsLabel.setBounds(400, 625, 400, 50);


        if (betAmount > gameMenuBalance) {
            gamePanel.add(insufficientFundsLabel);
        }




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
            if (s1.getFullRows(i) == 1) {
                labels[i].setIcon(new ImageIcon("slotImages/imageBanana.png"));
            } else if (s1.getFullRows(i) == 2) {
                labels[i].setIcon(new ImageIcon("slotImages/imageBAR.png"));
            } else if (s1.getFullRows(i) == 3) {
                labels[i].setIcon(new ImageIcon("slotImages/imageCherry.png"));
            } else if (s1.getFullRows(i) == 4) {
                labels[i].setIcon(new ImageIcon("slotImages/imageGrape.png"));
            } else if (s1.getFullRows(i) == 5) {
                labels[i].setIcon(new ImageIcon("slotImages/imageLemon.png"));
            } else if (s1.getFullRows(i) == 6) {
                labels[i].setIcon(new ImageIcon("slotImages/imageMelon.png"));
            } else if (s1.getFullRows(i) == 7) {
                labels[i].setIcon(new ImageIcon("slotImages/imageOrange.png"));
            } else if (s1.getFullRows(i) == 8) {
                labels[i].setIcon(new ImageIcon("slotImages/imageSeven.png"));
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

            JLabel winLabelLeft = new JLabel();
            winLabelLeft.setBounds(200, 160, 200, 200);
            winLabelLeft.setIcon(new ImageIcon("slotImages/winImage.png"));

            JLabel winLabelRight = new JLabel();
            winLabelRight.setBounds(880, 160, 200, 200);
            winLabelRight.setIcon(new ImageIcon("slotImages/winImage.png"));

            gamePanel.add(winLabelLeft);
            gamePanel.add(winLabelRight);

            if (s1.getWinningMultiplier() > 1) {
                winLabelLeft.setVisible(true);
                winLabelRight.setVisible(true);
            } else {
                winLabelLeft.setVisible(false);
                winLabelRight.setVisible(false);
            }
        }
        Double winAmount = betAmount * s1.getWinningMultiplier();
        JLabel winAmountLabel = new JLabel("You have won €"+winAmount + " (Winning Multiplier " + s1.getWinningMultiplier() +"x)");
        winAmountLabel.setVisible(true);
        winAmountLabel.setBounds(400, 625, 400, 50);

        if(winAmount > 0) {
            gamePanel.add(winAmountLabel);
        }

    }

}