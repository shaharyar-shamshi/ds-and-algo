/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meet4;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Meet4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNextLine())
        {
            int n=in.nextInt();
            int x=n/2;
            int y=n/3;
            int v=n/4;
            if(x+y+v>=n)
                System.out.println(x+y+v);
            else
                System.out.println(n);
       }
    }
    
}
