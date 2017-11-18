/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 *
 * @author shaharyar
 */
public class Aug4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int test=in.nextInt();
        for(int h=0;h<test;h++)
        {
                
        String s=in.next();
        String t=in.next();
        int flagb=0;
        int flaga=0;
        int equal=0;
        
      char [] sc=s.toCharArray();
      char [] tc=t.toCharArray();
      char[] sd=s.toCharArray();
      char [] td=t.toCharArray();
      Arrays.sort(td);
      Arrays.sort(sd);
      int f=0;
      int not=0;
      
      for(int i=0;i<s.length();i++)
      {
          if(td[i]==sd[i])
              f++;
      }
      
      if(f==s.length())
          flagb=1;
      
      if(flagb==0 && flaga==0)
      {
      for(int i=0;i<s.length();i++)
      {
          f=0;
          int check=0;
          char r=sc[i];
          for(int j=0;j<s.length();j++)
          {
              if(tc[j]==r)
                  check=1;
             
                  if(tc[j]!=r)
                      f++;
                  
              
          }
          if(f==s.length())
              not++;
          int nc=0;
          if(check==0 && not==0)
          {
              for(int j=i+1;j<s.length();j++)
                  if(sc[j]==r)
                  {
                     nc=1; 
                     i=s.length()+1;
                     flaga=1;
                  }
              
          } 
          if(check==0 && nc==0 && not==0)
              equal++;
          
          
      }
      if(not!=0)
              flaga=1;
      
        if(equal==s.length())
            flagb=1;
      }
      if(flaga==1)
          System.out.println("A");
      else if(flagb==1)
          System.out.println("B");
      
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