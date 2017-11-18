/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segtree;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segtree {

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
        int [] seg=new int[4*n];
        Segtree s=new Segtree();
        s.build(1, a.length, a, 1,seg);
        System.out.println("answer");
        for(int i=0;i<4*n;i++)
        {
            if(seg[i]!=0)
                System.out.println(seg[i]);
        }
    }
   void build(int s,int e,int a[],int node,int seg[])
   {
       if(s==e)
       {
           seg[node]=a[s-1];
           return;
       }
       else
       {
          int m=(s+e)/2;
          build(s,m,a,node*2,seg);
          build(m+1,e,a,node*2+1,seg);
          seg[node]=min(seg[node*2],seg[node*2+1]);
          return;
       }
       
       
       
   }
   int min(int a,int b)
   {
       if(a>b)
           return b;
       else return a;
   }
    
}
