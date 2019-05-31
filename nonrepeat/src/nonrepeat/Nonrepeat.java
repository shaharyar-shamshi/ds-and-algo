/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrepeat;

/**
 *
 * @author shaharyar
 */
public class Nonrepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
class linkedList {
 private char data;
 private linkedList next;
 
 public linkedList() {
  this.data = '\u0000';
  this.next= null;
 }
 
 public linkedList(char a) {
     this.data = a;
     this.next = null;
 }
 
 public void setdata(char a) {
  this.data = a;
 }
 
 public void setNext(linkedList a) {
     this.next= a;
 }
 
 public char getData () {
   return this.data;
 }
 
 public linkedList getNext() {
   return this.next;
 }
 
}