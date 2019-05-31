/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacjer;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Hacjer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int b=0;)
        int n = in.nextInt();
        int k = in.nextInt();
        node head = new node();
        node a = new node();
        for (int i=0;i<n;i++) {
         int pop = in.nextInt();
         if (head.popular == -1){
         head = new node(pop,null);
         a = head;
         }
         else {
         node temp = new node(pop,null);
         a.next = temp;
         a= temp;
         }
        }
        node current = head;
        while(current.next.next != null) {
        if (current.popular < current.next.popular) {
        
        }
        }
        
    }
    
}

class node {
 int popular;
 node next;
 
 node() {
  this.popular = -1;
  this.next =  null;
 }
 
 node (int pop, node next) {
  this.popular = pop;
  this.next = null;
 }
 
 
}