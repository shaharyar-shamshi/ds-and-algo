/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mincoin;

/**
 *
 * @author shaharyar
 */
public class Mincoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mincoin m=new Mincoin();
        int x=m.calci(15);
        System.out.println(x);
        
    }
    int calci(int n)
    {
        int a=0,b=0,c=0;
        if(n<=0)
            return 0;
        else
        {
         if((n-1)>=0)    a=1+calci(n-1);
          if((n-7)>=0)   b=1+calci(n-7);
           if((n-10)>=0)  c=1+calci(n-10);
            return min(a,b,c);
        }
    }
    int min(int a,int b,int c)
    {
        if(a<=b && a<=c)
            return a;
        else if(b<=a && b<=c)
            return b;
        else
            return c;
    }
}
