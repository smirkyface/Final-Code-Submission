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

import java.awt.event.*;

public class ButtonListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand();
        if(actionCommand.equals("Dashboard"))
            new Course();  
  
        if(actionCommand.equals("MATH 2090"))
            new Course("Math 2090");        
        else if(actionCommand.equals("LOGOUT"))
            return;
        else if(actionCommand.equals("HNRS 2020"))
            new Course("HNRS 2020");
        else if(actionCommand.equals("PHYS 2113"))
            new Course("PHYS 2113");
        else if(actionCommand.equals("HIST 1202"))
            new Course("HIST 1202");
        
    }
    
}
