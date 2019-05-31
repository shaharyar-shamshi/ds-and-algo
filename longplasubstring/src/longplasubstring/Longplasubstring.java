/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longplasubstring;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Longplasubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       String s = in.next();
       char [] w = s.toCharArray();
       int diff =0;
       int start=0;
      
       int end=0;
       for(int i=0 ; i<s.length();i++){
           for(int j=s.length()-1; j>i;j--){
                 //System.out.print(i+" "+w[i]+" "+j+" "+ w[j]+" ");
                  if(w[i] == w[j]){
                     
                      int plan = 1;
                      int length = j-i+1;
                      for(int k = i; k<j ; k++) {
                          if(w[k]!= w[i+length-k-1])
                          {
                              plan = 0;
                              break;
                          }
                      }
                      if(plan == 1 && length> diff) {
                          end=j;
                          start=i;
                          diff=length;
                        //  System.out.println("i am diff");
                      }
                  }           
           }
       
       
    }
       System.out.println(s.substring(start,end+1));
    }
    
}
