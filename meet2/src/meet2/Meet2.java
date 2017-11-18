/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meet2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.util.Arrays.sort;

/**
 *
 * @author shaharyar
 */
public class Meet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int n=in.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=in.nextInt(); 
        }
        int [] x=new int[n*n*n];
        int [] y=new int[n*n*n];
        int l=0;
        int r=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                for(int k=0;k<n;k++)
                {
                   x[l]=a[i]*a[j]+a[k];
                   
                   if(a[i]!=0)
                   {
                       y[r]=a[i]*(a[j]+a[k]);
                       r++;
                   }
                   l++;
                }
        sort(y);
        int count=0;
        int h=0;
        for(int i=0;i<l;i++)
        {
            int g=x[i];
            int s=1;
            {
            while(s!=0)
            if(g>y[(r+h)/2])
                h=(r+h)/2;
                
            else if(g<y[r-h/2])
                h=(r-h)/2;
            else
            {
                count++;
                int w=h-1;
                while(y[w]!=g)
                {
                    count++;
                    w--;
                }
                w=h+1;
                while(y[w]!=g)
                {
                    count++;
                    w++;
                }
            }
            }      
                  
                
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