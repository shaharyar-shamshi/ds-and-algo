
package march1;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class March1 {

    
    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
         int f=in.nextInt();
         for(int l=0;l<f;l++)
         {
         int n;
          n=in.nextInt();
          int [] x=new int[n];
          int [] y=new int[n];
          for(int i=0;i<n;i++)
          {
              x[i]=in.nextInt();
          }
        for(int i=0;i<n;i++)
          {
              y[i]=in.nextInt();
          }
        int w=0; int e=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                w=w+x[i];
                e=e+y[i];
            }
            else
            {
                w=w+y[i];
                e=e+x[i];
            }
        }
        if(w>e)
            System.out.println(e);
        else
            System.out.println(w);
    }
    
}
}