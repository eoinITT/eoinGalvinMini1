package eoinMiniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class mainMenu
{
    private JFrame mainFrame;
    private JPanel mainPanel;




public mainMenu()
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
    BankButton.setBackground(Color.green);

    BankButton.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            mainFrame.dispose();
            bankMenu b1 = new bankMenu();
        }
    });
    mainPanel.add(BankButton);

    JButton playButton = new JButton("Play");
    playButton.setSize(100,30);
    playButton.setLocation(130,0);
    playButton.setBackground(Color.red);
    playButton.addActionListener(new ActionListener()
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            slotMath s1 = new slotMath();

            if (s1.getWinningMultiplier() > 0)
            {
                System.out.println(
                        "The numbers displayed in order: \n"
                                + Arrays.toString(s1.getRow1()) + "\n"
                                + Arrays.toString(s1.getRow2()) + "\n"
                                + Arrays.toString(s1.getRow3()) + "\n"
                                + Arrays.toString(s1.getRow4()) + "\n"
                                + Arrays.toString(s1.getRow5())
                );

                System.out.println("The winning multiplier is " + s1.getWinningMultiplier());


            }
            else System.out.println("YOU LOSE");

        }
    });
    mainPanel.add(playButton);

    JButton exitButton = new JButton("Exit");
    exitButton.setSize(100,30);
    exitButton.setLocation(260,0);
    exitButton.setBackground(Color.white);
    exitButton.addActionListener(new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    });
    mainPanel.add(exitButton);
}



}
