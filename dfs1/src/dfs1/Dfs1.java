/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs1;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Dfs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        graph g=new graph(5);
        g.add(1, 0);
        g.add(0, 2);
        g.add(2, 1);
        g.add(0, 3);
        g.add(1, 4);
        g.dfs(0);
    }
    
}
class graph
{
    int vertex;
    LinkedList [] a;
    int [] visited;
    public graph(int v)
    {
         visited=new int[v];
        a=new LinkedList[v];
        for(int i=0;i<v;i++)
            a[i]=new LinkedList();
    }
    public void add(int u,int v)
    {
        a[u].add(v);
    }
    public void dfs(int init)
    {
        Stack s=new Stack();
        s.push(init);
        visited[init]=1;
        
        while(!s.empty())
        {
            int k=(int)s.pop();
           System.out.println(k +" ");
        
            for(int i=0;i<a[k].size();i++)
            {
                if(visited[(int)a[k].get(i)]==0)
                {
                    s.push(a[k].get(i));
                    
                    visited[(int)a[k].get(i)]=1;
                }
           
            }
        }
        
        
    }
    
}