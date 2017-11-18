/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june4;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class June4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] prime=new int[1000001];
        for(int i=2;i<1000001;i++)
        {
            if(prime[i]==0)
            {
            for(int j=i+i;j<1000001;j=j+i)
                prime[j]=1;
            }
        }
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        int [] a=new int[count];
        for(int i=0;i<count;i++)
        {
            a[i]=in.nextInt();
        }
            
        
        
        int q=in.nextInt();
        for(int k=0;k<q;k++)
        {
            int l=in.nextInt();
            int r=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            int result=0;
            for(int i=x;i<=y;i++)
            {
                if(prime[i]==0)
                {
                    for(int j=l;j<=r;j++)
                    {
                        int number=a[j-1];
                        int ex=0;
                        while(number%i==0)
                        {
                            ex++;
                            number=number/i;
                        }
                        result=result+ex;
                    }
                }
            }
            System.out.println(result);
            
        }

}
}