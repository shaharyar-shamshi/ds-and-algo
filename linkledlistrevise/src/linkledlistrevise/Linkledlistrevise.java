/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkledlistrevise;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Linkledlistrevise {
  static int count;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        linkedlist head = null;
        linkedlist current = head;
        linkedlist previous = null;
        System.out.println("enter the data number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n;i++) {
          int data = in.nextInt();
          if (head == null) {
           head = new linkedlist(data);
           current = head;
          } else {
           linkedlist temp = new linkedlist(data);
           current.setNext(temp);
           current = temp;
          }
          
        }
        current = head;
        while (current !=null) {
         System.out.println(current.getData());
         current = current.getNext();
        }
        System.out.println("enter the node number");
        int node = in.nextInt();
        linkedlist x = findnode(head, node);
        System.out.println(x.getData());
        
        
        
    
}
    public static linkedlist findnode(linkedlist head, int node) {
        if (head != null) {
            
        linkedlist correct =  findnode(head.getNext(), node);
         System.out.println("xxx");
         count++;
         System.out.println(count + "  " + node);
         if(count == node) {
          return head;
         }
        }
        return null;
    
    }
}
class linkedlist {
    int data;
    linkedlist next;
    public linkedlist (int data) {
        this.data = data;
        this.next = null;
    }
    public linkedlist(int data, linkedlist next, linkedlist previous) {
        this.data = data;
        this.next = next;
    }
    public linkedlist getNext() {
     return this.next;
    }
    public void setNext(linkedlist next) {
     this.next = next;
    }
    public int getData() {
    return this.data;
    }

}
