/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy3_spoj;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Candy3_spoj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        for (int j=0; j<testcase; j++) {
        String blank = in.nextLine();
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i<n;i++) {
         sum = (sum % n + in.nextInt()% n ) % n;
        }
        if (sum == 0)
        System.out.println("YES");
        else
            System.out.println("NO");
        }
    }
    
}
