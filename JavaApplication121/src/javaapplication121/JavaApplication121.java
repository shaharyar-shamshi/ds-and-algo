/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication121;

import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class JavaApplication121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         Map< BigInteger, BigInteger> hm = 
                        new HashMap< BigInteger,BigInteger>();
        BigInteger pivot=new BigInteger("0");
        BigInteger [] a=new BigInteger[n];
        BigInteger [] b = new BigInteger[n];
        b[0] = new BigInteger("0");
        int count =0 ;
       for (int i=0;i<n;i++) {
           if(i==0){
           a[i] =new BigInteger("0");
           }
           else {
           a[i] = a[i-1].add(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i))); 
           }
           
       }
       for (int i=0;i<n;i++){
        if(i==0) {
         pivot = in.nextBigInteger();
         
        }
        else {
        b[i] = in.nextBigInteger().subtract(pivot);
        BigInteger dif = a[i].subtract(b[i]);
        if(hm.get(dif)==null) {
            hm.put(dif,new BigInteger("1"));
        
        } else {
           hm.put(dif,hm.get((dif).add(new BigInteger("1"))));
        }
        
        
        
        }
        }
       BigInteger maxValueInMap=(Collections.max(hm.values()));
        for (Entry<BigInteger, BigInteger> entry : hm.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(n.subtract(entry.getKey()));
       }
        }
    }
    
}
