/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Sep3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in =new FastReader();
        int test=in.nextInt();
        for(int b=0;b<test;b++)
        {
        String n=in.next();
        String ans=null;
        char [] alpha={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int count=0;
        for(int i=0;i<n.length();i++)
        {
            
            char c=n.charAt(i);
            int x=Character.getNumericValue(c);
            
            for(int j=0;j<n.length();j++)
            {
                
                if(i!=j )
                {
                    char s=n.charAt(j);
                    int r=Character.getNumericValue(s);
                    int d=x*10+r;
                    if(d>=65 && d<91)
                    {
                        if(alpha[d-65]!='a')
                        {
                            if(ans==null)
                            {
                                ans=String.valueOf(alpha[d-65]);
                                count++;
                                        
                            }
                            else
                            {
                                ans=ans+alpha[d-65];
                                count++;
                            }
                            alpha[d-65]='a';
                        }
                    }
                    
      
                
            }
                if(count==26)
                {
                   j=n.length()+1;
                   i=j;
                }
          
        }
        }
        
        if(ans==null)
        System.out.println();
        else
        {
          char[]  a=ans.toCharArray();
          Arrays.sort(a);
          ans=String.valueOf(a);
            System.out.println(ans);
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





