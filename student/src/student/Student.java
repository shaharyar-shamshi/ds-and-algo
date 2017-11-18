/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        int [] a=new int[m];
        int count=0;
        for(int i=0;i<m;i++)
        {
            a[i]=k;
        }
        for(int i=0;i<n;i++)
        {
            int h=in.nextInt();
            if(a[h-1]!=0)
            a[h-1]=a[h-1]-1;
            else
            {
                int j;
            for( j=0;j<m;j++)
            {
                if(a[j]!=0)
                {
                    count++;
                    a[j]=a[j]-1;
                    j=m+1;
                }
            }
            if(j==m)
                count++;
                }
            
        }
        System.out.println(count);
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