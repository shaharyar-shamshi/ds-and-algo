
package april3;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class April3 {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // String s=new String();
         String s=in.next();
        // StringBuilder s=new StringBuilder(s);
         int count=0;
          for(int i=0;i<s.length()-1;i++)
          { 
              int j=0;
              int h=0;
              if(s.charAt(i)=='1' && s.charAt(i+1)=='0')
              {
                count=  count+1;
               
                   for(j=i+1;j<s.length()-1;j++)
                  
                  {
                      count=count+1;
                      
                      if(s.charAt(j+1)=='1')
                      {
                         h=j;
                         j=s.length();
                      }
                  }
                 
              
              char[] m=s.toCharArray();
              m[i]=0;
              m[h]=1;
              s=String.valueOf(m);
              }
                  
          }
          System.out.println(count);
        
    }
    
}
