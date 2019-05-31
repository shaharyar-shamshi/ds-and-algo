/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treerevision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Treerevision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        tree root = null;
        tree current = root;
        for (int i=0; i<n; i++) {
          current = root;
          int data = in.nextInt();
          if (root == null) {
              root = new tree(data);
              current = root;
          } else {
               boolean isFound = false;
               while(!isFound) {
                 if(data <= current.getdata()) {
                   if (current.getleft() == null) {
                     isFound = true;
                     tree temp = new tree(data);
                     current.setleft(temp);
                   } else {
                     current = current.getleft();
                   }
                 } else {
                     if (current.getright() == null) {
                     isFound = true;
                     tree temp = new tree(data);
                     current.setright(temp);
                   } else {
                     current = current.getright();
                   }
                 }
               }
              
          }
        }
        System.out.println("the output is");
        
        inorder(root);
        System.out.println();
        System.out.println("the output is");
        levelOrder(root);
        System.out.println("the diameter is");
        int diameter = diameter(root);
        System.out.println(diameter);
    }
    
    public static void inorder(tree root) {
      if(root != null) {
       inorder(root.getleft());
       System.out.print(root.getdata() + " ");
       inorder(root.getright());
      }
      return;
    }
    public static void levelOrder(tree root) {
      Queue <tree>q = new LinkedList<tree>();
      q.offer(root);
      while(!q.isEmpty()) {
        tree temp = (tree)q.poll();
        System.out.print(temp.getdata() + " ");
        if(temp.getleft() != null) {
         q.offer(temp.getleft());
        }
        if (temp.getright() !=null) {
         q.offer(temp.getright());
        }
      }
    }
    
    public static int diameter(tree root) {
        if (root == null) {
         return 0;
        } else {
        int option1 = height(root.getleft()) + height(root.getright());
        int option2 = diameter(root.getleft());
        int option3 = diameter(root.getright());
        return Math.max(option1, Math.max(option2, option3));
        }
}
    public static int height(tree root) {
      if (root == null) {
       return 0;
      } else {
       int lh = height(root.getleft());
       int rh = height(root.getright());
       return Math.max(lh, rh) + 1;
      }
    }
}
class tree {
  int data;
  tree left;
  tree right;
   public tree(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
   }
   public void setdata(int data) {
     this.data = data;   
   }
   
   public void setleft(tree left) {
     this.left = left;   
   }
   
   public void setright(tree right) {
     this.right = right;   
   }
   
   public int getdata() {
     return this.data;   
   }
   
   public tree getleft() {
     return this.left ;   
   }
   
   public tree getright() {
     return this.right;   
   }
  
}