/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

/**
 * @author Christopher Kambayi
 * Date: 24/10/2016
 * Draw.java
 */

public class Draw 
{
    //Declaring variables
    private int [] lotto;
    private String drawType;
    private int correct;
    
    //Default constructors
    public Draw()
    {
        lotto = new int[5];
        drawType = "";
        correct = 0;
    }
    
    //Overloaded constructor
    public Draw(int [] nums, String type)
    {
        this.lotto = nums;
        this.drawType = type;    
        correct = 0;
    }

    //Setters
    public void setDrawType(String drawType) 
    {
        this.drawType = drawType;
    }
    
    //Method to generate 5 unique numbers between 1 and 40
    public void generate()
    {
        int temp;
        
        for(int i = 0; i < lotto.length; i++)
        {
            temp = 1 + (int)(Math.random() * 40);
            
            while(temp == lotto[0] || temp == lotto[1] || temp == lotto[2] || temp == lotto[3] || temp == lotto[4])
            {
                temp = 1 + (int)(Math.random() * 40);
            }
            
            lotto[i] = temp;
        }
    }
    
    //Compute method
    public void compute(int [] num)
    {
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(num[i] == lotto[j])
                {
                    correct = correct + 1;
                }
            }
        }
    }

    //Getters
    public int[] getLotto() 
    {
        return lotto;
    }

    public String getDrawType() 
    {
        return drawType;
    }
    
    //printing the result
    public void printResults()
    {
        System.out.println(drawType + " right" + correct);
    }
}