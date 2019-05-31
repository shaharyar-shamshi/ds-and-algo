/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package may20192;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class May20192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        for (int test = 0; test < testcase ; test++){
        int x = in.nextInt();
        int y = in.nextInt();
        int count = 0;
        while (x !=0 && y!=0) {
         if (x>y) {
          x = x-y;
         } else {
          y = y-x;
         }
         count++;
        }
        if (count % 2 == 0) {
        System.out.println("Rich");
        } else {
        System.out.println("Ari");
        }
        
    }
    }
    
}
