
package segl;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segl {

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
        int [] lazy=new int[4*n];
        Segl b=new Segl();
        b.build(1,a.length,a,seg,1);
        int l=in.nextInt();
        int r=in.nextInt();
        int val=in.nextInt();
        b.range(1,a.length,l,r,a,seg,lazy,1);
        
        
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
            seg[node]=seg[node*2]+seg[node*2+1];
            return;
        }
    }
    void range(int s,int e,int l,int r,int[] a,int[] seg,int[] lazy,int node)
    {
        if()
        
    }
    
}
