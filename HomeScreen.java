/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphaschool;

/**
 * @author Erik Thompson
 * @author Kachi Mbamalu
 * @author Jonathan Ruiz
 * @author Matthew Davis
 */

import javax.swing.*;
import java.awt.*;

public class HomeScreen extends JFrame
{
    
    private final int WINDOW_WIDTH = 700;
    private final int WINDOW_HEIGHT = 500;
    
    public HomeScreen()
    {
        setTitle("Home");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,3));

        JButton homeButton1 = new JButton("Dashboard");
        JButton logoutButton = new JButton("LOGOUT");
        
        JLabel label1 = new JLabel("COURSES");
        JLabel blankLabel = new JLabel("");
        JLabel label2 = new JLabel("CSCI 3380");
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        
        panel1.add(label1);
        panel2.add(blankLabel);
        panel3.add(logoutButton);
        panel4.add(homeButton1);
        
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        homeButton1.addActionListener(new ButtonListener());
        logoutButton.addActionListener(new ButtonListener());
        

        setVisible(true);
    }
}
