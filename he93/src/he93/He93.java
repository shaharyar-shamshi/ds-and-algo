/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package he93;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class He93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
       int n=in.nextInt();
       int []init=new int[n];
       
       int [] visited=new int[n];
       int [] f=new int[n];
       for(int i=0;i<n;i++)
       {
          init[i]=in.nextInt();
       }
       for(int i=0;i<n;i++)
       {
          f[i]=in.nextInt();
       }
       for(int i=0;i<n;i++)
       {
          visited[i]=0;
       }
       long sum=0;
       for(int i=0;i<n;i++)
       {
           int x=0;
           int min=2147483647;
           for(int j=0;j<n;j++)
           {
               int d;
               if(visited[j]==0)
               {
               if(init[i]>=f[j]  )
                   d=init[i]-f[j];
               else 
                   d=f[j]-init[i];
               if(d<min)
               {
                   min=d;
                   x=j;
               }
               }
               
           }
           sum=sum+min;
           visited[x]=1;
           
       }
       System.out.println(sum);
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