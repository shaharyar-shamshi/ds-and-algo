/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package may2019prac1;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class May2019prac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        for (int j=0; j<testcase; j++) {
        int min1 = 0, min2 = 0;
        int max1 = 0, max2 = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                min1 = in.nextInt();
                max1 = min1;
            } else {
                int temp = in.nextInt();
                if (max1 < temp) {
                    min1 = max1;
                    max1 = temp;
                } else if (min1 < temp) {
                    min1 = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                min2 = in.nextInt();
                max2 = min2;
            } else {
                int temp = in.nextInt();
                if (max2 < temp) {
                    min2 = max2;
                    max2 = temp;
                } else if (min2 < temp) {
                    min2 = temp;
                }
            }
        }
        
        if ((min1 + max1) > (max2 + min2)) {
         System.out.println("AAYUSHI");
    } else {
         System.out.println("DAKSH");
        }
}
    }
}
