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

public class Course extends JFrame
{
    private final int WINDOW_WIDTH = 700;
    private final int WINDOW_HEIGHT = 700;
    
    public Course()
    {
        setTitle("Home");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,3));

        JButton courseButton1 = new JButton("PHYS 2113");
        JButton courseButton2 = new JButton("HNRS 2020");
        JButton courseButton3 = new JButton("MATH 2090");
        JButton courseButton4 = new JButton("HIST 1202");
        JButton calendarButton = new JButton("CALENDAR");
        JButton menuButton1 = new JButton("View Assignments");
        JButton menuButton2 = new JButton("Create Group Project");
        JButton menuButton3 = new JButton("View Instructor Announcements");
        JButton logoutButton = new JButton("LOGOUT");
        
        JLabel label1 = new JLabel("COURSES");
        JLabel blankLabel = new JLabel("");
        JLabel label2 = new JLabel("CSCI 3380");
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        
        panel1.add(label1);
        panel2.add(blankLabel);
        panel3.add(logoutButton);
        panel4.add(courseButton1);
        panel4.add(courseButton2);
        panel4.add(courseButton3);
        panel4.add(courseButton4);
        panel5.add(blankLabel);
        panel6.add(calendarButton);
        
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);

        courseButton1.addActionListener(new ButtonListener());
        courseButton2.addActionListener(new ButtonListener());
        courseButton3.addActionListener(new ButtonListener());

        setVisible(true);
    }
    public Course(String txt)
    {
        setTitle(txt);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,3));

        JButton courseButton1 = new JButton("PHYS 2113");
        JButton courseButton2 = new JButton("HNRS 2020");
        JButton courseButton3 = new JButton("MATH 2090");
        JButton courseButton4 = new JButton("HIST 1202");
        JButton calendarButton = new JButton("CALENDAR");
        JButton menuButton1 = new JButton("View Assignments");
        JButton menuButton2 = new JButton("Create Group Project");
        JButton menuButton3 = new JButton("View Instructor Announcements");
        JButton logoutButton = new JButton("LOGOUT");
        
        JLabel label1 = new JLabel("COURSES");
        JLabel blankLabel = new JLabel("");
        JLabel label2 = new JLabel(txt);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        
        panel1.add(label1);
        panel2.add(blankLabel);
        panel3.add(logoutButton);
        panel4.add(courseButton1);
        panel4.add(courseButton2);
        panel4.add(courseButton3);
        panel4.add(courseButton4);
        panel5.add(label2);
        panel5.add(menuButton1);
        panel5.add(menuButton2);
        panel5.add(menuButton3);
        panel6.add(calendarButton);
        
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);

        courseButton1.addActionListener(new ButtonListener());
        courseButton2.addActionListener(new ButtonListener());
        courseButton3.addActionListener(new ButtonListener());
        courseButton4.addActionListener(new ButtonListener());
        logoutButton.addActionListener(new ButtonListener());

        setVisible(true);
    }
    
    
}
