package eoinMiniProject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;


public class gameMenu extends JPanel
{
    private double betAmount = 5;
    private double gameMenuBalance;
    private JFrame gameFrame;
    private JPanel gamePanel;
    BufferedImage imageBanana;



    public gameMenu()
    {

    }

    public void setGameMenuBalance(double balance) {

        gameMenuBalance = balance;

    }


    public void displayGameFrame() throws IOException {
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
                try {
                    displayGameFrame();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
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
                try {
                    displayGameFrame();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
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
                try {
                    displayGameFrame();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
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
                try {
                    displayGameFrame();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
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
                try {
                    displayGameFrame();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spinSlot(betAmount);
                gameFrame.dispose();
                gamePanel.removeAll();
                gamePanel.revalidate();
                gamePanel.repaint(); /* https://stackoverflow.com/questions/38349445/how-to-delete-all-components-in-a-jpanel-dynamically/38350395 */
                try {
                    displayGameFrame();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
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

    public void setBetAmount(double betAmount) {
        this.betAmount = betAmount;
    }

    public double getGameMenuBalance() {
        return gameMenuBalance;
    }

    public double getBetAmount() {
        return betAmount;
    }

}