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

public class Lottery 
{
    //Declaring variables
    private Draw [] lotto;
    private int lottery, plus1, plus2;

    //Default constructor
    public Lottery()
    {
        this.lotto = new Draw[3];
        this.lottery = 0;
        this.plus1 = 0;
        this.plus2 = 0;
    }

    //Method to generate random numbers in each object in arrays of objects
    public void generates()
    {
        for(int i = 0; i < 3; i++)
        {

           
           
           
           /* if(i == 0)
            {
                lotto[i].setDrawType("lotto");
            }
            else if (i == 1)
            {
                lotto[i].setDrawType("plus1");
            }
            else if(i == 2)
            {
                lotto[i].setDrawType("plus2");
            }*/
        }
    }
    
    //Method to compare played numbers arrays to array of objects
    public void drawLotto(int [] numbers, String type)
    {
        int []  temp = lotto[0].getLotto();
        
        
        for(int k = 0; k < 3; k++)
        {
            int [] temp2 = lotto[k].getLotto();
            
            for(int i = 0; i < numbers.length; i++)
            {
                for(int j = 0; j < temp.length; j++)
                {
                    if(numbers[i] == temp2[j])
                    {
                        if(j == 0)
                        {
                            lottery = lottery + 1;
                        }
                        else if(j == 1)
                        {
                            plus1 = plus1 + 1;
                        }
                        else if(j == 2)
                        {
                            plus2 = plus2 + 1;
                        }
                    }      
                }
            }
        }
    }

    //Getter
    public Draw[] getLotto() 
    {
        return lotto;
    }
    
    //Print results
    public void printResults()
    {
        System.out.println(lottery);
        System.out.println(plus1);
        System.out.println(plus2);
    }
}