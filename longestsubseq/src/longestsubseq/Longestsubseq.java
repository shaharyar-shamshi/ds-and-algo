/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubseq;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Longestsubseq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        int length = w.length();
        int count = 0;
        char[] s = w.toCharArray();
        int temp = 0;
        int i = 0;
        for(int j=i+1;j<length;j++){
            
         for(int k=j-1;k>=i;k--) {
             if(s[k] != s[j]){
              temp++;
             } else {
                 i= k+1;
               if(count < temp)
                   count = temp;
                break;
             }
         
         }
         if(count < temp)
         count = temp;
            temp=0;
        }
        System.out.println(count+1);
        
        }
        
    }
