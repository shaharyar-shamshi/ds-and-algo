/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.util.Arrays.sort;

/**
 *
 * @author shaharyar
 */
public class Sherlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int n=in.nextInt();
        int m=in.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=in.nextInt();
            }
            sort(a[i]);
            
            
        }
        
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((a[i][j]>a[i+1][j]) && min>(a[i][j]-a[i+1][j]))
                    min=a[i][j]-a[i+1][j];
                else if(a[i+1][j]>=a[i][j] && min>(a[i+1][j]-a[i][j]))
                    min=a[i+1][j]-a[i][j];
                else 
                    min=min;
                            
                    
            }
        }
        System.out.println(min);
        
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