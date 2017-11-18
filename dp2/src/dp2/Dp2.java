/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Dp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        long x=1000000009;
        
        long min=0;
        
        
        long max=1;
        long []dp=new long[10000001];
        dp[0]=min;
        dp[1]=max;
        for(long i=2;i<10000001;i++)
        {
            long temp=max%x;
            max=(min+(i*i)%x+(i*i-i+1)%x+(i*i-2*(i-1))%x+(i*i-3*(i-1))%x)%x;
            min=temp;
          dp[(int)i]=max%x;
        }
        int test=in.nextInt();
        for(int k=0;k<test;k++)
        {
            
        int n=in.nextInt();
        System.out.println(dp[n]);
        
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





