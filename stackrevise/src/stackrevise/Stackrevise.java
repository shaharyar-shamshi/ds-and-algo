/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackrevise;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shaharyar
 */
public class Stackrevise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Character> stk = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        boolean isValid =  true;
        String s = in.next();
        for (int i = 0; i<s.length(); i++) {
          if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
              stk.push(s.charAt(i));
    } else if (s.charAt(i)== '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
           char temp = stk.pop();
           if ((s.charAt(i) == '}' && temp == '{') || (s.charAt(i) == ')' && temp == '(' ) || (s.charAt(i) == ']' && temp == '['))
               isValid = true;
           else 
               isValid = false;
               
        }
      }
        if (isValid && stk.isEmpty())
            System.out.println("valid");
        else 
            System.out.println("invalid");
    }
    
}
