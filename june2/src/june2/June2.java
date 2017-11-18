/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june2;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class June2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int h=0;h<t;h++)
        {
        int x=in.nextInt();
        int y=in.nextInt();
        int count=1;
      long sum=0L;
      sum=(x+y);
        long rank=0L;
             rank= count +(sum*(sum+1))/2 +(x-0);
  
        
        System.out.println(rank);
    }
    }
    
}
