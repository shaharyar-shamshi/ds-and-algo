/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpout;

/**
 *
 * @author shaharyar
 */


    /**
     * @param args the command line arguments
     */
   
        import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inpout {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer("");

        long count = 0;
        for (int i = 0; i < 100000; ++i) {
            String temp[] = br.readLine().split(" ");
            int u = Integer.parseInt(temp[0]);
            int v = Integer.parseInt(temp[1]);

//            token = new StringTokenizer(br.readLine());
//            int v = Integer.parseInt(token.nextToken());
//            int u = Integer.parseInt(token.nextToken());
            count += (u + v);
        }

        System.out.println(count);
    }
}

  
    
