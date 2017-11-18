/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Oct2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        for(int j=0;j<test;j++)
        {
        int n=in.nextInt();
        int k=in.nextInt();
        int []a=new int[n];
       int mex=0;
       int max=a[0]=in.nextInt();
       
        for(int i=1;i<n;i++)
        {
            a[i]=in.nextInt();
            if(max<a[i])
                max=a[i];
        }
        int ans=-1;
        int[] count=new int[max+1];
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
           if(i==0)
           {
                if((a[i]-0)<=k )
                {
                    k=k-a[i];
                }
                else
                {
                    ans=k;
                    i=n;
                }
               
                    }
           else if(a[i]!=a[i-1])
           {
               if((a[i]-a[i-1]-1)<=k)
                   
               {
                   k=k-a[i]+a[i-1]+1;
               }
               else
               {
                   ans=a[i-1]+k+1;
                   i=n;
               }
           }
        }
        if(ans==-1 )
            ans=max+k+1;
        System.out.println(ans);
    }
    }
    
}


