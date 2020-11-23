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
            b1.displayBankMenu();
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
            gameMenu g1 = new gameMenu();
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
