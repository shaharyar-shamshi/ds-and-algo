
package ap3;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Ap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int t=in.nextInt();
         for(int h=0;h<t;h++)
         {
         String s=in.next();
        
         int one=0;
         BigInteger sum=new BigInteger("0");
         int i=0;
         while(i<s.length())
         {
              int count=0;
             if(s.charAt(i)=='1')
             {
                 one++;
             }
             int j=i+1;
             int g=0;
             while(j<s.length() && one!=0 &&  g==0)
             {
                 if(s.charAt(j)=='0' )
                 {
                 count++;
                 j++;
                 }
                 else
                 {
                     g++;
                     
                    
                 }
                 
             }
             if(count!=0)
                     sum=sum.add(BigInteger.valueOf(one*(count+1)));
             i=j;
             
                 
             
         }
         System.out.println(sum);
         
    }
    }
    
}

