/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

import java.util.Scanner;


/**
 *
 * @author shaharyar
 */
public class JavaApplication67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String s="1";
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        for(int k=0;k<test;k++)
        {
        int max=1;
        int flag=max;int p=1;
        int q=1;
        
        String w=in.next();
        
        for(int i=0;i<w.length();i++)
        {
            if(w.charAt(i)=='<')
            {
              p=q;
              
              q++;
              max=q;
              
              if(max>flag)
                  flag=max;
            }
            else if(w.charAt(i)=='>')
            {
                max--;
            }
            
        }
        System.out.println(flag);
    }
    }
}
