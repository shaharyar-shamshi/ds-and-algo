/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Sep1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int t=in.nextInt();
        for(int g=0;g<t;g++)
        {
        int n=in.nextInt();
        int [] a=new int[n];
        long sum=0;
        long [] add=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            sum=sum+a[i];
            add[i]=sum;
        }
        long min=add[0]+a[0]+sum-add[0];
        int j=0;
        for(int i=1;i<n;i++)
        {
            if(min>(add[i]+a[i]+sum-add[i]))
            {
                j=i;
                min=add[i]+a[i]+sum-add[i];
            }
        }
        String f="12";
        System.out.println(Character.getNumericValue(f.charAt(1)));
        
        
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





