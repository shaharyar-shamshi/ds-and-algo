/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author shaharyar
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String t=br.readLine();
      
        int n=Integer.parseInt(t);
        t=br.readLine();
        int q=Integer.parseInt(t);
         t=br.readLine();
        char c=t.charAt(0);
        System.out.println(n);
        System.out.println(q);
        System.out.println(c);
                
    }
    
}
