/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Aug7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int n=in.nextInt();
        int q=in.nextInt();
        int a[]=new int[n];
        int [] nge=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        
        
       for(int h=0;h<q;h++)
       {
        int type=in.nextInt();
        if(type==1)
        {
            great(a,nge);
        int i=in.nextInt()-1;
        int k=in.nextInt();
       
                for(int l=0;l<n;l++)
                    System.out.print(nge[l]+" ");
                        
        
        while(k!=0)
        {
            if(nge[i]!=-1)
            {
                i=nge[i];
                k--;
            }
            else
            {
                k=0;
            }
        }
        System.out.println(i+1);
        
        }
        if(type==2)
        {
            int l=in.nextInt();
            int r=in.nextInt();
            int x=in.nextInt();
            for(int i=l-1;i<r;i++)
                
                a[i]=a[i]+x;
          
        }
        
    }
    }
    

static void great(int []a,int [] nge)
{
    Stack s=new Stack();
    
  for(int i=0;i<a.length;i++)
        {
            
            
            int v=a[i];
            if(!s.empty() && (i-(int)s.peek())<=100)
            {
            if(a[(int)s.peek()]<v )
            {
                int g=0;
                while( g==0)
                {
                  int x=(int) s.pop();
                  nge[x]=i;
                  
                  if(!s.empty())
                  {
                  if(a[(int)s.peek()]>=v )
                      g=1;
                  }
                  else
                      g=1;
                  
                }
                s.push(i);
            }
            else
                s.push(i);
            }
            else
                s.push(i);
        }
        while(!s.empty())
            nge[(int)s.pop()]=-1;
        
                    
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