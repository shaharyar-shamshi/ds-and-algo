/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adj;
import java.util.Iterator;
import java.util.LinkedList;
import javafx.util.Pair;
import java.util.Scanner;
/**
 *
 * @author shaharyar
 */
public class Adj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int v=in.nextInt();
        
        LinkedList <Pair<Integer,Integer>>[] adjacencylist=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjacencylist[i]=new LinkedList<>();
        }
       int weight=0;
       int edge=in.nextInt();
       for(int i=0;i<edge;i++)
       {
           int start=in.nextInt();
           int end=in.nextInt();
           adjacencylist[start].add(new Pair<>(end,weight));
           adjacencylist[end].add(new Pair<>(start,weight));
           
       }
       for(int i=0;i<v;i++)
       {
           System.out.println("for" +(i+1));
           Iterator E=adjacencylist[i].iterator();
            while(E.hasNext())
         
          {
            Pair<Integer,Integer> j=(Pair<Integer,Integer> )E.next();
            int k=(int)j.getKey();
            System.out.println(k);
              
              
          }
       }
    }
    
}
