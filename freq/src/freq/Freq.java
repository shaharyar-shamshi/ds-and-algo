/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freq;

import java.util.*;

/**
 *
 * @author shaharyar
 */
public class Freq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for (int h=0;h<t;h++) {
        Map hm = new HashMap();
        int n = in.nextInt();
        for (int i=0;i<n;i++) {
            int x = in.nextInt();
         if(hm.get(x)== null ) {
          hm.put(x,1);
         }
         else {
         hm.put(x, 1+(int)hm.get(x));
         }
        }
        int count = 0;
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
         Map.Entry entry = (Map.Entry)it.next();
         count = count + (int)entry.getValue();
         System.out.println(count);
        }
        }
        
    }
    
}
