
package april31;
import java.util.Scanner;
/**
 *
 * @author shaharyar
 */
public class April31 {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=new String();
        s=in.next();
        int count=0;
        int n=0;
        int k=s.length();
        for(int i=k-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                count=count+k-1-i;
                k=k-1;
               char[] m= s.toCharArray();
                m[i]='0';
                s=s.valueOf(m);
                n++;
            }
        }
        System.out.println(count+n);
        
    }
    
}
