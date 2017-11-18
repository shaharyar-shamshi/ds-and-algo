
package javaapplication41;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author shaharyar
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            int temp=in.nextInt();
            if(temp!=0)
            {
                a[i]=temp;
                j++;
                
            }
        }
         Arrays.sort(a);
         for(int i=n-j;i<n;i++)
         {
             System.out.print(a[i] +" ");
         }
         for(int i=0;i<n-j;i++)
         {
             System.out.print("0 ");
         }
        
    }
    
}
