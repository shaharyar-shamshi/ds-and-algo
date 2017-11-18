/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsackrecursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Knapsackrecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int item=in.nextInt();
        int [] weight=new int[item];
        int [] price=new int[item];
        for(int i=0;i<item;i++)
        {
            weight[i]=in.nextInt();
            
        }
         for(int i=0;i<item;i++)
        {
            price[i]=in.nextInt();
            
        }
        
        int weightreq=in.nextInt();
        Knapsackrecursion k=new Knapsackrecursion();
       int ans= k.knapsack(weight, price, item, weightreq);
       System.out.println(ans);
    }
    int knapsack(int [] weight,int [] p,int item,int weightreq)
    {
        if(item==0 || weightreq==0)
        {
            return 0;
        }
        else
        {
            int inc=0,exc=0;
            if(weight[item-1]<=weightreq)
            inc=p[item-1] + knapsack(weight,p,item-1,weightreq-weight[item-1]);
             exc=0+knapsack(weight,p,item-1,weightreq);
            if(inc>exc)
                return inc;
            else
                return exc;
        }
    }
    
}

class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
                                                                                                                                      
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }