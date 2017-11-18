
package segmenttree;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segmenttree {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
             a[i]=in.nextInt();
          int seg[]=new int [n*n];
            int k=0;
            Segmenttree s=new Segmenttree();
            s.build(1,n,1,a,seg);
            s.print(seg);
            int w=s.query(3, 4, 1, n, 1, seg);
            System.out.println(w);
            
            
       
    }
    void build(int s,int end,int node,int []a,int[] seg)
    {
        if(s==end)
                {
                    seg[node]=a[s-1];
                    return;
                    
                }
      int  m=(s+end)/2;
        build(s,m,node*2,a,seg);
        build(m+1,end,node*2+1,a,seg);
        seg[node]=seg[node*2+1]+seg[node*2];
        return;
        
        
    }
    void print(int seg[])
            
    {
       for(int i=0;i<seg.length;i++)
           if(seg[i]!=0)
               System.out.println(seg[i]);
           
    }
    int query(int l,int r,int s,int e,int node,int seg[])
    {
        if(s>r||e<l)
        {
            return 0;
        }
        else if(s>=l  && e<=r)
                {
                    return seg[node];
                }
        else
        {
           int m=(s+e)/2;
            return query(l,r,s,m,node*2,seg)+query(l,r,m+1,e,node*2+1,seg);
        }
    }
    
}
