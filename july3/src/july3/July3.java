/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july3;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class July3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int k=0;k<t;k++)
        {
        int n=in.nextInt();
        int b=in.nextInt();
        int max=0;
        for(int i=1;i<=n;i++)
        {
            n=n-1;
            if(n%b==0)
            {
               if((n/b)*i>max)
                   max=(n/b)*i;
            }
        }
        System.out.println(max);
        }
    }
    
}
