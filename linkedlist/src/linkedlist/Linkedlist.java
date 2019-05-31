/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node head = null;
        Node current = head;
        System.out.println("enter the data number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++) {
          System.out.println("enter the value");
          int data = in.nextInt();
          Node temp = new Node(data);
          if (head == null) {
           head = temp;
           current = head;
          } else {
            current.setNext(temp);
            current = current.getNext();
          }
        }
        current = head;
        while(current.getNext() != null) {
          System.out.println(current.getdata());
          current = current.getNext();
        }
        if(current != null)
        System.out.println(current.getdata());
    }
    
}
 class Node {
     int data;
     Node next; 
 public Node(int value) {
   this.data = value;
   this.next = null;
   }
 public Node(int value, Node next) {
    this.next = next;
    this.data = data;
 }
 
 public void setNext (Node next) {
    this.next = next;
 }
 
 public void setdata(int value) {
   this.data = value; 
 }
 
 public Node getNext () {
   return this.next;
 }
 
 public int getdata() {
   return this.data;
 }
 
 
 }