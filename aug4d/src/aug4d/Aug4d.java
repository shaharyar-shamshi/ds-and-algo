
package aug4d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 *
 * @author shaharyar
 */
public class Aug4d {

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
      
      int f=0;
      int not=0;
      int g=0;
          int c=0;
      for(int i=0;i<s.length();i++)
      {
          
          for(int j=0;j<s.length();j++)
          {
              if(sc[i]==tc[j])
                  g++;
              if(tc[i]==sc[j])
                  c++;
          }
          if(g!=0 || c!=0)
             i=s.length();
            
      }
      if(g==0 && c==0)
          flagb=1;
      char [] sd=s.toCharArray();
      char [] td=s.toCharArray();
      Arrays.sort(td);
      Arrays.sort(sd);
      
      
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
          
          }
          int nc=0;
          
          if(check==0)
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