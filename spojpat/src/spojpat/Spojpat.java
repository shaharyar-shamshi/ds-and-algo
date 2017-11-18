/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spojpat;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Spojpat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String s=in.next();
       //char [] stop={'*'};
       while(!(s.charAt(0)=='*' && s.length()==1))
       {
       int l=s.length();
       char[][] seg=new char[4*l][l];
       int[] x=new int[4*l];
       Spojpat b=new Spojpat();
       b.build(1,l,s,seg,1,x);
     System.out.println(l/x[1]);
     s=in.next();
       } 
    }
    void build(int s,int e,String a,char[][]seg,int node,int x[])
    {
        if(s==e)
        {
            seg[node][e-s]=a.charAt(s-1);
            x[node]=1;
            
            return;
            
        
    }
        
            int m=(s+e)/2;
            build(s,m,a,seg,node*2,x);
            build(m+1,e,a,seg,node*2+1,x);
            if(x[node*2]!=x[node*2+1])
            {
                x[node]=x[node*2]+x[node*2+1];
                char[] b=new char[x[node]];
                for(int i=0;i<x[node];i++)
                {
                    if(i<x[node*2])
                        b[i]=seg[node*2][i];
                    else
                    b[i]=seg[node*2+1][i-x[node*2]];
                }
                int k=0;
                for(int i=0;i<x[node];i++)
                {
                    int count=0;
                    for(int j=0;j<k;j++)
                    {
                        if(seg[node][j]==b[i])
                            count++;
                    }
                    if(count==0)
                        {
                      seg[node][k]=b[i];  
                      k++;
                }
                   
            }
                 x[node]=k;
                   // System.out.println(k);
                return;
            }
            else
            {
                int k=0;
                for(int i=0;i<x[node*2];i++)
                {
                    if(seg[node*2][i]==seg[node*2+1][i])
                        k++;
          
                }
                if(k==x[node*2])
                {
                    x[node]=x[node*2];
                  
                    for(int i=0;i<x[node];i++)
                        seg[node][i]=seg[node*2][i];
                    return;
                         
                }
                else
                {
                  x[node]=x[node*2]+x[node*2+1];
                char[] b=new char[x[node]];
                for(int i=0;i<x[node];i++)
                {
                    if(i<x[node*2])
                        b[i]=seg[node*2][i];
                    else
                    b[i]=seg[node*2+1][i-x[node*2]];
                }
                int v=0;
                for(int i=0;i<x[node];i++)
                { int count=0;
                    for(int j=0;j<v;j++)
                    {
                        if(seg[node][j]==b[i])
                            count++;
                    }
                    if(count==0)
                        {
                      seg[node][v]=b[i];  
                      v++;
                }
                   
            }
                 x[node]=v;
                return;
                }
                    
            }
          
           
            
      
}
}