/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestnearest;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Smallestnearest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Stack s=new Stack();
        for(int i=0;i<n;i++)
        {
            
            
                while(!s.empty() && (int)s.peek()>=a[i])
                    s.pop();
                 if(!s.empty() && (int)s.peek()<a[i])
                
                
                    System.out.println(s.peek());
                 else
                     System.out.println("-");
                
                s.push(a[i]);
                
                
            
        }
    }
    
}
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