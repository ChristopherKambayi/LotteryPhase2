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
        int [] myNumbs = new int [5];
        String type;
        
        Draw [] myDraw = new Draw [3];
        
        for(int i = 0; i < 3; i++)
        {
            myDraw[i] = new Draw();
        }
        
        myDraw[0].setDrawType("lotto");
        myDraw[1].setDrawType("plus1");
        myDraw[2].setDrawType("plus2");
        
        myDraw[0].generate();
        myDraw[1].generate();
        myDraw[2].generate();
        
        for(int i = 0; i < myNumbs.length; i++)
        {
            myNumbs[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number " + (i + 1)));
            
            type = JOptionPane.showInputDialog(null, "Lotto, Plus1 or Plus2?");
        }
        
        myDraw[0].compute(myNumbs);
        myDraw[1].compute(myNumbs);
        myDraw[2].compute(myNumbs);
        
        myDraw[0].printResults();
        myDraw[1].printResults();
        myDraw[2].printResults();
        
        int [] temp = myDraw[0].getLotto();
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print(temp[i] + " ");
        }
        int [] temp1 = myDraw[1].getLotto();
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print(temp1[i] + " ");
        }
        int [] temp2 = myDraw[2].getLotto();
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print(temp2[i] + " ");
        }
        
    }
}
