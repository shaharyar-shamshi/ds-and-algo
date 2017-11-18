
package segquery;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Segquery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Segquery s=new Segquery();
        int seg[]=new int[4*n];
        s.build(1,a.length,a,seg,1);
        int l=in.nextInt();
        int r=in.nextInt();
      int k=  s.query(l,r,1,a.length,seg,1);
      System.out.println("answer  " +k);
            
    }
   void build(int s,int e,int a[],int []seg,int node)
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
     else if(l<=s && r>=e)
     {
         return seg[node];
     }
      else
     {
        int m=(s+e)/2;
         return query(l,r,s,m,seg,node*2)+query(l,r,m+1,e,seg,node*2+1);
     }
   }
   
    
}
