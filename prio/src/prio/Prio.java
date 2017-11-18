/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prio;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Prio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=in.nextInt();
            q.add(x);
        }
       int sum=0;
        while(q.size() !=1)
        {
            int x=(int)q.poll();
            int y=(int)q.poll();
            sum=sum+(int)y;
            q.add(x+y);
        }
        System.out.println(sum+(int)q.remove());
        
    }
    
}
