/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2nd;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       
          int max=in.nextInt();
          int min=max;
          for(int j=0;j<2;j++)
          
          {
              int middle;
              int a=in.nextInt();
                if(a>max)
                    max=a;
                else if(a<min)
                    min=a;
                else
                     middle=a;
               
              
          }
          System.out.println(middle);
                  
           
       }
    }
    

