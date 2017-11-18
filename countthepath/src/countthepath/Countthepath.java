/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countthepath;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Countthepath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        for(int j=0;j<test;j++)
        {
        int vertex=in.nextInt();
        graph g=new graph(vertex);
        int edge=in.nextInt();
        for(int i=0;i<edge;i++)
        {
            g.add(in.nextInt(), in.nextInt());
        }
        g.bfs(0);
        int st=in.nextInt();
        int en=in.nextInt();
        g.tra(en, st);
    }
    }
    
}
class graph
{
    LinkedList [] a;
    int [] visited;
    int [] parent;
    public graph(int v)
    {
        a=new LinkedList[v];
        for(int i=0;i<v;i++)
            a[i]=new LinkedList();
        visited=new int[v];
        parent=new int[v];
    }
    public void add(int u,int v)
    {
        a[u].add(v);
       // a[v].add(u);
    }
    public void bfs(int u)
    {
        int total=0;
        Queue q=new LinkedList();
        q.add(u);
        parent[u]=u;
        visited[u]=1;
        while(!q.isEmpty())
        {
            int s=(int)q.remove();
            for(int i=0;i<a[s].size();i++)
            {
                if(visited[(int)a[s].get(i)]==0)
                {
                q.add(a[s].get(i));
                parent[(int)a[s].get(i)]=s;
                visited[(int)a[s].get(i)]=1;
                }
                
            }
        }
       
    }
    public void tra(int u,int v)
    {
        int total=0;
         while(parent[v]!=v)
                {
                    v=parent[v];
                    total++;
                }
        System.out.println(total);
    }
}