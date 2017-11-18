/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spojand;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Spojand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int m=0;m<t;m++)
        
        {
        int n=in.nextInt();
        int q=in.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int [] seg=new int[4*n];
        Spojand b=new Spojand();
        b.build(1,a.length,a,seg,1);
        if(3+2*(q-1)>=n)
            for(int i=0;i<n;i++)
                System.out.print(seg[1]+" ");
        else
        for(int i=0;i<n;i++)
        {
            int x=i+1;
            int y=x-q;
            int z=x+q;
            if(y<=0)
            {
               y=n+y; 
                
            }
            if(z>n)
            {
                z=z-n;
            }
            int k=0;
            if(y<x && x<z )
               k=b.query(1,n,seg,1,y,z);
            else
            {
                if(y<x)
                  k=b.query(1,n,seg,1,y,x)&  a[z-1];
                else if(x<z)
                   k=b.query(1, n, seg, 1, x, z)&a[y-1];
            }
            System.out.print(k+" ");
        }
       
        
        }
    }
    void build(int s,int e,int []a,int[]seg,int node)
    {
        if(s==e)
        {
            seg[node]=a[s-1];
            return;
        }
        else
        {
            int m=(s+e)/2;
            build(s,m,a,seg,node*2);
            build(m+1,e,a,seg,node*2+1);
            seg[node]=seg[node*2+1]&seg[node*2];
            return;
        }
        
    }
    int query(int s,int e,int[]seg,int node,int l,int r)
    {
        if(s>r || e<l)
        {
            return 1;
        }
        else if(l<=s && e<=r)
        {
            return seg[node];
        }
        else
        {
            int m=(s+e)/2;
            return query(s,m,seg,node*2,l,r)&query(s,m,seg,node*2,l,r);
        }
            
        
    }
    
}
