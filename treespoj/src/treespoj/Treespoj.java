
package treespoj;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Treespoj {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int k=0;k<t;k++)
        {
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            int count=in.nextInt();
            a[i-1]=i;
           int j=i-1;
            while(count!=0)
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j=j-1;
                count--;
            
            }
        
        
        
        
    }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+ " ");
        
    }  
}
}