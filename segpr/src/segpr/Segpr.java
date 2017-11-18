/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segpr;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segpr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int []a=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=in.nextInt();
       }
               Segpr b=new Segpr();
               int seg[]=new int[4*n];
               int [] lazy=new int[4*n];
               b.build(1,a.length,a,seg,1);
             int s=in.nextInt();
             int e=in.nextInt();
               int value=in.nextInt();
               b.range(1, a.length, s, e, value, seg, lazy, 1);
               int query
              
               
       
    }
    void build(int s,int e,int [] a,int [] seg,int node)
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
            seg[node]=seg[node*2]+seg[node*2+1];
            return;
        }
    }
    int query(int s,int e,int l,int r,int seg[],int a[],int node)
    {
        if(s>r || l>e)
        {
            return 0;
        }
        else if(l<=s&&e<=r)
        {
            return seg[node];
        }
        else
        {
            int m=(s+e)/2;
            return(query(s,m,l,r,seg,a,node*2)+query(m+1,e,l,r,seg,a,node*2+1));
        }
    }
    void update(int p,int value,int s,int e,int seg[],int node)
    {
        if(s==e)
        {
            seg[node]=value;
            return;
        }
        else
        {
            int m=(s+e)/2;
            if(p<=m)
                update(p,value,s,m,seg,node*2);
            else
                update(p,value,m+1,e,seg,node*2+1);
            seg[node]=seg[node*2]+seg[node*2+1];
            return;
        }
    }
    public void range(int s,int e,int l,int r,int value,int seg[],int lazy[],int node)
            
    {
        if(lazy[node]!=0)
        {
            seg[node]=(e-s+1)*lazy[node];
            if(e>s)
            lazy[node*2]=lazy[node*2+1]=lazy[node];
            lazy[node]=0;
        }
        if(s>r || e<=l)
        {
            return;
        }
        else if(l<=s || e<=r)
        {
            seg[node]=(e-s+1)*value;
            if(e>s)
            {
               int m=(s+e)/2;
            lazy[node*2]=lazy[node*2+1]=value;
            }
                return;          
                    
        }
        else
        {
            int m=(s+e)/2;
                    range(s,m,l,r,value,seg,lazy,node*2);
                    range(m+1,e,l,r,value,seg,lazy,node*2+1);
                    seg[node]=seg[node*2]+seg[node*2+1];
                    return;
            
        }
    }
    
    
}
