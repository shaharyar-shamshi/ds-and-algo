
package huntthecode3re;
import java.util.Scanner;
public class Huntthecode3re {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
               int n=in.nextInt();
                 Huntthecode3re y=new Huntthecode3re(); 
               int sum= y.rec(n,0);
               System.out.println(sum);
       
    }
    public int rec(int n,int sum)
            
    {
        if(n!=0)
        {
           
             sum=sum+(n*n)+n;
             
                    return rec(n-1,sum);
                     
                     
      
        }
            
        
        return sum;
    }
    
}
