/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct1;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Oct1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        for(int j=0;j<test;j++)
        {
        int n=in.nextInt();
        int p=in.nextInt();
        int c=p/2;
        int h=p/10;
        int cc=0;
        int hc=0;
        for(int i=0;i<n;i++)
        {
            if(cc<=1 && hc<=2)
            {
            int t=in.nextInt();
            if(t>=c)
                cc++;
            if(h>=t)
                hc++;
            }
            else
            {
                int t=in.nextInt();
            }
            
            
        }
        if(hc==2 && cc==1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    }
    
}
