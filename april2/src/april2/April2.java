
package april2;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class April2 {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       for(int h=0;h<t;h++)
       {
       int n=in.nextInt();
       int k=in.nextInt();
       int [] ing=new int[k];
       for(int i=0;i<k;i++)
       {
           ing[i]=i+1;
       }
       
       int v=0;
       int count=0;
       for(int i=0;i<n;i++)
       {
           
           
           int s=in.nextInt();
            for(int j=0;j<s;j++)
            {
                int f=in.nextInt();
                if(ing[f-1]!=0)
                {
                  ing[f-1]=0;
                  count++;
                } 
            }
            if(v==0)
            {
        
            
            
                  if(count==k && i!=(n-1))
                  {
                      System.out.println("some");
                       v=1;
                  }
                  else if(count==k && i==(n-1))
                  {
                      System.out.println("all");
                      v=1;
                  }
            }
                  
       }
       if(v!=1)
           System.out.println("sad");
       }
    
}
}