/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Aug1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int test=in.nextInt();
        for(int h=0;h<test;h++)
        {
            int flag=1;
		int count=1;
		int n=in.nextInt();
		int a[]=new int[n];
		for (int i=0; i<n; i++)
			a[i]=in.nextInt();
		if (a[0]!=1)
		{
			System.out.println("no");
			continue;
		}
		for(int i=0, j=n-1; i<=j; i++, j--)
		{
			if(a[i]==a[j] && a[i]==count && count<8)
				continue;
			else if(a[i]==a[j] && a[i]==count+1 && count+1<8)
			{	
				count++;
				continue;
			}
			else 
			{
				flag=0;
				break;
			}
		}
		if (flag==1 && count==7)
			System.out.println("yes");
		else 
			System.out.println("no");	
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