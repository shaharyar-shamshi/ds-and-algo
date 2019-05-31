/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalpana;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Kalpana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++) {
            char [] alpha={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
                    int n=in.nextInt();
                     int xor=in.nextInt();
                     for(int i=0;i<n-1;i++) {
                         xor=xor ^ (in.nextInt());
                     }
                     System.out.println(alpha[xor-1]);
            
        }
    }
    
}
