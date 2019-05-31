/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapheight;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Heapheight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int h=0;h<test;h++){
        int element = in.nextInt();
        for(int g=0 ; g<element; g++) {
         int n = in.nextInt();
        }
        int count = 0;
        int i=1;
        while (element >= i) {
         count++;
         i = i*2;
        }
        if (count !=0) {
        System.out.println(count-1);
        }
        else 
            System.out.println(count);
    }
   }
    
}
