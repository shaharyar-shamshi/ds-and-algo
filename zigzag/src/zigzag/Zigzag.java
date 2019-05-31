/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zigzag;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Zigzag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int r = in.nextInt();
        int c = s.length()/r;
        if(s.length()%c !=0) {
            c= c+1;
        }
        char [][] arr = new char[r][c];
        int count =0;
        int j=0,i=0;
        while(count < s.length()) {
            while(i <r && count < s.length()){
                System.out.println(s.charAt(count)+" " + i +" "+j);
              arr[i][j] = s.charAt(count);
              i=i+1;
              count = count +1;
            }
            i=i-2;
            j=j+1;
                while((i-1) !=0 && count < s.length()){
                 
                 System.out.println(s.charAt(count)+" " + i +" "+j);
              arr[i][j] = s.charAt(count);
              count++;
              i--;
              j++;
             }
            }
        
      /*  for (int h=0; h<r;h++){
            for(int k=0;k<c;k++){
                if(arr[h][k] != '\u0000')
                    System.out.println(arr[h][k]);
            }
        } */
        
    }
    
}
