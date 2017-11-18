/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct4;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Oct4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        for(int h=0;h<test;h++)
        {
        String s=in.next();
        char [] c=new char[s.length()];
        int ac=in.nextInt();
        int bc=in.nextInt();
        int asum=0;
        int bsum=0;
        for(int i=0;i<s.length();i++)
        {
            c[i]=s.charAt(i);
            if(s.charAt(i)=='a')
                asum++;
            else
                bsum++;
        }
        
        if(asum>bsum)
        {
            while(asum!=0)
                    
            {
                for(int i=0;i<ac;i++)
                {
                    if(asum!=0)
                    {
                    System.out.print("a");
                    asum--;
                    }
                    else
                        i=ac;
                }
                
                if(bsum!=0)
                {
                   for(int i=0;i<bc;i++)
                   {
                       if(bsum!=0)
                       {
                           System.out.print("b");
                           bsum--;
                       }
                       else
                           i=bc;
                   }
                }
                else if(asum!=0)
                    System.out.print("*");
            }
        }
        else if(bsum>asum)
        {
             while(bsum!=0)
                    
            {
                for(int i=0;i<bc;i++)
                {
                    if(bsum!=0)
                    {
                    System.out.print("b");
                    bsum--;
                    }
                    else
                        i=bc;
                }
                
                if(asum!=0)
                {
                   for(int i=0;i<ac;i++)
                   {
                       if(asum!=0)
                       {
                           System.out.print("a");
                           asum--;
                       }
                       else
                           i=ac;
                   }
                }
                else if(bsum!=0)
                    System.out.print("*");
            }
        }
        else
        {
            for(int i=0;i<s.length();i++)
                if(i%2==0)
                    System.out.print("a");
            else
                    System.out.print("b");
        }
        System.out.println();
    }
        
    }
    
}
