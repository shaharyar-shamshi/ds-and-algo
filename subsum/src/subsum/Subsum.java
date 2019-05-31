/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsum;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Subsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int n = in.nextInt();
        int[] dp = new int[sum + 1];
        for (int i = 0; i < n; i++) {
            dp[in.nextInt()] = 1;
        }
        dp[0] = 1;

        for (int i = 0; i < sum + 1; i++) {
            if (dp[i] == 0) {
                int j = i - 1;
                while (j >= 0) {
                    if (dp[j] == 1 && dp[i - j] == 1 && (i - j) != j) {
                        dp[i] = 1;
                        j = -1;
                    } else {
                        j--;
                    }
                }

            }

        }
        for (int i = 0; i <= sum; i++) {
            System.out.print(dp[i]);
        }
        if (dp[sum] == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
