/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histo;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Histo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n!=0)
        {
       
       int []a=new int[n];
       for(int i=0;i<n;i++)
           a[i]=in.nextInt();
       Stack s=new Stack();
       int area=-1;
       int i;
       for( i=0;i<n;i++)
       {
           if(s.empty())
               s.push(i);
           else 
           {
           while(!s.empty() && a[(int)s.peek()]>a[i])
           {
               int top=(int)s.pop();
               if(s.empty())
               {
                   if(a[top]*(i)>area)
                       area=a[top]*(i);
               }
               else
                   if(a[top]*(i-(int)s.peek()-1)>area)
                       area=a[top]*(i-(int)s.peek()-1);
               
                   
           }
           s.push(i);
               }
       }
       int top=0;
       while(!s.empty())
       {
          top=a[(int)s.pop()];
       }
       if(top*n>area)
           area=n*top;
       System.out.println(area);
       n=in.nextInt();
           
        }
    }
    
}
