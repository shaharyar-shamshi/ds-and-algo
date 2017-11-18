/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segudate;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segudate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Segudate b=new Segudate();
        int [] seg=new int[4*n];
        b.build(1,a.length,a,seg,1);
        int p=in.nextInt();
        int value=in.nextInt();
       b.update(p, value, 1, a.length, seg, 1);
        int l=in.nextInt();
        int r=in.nextInt();
      int k=  b.query(l, r, 1, a.length, seg, 1);
      System.out.println("answer  " +k);
                
    }
    void build(int s,int e,int [] a,int seg[],int node)
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
    int query(int l,int r,int s,int e,int [] seg,int node)
    {
        if(s>r || e<l)
        {
            return 0;
        }
        else if(s>=l && e<=r)
        {
            return seg[node];
        }
        else
        {
            int m=(s+e)/2;
            return query(l,r,s,m,seg,node*2)+query(l,r,m+1,e,seg,node*2+1);
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
            
        }
    }
              
    
}
