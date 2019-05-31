/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tricky;

import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author shaharyar
 */
public class Tricky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int g=0;g<t;g++){
        int n = in.nextInt();
        int count = 0;
        int [] a = new int[n];
        for (int i=0; i<n;i++){
            a[i] = in.nextInt();
         }
        int m = in.nextInt();
        for (int i=0; i<n;i++){
            for (int j=i+1; j<n; j++) {
                for (int k= j+1; k<n; k++) {
                    int sum = a[i] + a[j] + a[k];
                    if (sum % m == 0) {
                        count++;
                    
                    }
                
                }
            
            }
        }
        System.out.println(count);
    }
    }
    
}
