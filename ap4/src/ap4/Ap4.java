/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap4;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Ap4 {

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
        
        Ap4 g=new Ap4();
        g.dij(graph,s-1,n);
        }
    }
    void dij(int [][]g,int s,int n)
    {
        int [] dis=new int[n];
        Boolean []visited=new Boolean[n];
        for(int i=0;i<n;i++)
        {
            dis[i]=Integer.MAX_VALUE;
            visited[i]=false;
        }
        dis[s]=0;
        int u=min(dis,visited);
        visited[u]=true;
        for(int i=0;i<n;i++)
        {
            if(!visited[i] && dis[u]!=Integer.MAX_VALUE && dis[i]>dis[u]+g[u][i] && g[u][i]!=0)
                dis[i]=dis[u]+g[u][i];
        }
        for(int i=0;i<n;i++)
            System.out.println(dis[i]);
    }
    int min(int dis[],Boolean visited[])
            
    {
        int v=dis.length;
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<v;i++)
        {
            if(!visited[i] && dis[i]<=min)
            {
                min=dis[i];
                index=i;
            }
        }
        return index;
    }
    
    
}
