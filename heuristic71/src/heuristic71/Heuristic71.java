/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristic71;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Heuristic71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int v=in.nextInt();
       int n=in.nextInt();
       int d[][]=new int[v][v];
       for(int i=0;i<n;i++)
       {
           int x=in.nextInt();
           int y=in.nextInt();
           d[x][y]=1;
           d[y][x]=1;
           
           
       }
       int dis[]=new int[v];
       int vis[]=new int[v];
       for(int i=0;i<v;i++)
       {
           dis[i]=Integer.MAX_VALUE;
           vis[i]=0;
       }
       dis[0]=0;
       for(int i=0;i<v;i++)
       {
           for(int j=0;j<v;j++)
           {
               if(d[i][j]!=0 && vis[j]==0 &&dis[j]>=dis[i]+d[i][j])
               {
                   
                   dis[j]=dis[i]+d[i][j];
                   vis[j]=1;
                   
               }
           }
       }
       for(int i=1;i<v;i++)
       {
           if(dis[i]!=Integer.MAX_VALUE )
           System.out.println(dis[i]);
           else
               System.out.println("-1");
       }
    }
    
    
}
