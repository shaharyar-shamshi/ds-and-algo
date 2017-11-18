
package segmenttree1;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segmenttree1 {

 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++)
            a[i]=in.nextInt();
        int b[]=new int [16];
        Segmenttree1 x=new Segmenttree1();
        x.build(1,a.length,a,1,b);
        for(int i=0;i<4*4;i++)
        {
            if(b[i]!=0)
                System.out.println(b[i]);
        }
        
    }
    void build(int l,int r,int [] a,int node,int[]b)
    {
        if(l==r)
        {
            b[node]=a[l-1];
            return;
        }
        int m=(l+r)/2;
        build(l,m,a,node*2,b);
        build(m+1,r,a,node*2+1,b);
        b[node]=b[node*2]+b[node*2+1];
        return;
        
    }
    
}
