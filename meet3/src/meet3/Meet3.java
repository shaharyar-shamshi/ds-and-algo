/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meet3;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Meet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
                for(int y=0;y<t;y++)
                {
        int a=in.nextInt();
        int b=in.nextInt();
        Meet3 m=new Meet3();
       m.gcd(a,b);
                }
    }
    void gcd(int a,int b)
    {
        if(a==0)
            System.out.println(b);
       else if(b==0)
           System.out.println(a);
        else
       {
           if(a>b)
           {
               a=a%b;
               gcd(a,b);
           }
           else
           {
               b=b%a;
               gcd(a,b);
           }
       }
    }
}
