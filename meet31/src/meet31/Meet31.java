
package meet31;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Meet31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=n;
      int two=0,five=0,ten=0,x=0;
           
      while(c!=0)
      {
          
          if(c%10==0)
              ten=ten+1;
          else
          {
          
              if(c%2==0 )
                  two++;
          
        if(c%5==0)
            five++;
        
          }
         
          c=c-1;
          
       
      }
      System.out.println(five);
      System.out.println(two);
  
     if(two>=five)
           x=five;
      else
         x=two;
      System.out.println(ten);
    }
    
}
