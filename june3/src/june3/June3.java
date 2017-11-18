/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june3;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class June3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner in=new Scanner(System.in);
          int t=in.nextInt();
          for(int g=0;g<t;g++)
              
          {
         int x=in.nextInt();
         int y=in.nextInt();
         int z=in.nextInt();
         int[]a=new int[x];
         int []b=new int[y];
         int []c=new int[z];
         long sum=0L;
         long mod=1000000007L;
         for(int i=0;i<x;i++)
             a[i]=in.nextInt();
         for(int i=0;i<y;i++)
             b[i]=in.nextInt();
         for(int i=0;i<z;i++)
             c[i]=in.nextInt();
         for(int i=0;i<y;i++)
             for(int j=0;j<x;j++)
                 if(b[i]>=a[j])
                     for(int k=0;k<z;k++)
                         if(b[i]>=c[k])
                         {
                             sum=sum+((b[i]+a[j])*(b[i]+c[k]));
                         }
         System.out.println(sum%mod);
    }
    }
}
