/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveprime;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Sieveprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j=0; j<t; j++) {
        long number = in.nextLong();
        long count = 0;
        while( number>0 ) {
         count = count + number/5;
         number = number/5;
        }
        System.out.println("Answer " + count);
        }
        
         }
        
    
}
