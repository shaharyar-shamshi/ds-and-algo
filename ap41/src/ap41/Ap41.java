/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap41;

import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;
import java.lang.Comparable;
import java.util.Comparator;

/**
 *
 * @author shaharyar
 */
public class Ap41  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int y=0;y<t;y++)
        {
        int n=in.nextInt();
        int k=in.nextInt();
        int x=in.nextInt();
        int m=in.nextInt();
        int s=in.nextInt();
        int [][]graph=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                graph[i][j]=0;
        }
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
                if(i==j)
                    graph[i][j]=0;
                else
                {
                   graph[i][j]=x;
                   graph[j][i]=x;
                }
        }
        for(int i=0;i<m;i++)
        {
            int start=in.nextInt();
            int end=in.nextInt();
            int f=in.nextInt();
            graph[start-1][end-1]=f;
            graph[end-1][start-1]=f;
        }
        Ap41 gr=new Ap41();
        gr.Dijkstra(graph, s, n);
        
        
        }
    }
    public void Dijkstra(int g[][],int s,int vertex)
    {
        int v,w;
       
       int [] distance= new int[vertex];
         Boolean visited[]=new Boolean[vertex];
        for(int i=0;i<vertex;i++)
        {
            distance[i]=-1;
            visited[i]=false;
            
        }
        int min=Integer.MAX_VALUE;
        distance[s-1]=0;
       
       
        
  
        
        for(int y=0;y<vertex;y++)
                
        {
             v=0;
             for(int i=0;i<vertex;i++ )
             {
                 if(min>distance[i] && visited[i]==false)
                 {
                     min=distance[i];
                     v=i;
                 }
                 
             }
             visited[v]=true;
             
            for(int i=0;i<vertex;i++)
            {
                if(g[v][i]!=0)
                {
                    if(distance[i]==-1)
                    {
                        distance[i]=g[v][i];
                    }    
                     else if(distance[i]>distance[v]+g[v][i] && visited[i]==false )
                    {
                        distance[i]=distance[v]+g[v][i];
                    }
                }
            }
        }
        for(int i=0;i<vertex;i++)
            System.out.println(distance[i]);
    }

   
    
    
}

