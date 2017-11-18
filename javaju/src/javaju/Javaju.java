/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaju;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Javaju {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int [][] a=new int[n][k];
        for(int i=0;i<n;i++)
        {
           int x=in.nextInt();
           for(int j=0;j<x;j++)
           {
               a[i][j]=in.nextInt();
           }
        }
        for(int i=0;i<n;i++)
        {
          int visited[]=new int[k];
          int j=0;
          while(a[i][j]!=0)
          {
              visited[a[i][j]-1]=1;
              j++;
          }
          int [] nv=new int[k-j];
         System.out.println("answer");
         int w=0;
      
        for(int f=0;f<k;f++)
        {
            if(visited[f]==0)
            {
                int h=0;
                j=0;
                while(a[j][h]!=0)
                {
                    if
                }
            }
                
        }
             
         
        
                 
        
        }
    }
    
}
