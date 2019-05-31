/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeno;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Primeno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] prime =  new int[10];
        for (int i=2;i<10;i++) {
            if (prime[i] == 0 ) {
                for (int j=i ; j<10; j = j+i) {
                    prime[j] = 1;
                }
            }
        }
        for ( int i=2;i<n;i++) {
            if (prime[i-1] == 0) {
            System.out.println(i);
                    }
                    }
    }
    
}
