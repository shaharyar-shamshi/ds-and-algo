
package border;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Border {

    
    public static void main(String[] args) {
        int s=0;
        while(s==0)
        {
        Scanner in =new Scanner(System.in);
         int query=in.nextInt();
          if(query==0)
          {
              s=1;
          }
          else
          {
            int bx=in.nextInt();
            int by=in.nextInt();
             for(int i=0;i<query;i++)
             {
                 int a=in.nextInt();
                 int b=in.nextInt();
                 if(a==bx||b==by)
                 {
                     System.out.println("divisa");
                     
                 }
                 else if(by<b && bx>a)
                         {
                            System.out.println("NO");
                            
                         }
                 else if(by>b&&bx>a)
                 {
                     System.out.println("SO");
                     
                 }
                 else if(a>bx&&b<by)
                 {
                     System.out.println("SE");
                 }
                 else if(a>bx&&b>by)
                 {
                     System.out.println("NE");
                 }
             }
          }
        }
    }
    
}
