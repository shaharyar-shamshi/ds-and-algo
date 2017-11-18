
package march2;
import java.util.Scanner;
/**
 *
 * @author shaharyar
 */
public class March2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int y=0;y<t;y++)
        {
       int n=in.nextInt();
       int q;int w;int e;int r;int k=0;
          q=w=e=r=in.nextInt();
          for(int i=0;i<n-1;i++)
          {
          {
              int temp=in.nextInt();
              if(temp!=q||temp!=w||temp!=e||temp!=r)
              {
               if(temp<q)
               {
                   w=q;
                   q=temp;
               }
               else if(temp>r)
               {
                   e=r;
                   r=temp;
               }
              }
              else if(temp==q||temp==w||temp==e||temp==r)
              {
                  k=temp;
                  i=n;
              }
              
          }
          
    }
          if(k==0)
          {
              if(w-q!=1)
                  k=q;
              else 
                  k=r;
          }
          System.out.println(k);
    }
}
}