/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Bfs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter No. of vertex");
        graph g=new graph(in.nextInt());
        System.out.println("enter no. of edges");
        int edge=in.nextInt();
        for(int i=0;i<edge;i++)
        {
            int u=in.nextInt();
            int v=in.nextInt();
            g.addedge(u, v);
            
        }
        int start=in.nextInt();
        int end=in.nextInt();
        g.bfs(end,start);
    }
    
    
}
class graph
{
    Scanner in=new Scanner(System.in);
    LinkedList<Integer> [] a;
   int  []visited;
   int [] parent;
    public graph(int v)
    {
   a =new LinkedList[v];
   for(int i=0;i<v;i++)
       a[i]=new LinkedList<Integer>();
   visited=new int[v];
   parent=new int[v];
   
   
    }
    
    public void addedge(int u,int v)
    {
        
        a[u].push(v);
    }
    public void bfs(int v,int end)
    {
        System.out.println("answer");
        Queue q=new LinkedList();
        parent[v]=v;
        q.add(v);
        while(!q.isEmpty())
        {
            
            int s=(int)q.remove();
            visited[s]=1;
            
            
           Iterator it=a[s].iterator();
           while(it.hasNext())
           {
               int query=(int)it.next();
               if(visited[query]==0)
               {
                   q.add(query);
                   visited[query]=1;
                   parent[query]=s;
               }
           }
                
        }
         int total=0;
         
       while(parent[end]!=end)
       {
           total++;
           end=parent[end];
       }
       System.out.println(total);
        
    }
    
    
}