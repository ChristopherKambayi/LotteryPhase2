package lottery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Christopher Kambayi
 * Date: 25/10/2016
 * LotteryApp.java
 */

import javax.swing.JOptionPane;

public class LotteryApp 
{
    public static void main(String [] args)
    { 
        int [] myNums = new int [5];
        
        Lottery myLotto = new Lottery();
        
        JOptionPane.showMessageDialog(null, "Welcome to the Lottery");
        JOptionPane.showMessageDialog(null, "Enter numbers between 1 and 40");
        
        for(int i = 0; i < myNums.length; i++)
        {
            myNums[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number " + (i + 1)));
        }
        
        myLotto.runLotto();
        
        String runType = JOptionPane.showInputDialog(null, "Lotto, Plus1 or Plus2: ");
        
        myLotto.verify(myNums, runType);
        
        myLotto.printResults();        
    }
}