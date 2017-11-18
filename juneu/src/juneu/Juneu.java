/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juneu;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Juneu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int b=0;b<t;b++)
        {
        int n=in.nextInt();
        int k=in.nextInt();
        int[][] check=new int[n][k];
        for(int i=0;i<n;i++)
        {
            int x=in.nextInt();
            for(int j=0;j<x;j++)
                check[i][in.nextInt()-1]=1;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int number=0;
            int count=0;
            int []visited=new int[n];
            int store[]=new int[n];
            int g=0;
            for(int j=0;j<k;j++)
            {
                if(check[i][j]==0 && count==0)
                {
                    count++;
                    for(int h=0;h<n;h++)
                        if(check[h][j]==1)
                        {
                            visited[h]=1;
                            store[g]=h;
                            g++;
                        }
                            
                }
                else if(check[i][j]==0 && count!=0)
                {
                    int f=0;
                    while(store[f]!=0)
                    {
                        if(check[store[f]][j]==0)
                            visited[store[f]]=0;
                            
                            f++;
                    }
                }
                else 
                {
                   number++;
                }
            }
            if(number!=k)
            {
            for(int h=0;h<n;h++)
                if(visited[h]==1)
                    sum++;
            }
            else
            {
                sum=sum+n-1;
            }
                    
        }
        System.out.println(sum/2);
    }
        }
    }
    

