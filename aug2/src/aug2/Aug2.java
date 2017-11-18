/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Aug2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int test=in.nextInt();
        for(int l=0;l<test;l++)
        {
        int n=in.nextInt();
        int d=in.nextInt();
        long sum=0;
        long [] a=new long[n];
        for(int i=0;i<n;i++)
        {
          a[i]=in.nextInt();  
          sum=sum+a[i];
        }
        long count=0;
        int flag=0;
        
        if(sum%n==0)
        {
            long avg=sum/n;
            for(int i=0;i<n-d;i++)
            {
                int j=i+d;
                if(a[i]<avg)
                {
                    long x=(avg-a[i]);
                  
                        a[j]=(a[j]-x);
                        count=count+x;
                   
         
                }
                else if(a[i]>avg)
                {
                    long x=(a[i]-avg);
                    a[j]=(a[j]+x);
                    count=count+x;
                }
            }
            if(flag==0)
                for(int i=n-d;i<n;i++)
                {
                    if(a[i]!=avg)
                    { 
                        flag=1;
                        i=n;
                    }
                    
                }
            if(flag==0)
                System.out.println(count);
            else
                System.out.println("-1");
            
        }
        else
        
            System.out.println("-1");
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