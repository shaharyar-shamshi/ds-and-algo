/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jolly;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Jolly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n;
        while( n=in.nextLine().equals(" "))
        {
            
            int s=0;
            int a=in.nextInt();
            for(int i=0;i<n-1;i++)
            {
                
               
                        
                int b=in.nextInt();
                if((b-a)<0 && (a-b)>=n)
                    s=1;
                else if((b-a)>0 && (b-a)>=n)
                    s=1;
                else
                    a=b;
                    
                    
                   
            }
            if(s==0)
                System.out.println("Jolly");
            else
                 System.out.println("Not Jolly");
        }
        catch(Exception e)
        {
            
        }
        
    }
    
}
