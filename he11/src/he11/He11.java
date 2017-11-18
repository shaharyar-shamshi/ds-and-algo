/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package he11;

import static java.lang.Math.asin;
import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class He11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int q=in.nextInt();
        int min,max;
        if(a>b)
        {
            min=b;
            max=a;
        }
        else
        {
            min=a;
            max=b;
        }
        int x=in.nextInt();
        int y=in.nextInt();
        int value=-1;
        int i=1;
        int check=min;
        while(check>x)
        {
            if(min%i==0 && max%(min/i)==0 )
            {
                if((min/i)>value)
                {
                    value=min/i;
                    check=min/i;
                }
            }
            i++;
                
        }
        System.out.println(value);
            
    }
    
}
