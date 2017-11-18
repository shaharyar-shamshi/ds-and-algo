/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubsequence;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Longestsubsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        String f=in.next();
        String sec=in.next();
        Stack s=new Stack();
        int[][]dp=new int[sec.length()+1][f.length()+1];
        int max=0;
        
        for(int i=0;i<sec.length()+1;i++)
        {
            for(int j=0;j<f.length()+1;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    if(f.charAt(j-1)==sec.charAt(i-1))
                    {
                        dp[i][j]=dp[i-1][j-1]+1;
                        if(dp[i][j]>max)
                        {
                            s.push(f.charAt(j-1));
                            max++;
                        }
                       
                    }
                    else
                    {
                        int a=dp[i-1][j];
                        int b=dp[i][j-1];
                        if(a>b)
                            dp[i][j]=a;
                        else
                            dp[i][j]=b;
                    }
                }
                        
            }
        }
        System.out.println(dp[sec.length()][f.length()]);
        while(!s.isEmpty())
        {
            System.out.print(s.pop());
        }
        
            
    }
    
}
