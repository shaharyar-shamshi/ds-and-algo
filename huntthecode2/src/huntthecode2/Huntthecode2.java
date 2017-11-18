
package huntthecode2;
import java.util.Scanner;
/**
 *
 * @author shaharyar
 */
public class Huntthecode2 {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
          int n=in.nextInt();
            int answer=n*(n-1);
            System.out.println(answer);
             
        }     
           
    
}
}