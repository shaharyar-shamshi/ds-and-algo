/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacr1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Hacr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int f=0;f<t;f++)
        {
            long n=0l;
            long edge=0l;
            long cl=0l;
            long cr=0l;
            
         n=in.nextLong();
         edge=in.nextLong();
        cl=in.nextLong();
         cr=in.nextLong();
        long []visited=new long[(int)n];
        long[][] m=new long[(int)n][(int)n];
        for(long i=0l;i<edge;i++)
        {
           
            int x=in.nextInt();
            int y=in.nextInt();
            m[x-1][y-1]=1;
            m[y-1][x-1]=1;
            
        }
       Stack q=new Stack();
       
       int lib=0;
       int c=0;
       long k=0l;
       int road=0;
       if(cl*n>cr*(n-1))
       {
       while(c!=n)
       {
           for(int i=0;i<n;i++)
           {
                
               if(visited[i]==0)
               {
                   q.push(i);
                   c++;
                 //  k--;
                   lib++;
                   break;
               }
               else
                   k++;
           }
       while(!q.isEmpty())
       {
          
           visited[(int)q.peek()]=1;
           int v1=(int)q.pop();
           
           for(int i=0;i<n;i++)
           {
               
               
               if(m[v1][i]==1 && visited[i]==0)
               {
                   q.push(i);
                   c++;
                  // k++;
               break;
               }
           }
       }
    }
       System.out.println("answer");
      if(k==0)
          k=n-1;
      System.out.println(cl*lib+cr*k);
    }
       else
           System.out.println(cl*n);
    
    } 
    
}
}
