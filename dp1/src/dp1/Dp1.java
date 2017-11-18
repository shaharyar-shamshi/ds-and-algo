/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Dp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    FastReader in=new FastReader();
   
    int test=in.nextInt();
    for(int j=0;j<test;j++)
    {
    
         long n=in.nextLong();
    
  /*  long out=1;
    
    long inner=2;
    
   
    if(n>1)
    {
        for(long i=2;i<=n;i++)
        {
            long temp=inner%x;
            inner=(out+inner)%x;
            out=temp;
            
        }
    }
    System.out.println(inner%x);*/
        long[][] f={{1,1},{1,0}};
        power(f,n+1);
        System.out.println(f[0][0]);
    }  
    }
   static void power(long [][] f,long n)
    {
        if(n==0 || n==1)
            return;
        long [][]m={{1,1},{1,0}};
        power(f,n/2);
        multiply(f,f);
        if(n%2!=0)
        {
            multiply(f,m);
        }
    }  
   static void multiply(long [][] f,long[][]m)
   {
        int b=1000000007;
     long x=((f[0][0]*m[0][0])%b+(f[0][1]*m[1][0])%b)%b;
     long y=((f[0][0]*m[0][1])%b+(f[0][1]*m[1][1])%b)%b;
     long w=((f[1][0]*m[0][0])%b+(f[1][1]*m[1][0])%b)%b;
     long z=((f[1][0]*m[0][1])%b+(f[1][1]*m[1][1])%b)%b;
     f[0][0]=x;
     f[0][1]=y;
     f[1][0]=w;
     f[1][1]=z;
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