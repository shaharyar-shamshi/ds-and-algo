/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug41;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Aug41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int test=in.nextInt();
        
        for(int l=0;l<test;l++)
        {
        int [] a=new int[26];
        int [] b=new int[26];
        
        String s=in.next();
        String t=in.next();
        int maga=0;
        int magb=0;
        int freqa=0;
        char k='a';
        for(int i=0;i<s.length();i++)
        {
            
            a[(int)s.charAt(i)-(int)k]=a[(int)s.charAt(i)-(int)k]+1;
            b[(int)t.charAt(i)-(int)k]=b[(int)t.charAt(i)-(int)k]+1;
            
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0 && b[i]==0)
                maga++;
            if(a[i]==0 && b[i]!=0)
            magb++;
            if(a[i]!=0 && b[i]==0)
                if(a[i]>freqa)
                    freqa=a[i];
        }
        if(maga==0)
            System.out.println("B");
        else if(maga>0 && freqa >1)
            System.out.println("A");
        else
        {
            if(magb!=0)
                System.out.println("B");
            else
                System.out.println("A");
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