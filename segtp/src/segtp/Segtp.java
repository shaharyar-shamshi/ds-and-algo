
package segtp;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segtp {

   
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int []a=new int[n];
       int []seg=new int[4*n];
       int lazy[]=new int[4*n];
       for(int i=0;i<n;i++)
       {
         a[i]=in.nextInt();  
       }
       Segtp b=new Segtp();
       b.build(1, a.length, a, seg, 1);
       int p=in.nextInt();
       int value=in.nextInt();
       b.update(1,a.length,p,value,seg,1);
       
       for(int i=0;i<4*n;i++)
       {
           if(seg[i]!=0)
               System.out.println(seg[i]);
       }
       query()
       
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
            seg[node]=seg[node*2]+seg[node*2+1];
            return;
        }
    }
    void update(int s,int e,int p,int value,int [] seg,int node)
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
                update(s,m,p,value,seg,node*2);
            else
                update(m+1,e,p,value,seg,node*2+1);
            seg[node]=seg[node*2]+seg[node*2+1];
            return;
        }
    }
    
}
