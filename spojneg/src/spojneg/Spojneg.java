/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spojneg;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Spojneg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int h=0;h<t;h++)
        {
        int n=in.nextInt();
        int q=in.nextInt();
        int [] a=new int[n];
        int []seg=new int[4*n];
        Spojneg b=new Spojneg();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            
        }
        b.build(1, a.length, a, seg, 1);
        System.out.print("Scenario #"+(h+1));
        System.out.println();
        for(int i=0;i<q;i++)
        {
            int l=in.nextInt();
            int r=in.nextInt();
            int k=(int)b.query(1, a.length, seg, l, r, 1);
            System.out.println(k);
        }
        }
        
    }
    void build(int s,int e,int [] a,int []seg,int node)
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
                if(seg[node*2]<seg[node*2+1])
                    seg[node]=seg[node*2];
                        else
                seg[node]=seg[node*2+1];
                return;
            
        }
    }
    double query(int s,int e,int [] seg,int l,int r,int node)
    {
        if(s>r || e<l)
        {
            return Double.POSITIVE_INFINITY;
        }
        else if(l<=s && e<=r)
        {
          return seg[node];  
        }
        else
        {
            int m=(s+e)/2;
            double u=query(s,m,seg,l,r,node*2);
            double v=query(m+1,e,seg,l,r,node*2+1);
            if(u<v)
                return u;
            else
                return v;
                
        }
    }
    
}
