/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spoj_whatnext;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Spoj_whatNext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a !=0 || b!=0 || c!=0) {
         if (a-b == b-c) {
          System.out.println("AP " + (c + (b - a)));
         } else {
          System.out.println("GP " + (c*(b/a)));
         }
        }
    }
    
}
