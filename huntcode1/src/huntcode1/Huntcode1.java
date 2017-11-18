
package huntcode1;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Huntcode1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
             int n=in.nextInt();
            int [] a=new int[n+1];
             for(int i=0;i<n+1;i++)
             {
                 a[i]=0;
             }
                     for(int i=2;i<n+1;i++)
                     {
                         if(a[i]==0)
                         {
                             for(int j=i*2;j<n+1;j=j+i)
                             {
                                 a[j]=1;
                             }
                         }
                     }
                     int j=0;
                     for(int i=2;i<n+1;i++)
                     {
                         if(a[i]==0)
                         {
                             if(j%2==0)
                                 System.out.println(i*2);
                             else
                                 System.out.println(i*3);
                             j++;
                             
                         }
                     }
    }
    
}
