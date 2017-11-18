
package april1;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class April1 {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int f=0;f<t;f++)
        {
        String [] a=new String[4];
         String [] b=new String[4];
          for(int i=0;i<4;i++)
          {
             a[i]=in.next();
          }
          for(int j=0;j<4;j++)
          {
              b[j]=in.next();
          }
          int count=0;
             for(int i=0;i<4;i++)
             {
                 for(int j=0;j<4;j++)
                 {
                    if(a[i].equals(b[j]))
                        count++;
                        
                 }
             }
             if(count>=2)
                 System.out.println("similar");
             else
                 System.out.println("dissimilar");
    }
    }
}
