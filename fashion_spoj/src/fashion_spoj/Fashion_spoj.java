/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashion_spoj;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Fashion_spoj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int t=0; t<test; t++) {
        int n = in.nextInt();
        int [] men =  new int[n];
        int [] women = new int[n];
        for (int i=0;i<n;i++) {
         men[i] = in.nextInt();
        }
        for (int i=0;i<n;i++) {
         women[i] = in.nextInt();
        }
        men = sort(men);
        women = sort(women);
        int sum = 0;
        for (int i=0;i<n; i++) 
            sum = sum + women[i]*men[i];
        System.out.println(sum);
        }
    }
    
    public static int[] sort(int [] arr) {
        int n = arr.length;
      for (int i=1; i<n; i++) {
       int key = arr[i];
       int j=i-1;
       while (j>=0 && key < arr[j]) {
        arr[j+1] = arr[j];
        j--;
       }
       arr[j+1] = key;
      }
      return arr;
    }
    
}
