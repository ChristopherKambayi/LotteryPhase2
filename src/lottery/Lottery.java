/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

/**
 * @author Christopher Kambayi
 * Date: 11/10/2016
 * Lottery.java
 */

public class Lottery extends Draw
{
    //Declaring variables
    private final Draw [] lotto = new Draw[3];
    private int lineOne, lineTwo, lineThree, printNum;

    //Overloaded constructor
    public Lottery()
    {        
        this.lotto[0] = new Draw();
        this.lotto[0].setDrawType("lotto");
        
        this.lotto[1] = new Draw();
        this.lotto[1].setDrawType("plus1");
                
        this.lotto[2] = new Draw(); 
        this.lotto[2].setDrawType("plus2");
        
        this.lineOne = 0;
        this.lineTwo = 0;
        this.lineThree = 0;
    }
    
    public void runLotto()
    {
        for(int i = 0; i < lotto.length; i++)
        {
            lotto[i].generate();
        }
    }
    
    public void verify(int [] num, String typ)
    {
        int numRun = 0;
        
        if(typ.equalsIgnoreCase("lotto"))
        {
            numRun = 1;
            this.printNum = 0;
        }
        if(typ.equalsIgnoreCase("plus1"))
        {
            numRun = 2;
            this.printNum = 1;
        }
        if(typ.equalsIgnoreCase("plus2"))
        {
            numRun = 3;
            this.printNum = 2;
        }
        
        for(int i = 0; i < numRun; i++)
        {
            int []  temp = lotto[i].getLotto();
            String type = lotto[i].getDrawType();
            
            for(int j = 0; j < 5; j++)
            {
                for(int k = 0; k < 5; k++)
                {
                    if((num[j] == temp[k]) && (type.equalsIgnoreCase("lotto")))
                    {
                        lineOne = lineOne + 1;
                    }
                    if((num[j] == temp[k]) && (type.equalsIgnoreCase("plus1")))
                    {
                        lineTwo = lineTwo + 1;
                    }
                    if((num[j] == temp[k]) && (type.equalsIgnoreCase("plus2")))
                    {
                        lineThree = lineThree + 1;
                    }
                }
            }
        }
    }
    
    public void printResults()
    {
        if(printNum <= 2)
        {
            System.out.println("Lotto results " + lineOne);
        }
        
        if(printNum >= 1)
        {
            System.out.println("Lotto Plus 1 results " + lineTwo);
        }
        
        if(printNum == 2)
        System.out.println("Lotto Plus 2 results " + lineThree);
        
    }
}