/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biconnected;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Biconnected {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        for(int j=0;j<test;j++)
        {
        int vertex=in.nextInt();
        int edge=in.nextInt();
        graph g=new graph(vertex);
        for(int i=0;i<edge;i++)
        {
            int u=in.nextInt();
            int v=in.nextInt();
            g.add(u, v);
            g.add(v, u);
        }
        int flag=0;
        int k=g.dfs(0);
       // System.out.println("answer");
       // System.out.println(k);
        if(k==vertex)
        {
            for(int i=1;i<vertex;i++)
            {
                 flag=g.dfsa(0,i);
                 if(flag!=(vertex-1))
                     i=vertex;
               //  System.out.println(flag);
                 
            }
        }
        if(k==vertex && flag==(vertex-1))
            System.out.println("1");
        else
            System.out.println("0");
        
    }
    }
    
}
class graph
{
    LinkedList [] a;
    int [] visited;
    
    public graph(int v)
    {
        a=new LinkedList[v];
        for(int i=0;i<v;i++)
            a[i]=new LinkedList();
        visited=new int[v];
    }
    public void add(int u,int v)
    {
        a[u].add(v);
        
    }
    public int dfs(int u)
    {
     Stack s=new Stack();
     visited[u]=1;
     s.push(u);
     int total=1;
     while(!s.empty())
     {
         int k=(int)s.pop();
         for(int i=0;i<a[k].size();i++)
             if(visited[(int)a[k].get(i)]==0)
             {
                 total++;
                 s.push((int)a[k].get(i));
                 visited[(int)a[k].get(i)]=1;
             }
                 
     }
     for(int i=0;i<visited.length;i++)
         visited[i]=0;
     return total;
    }
    public int dfsa(int u,int w)
    {
     Stack s=new Stack();
     s.push(u);
     visited[u]=1;
     int t=1;
     while(!s.empty())
     {
        // System.out.println("kk");
         int k=(int)s.pop();
         
        // System.out.println("lk");
         for(int i=0;i<a[k].size();i++)
         {
             //System.out.println("wks");
             if(visited[(int)a[k].get(i)]==0 && ((int)a[k].get(i))!=w)
             {
               //  System.out.println("hk");
                 t++;
                 s.push((int)a[k].get(i));
                 visited[(int)a[k].get(i)]=1;
             }
         }
         
     }
     for(int i=0;i<visited.length;i++)
         visited[i]=0;
     return t;
     
    }
}