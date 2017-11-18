/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Hack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FastReader in=new FastReader();
       int t=in.nextInt();
       for(int h=0;h<t;h++)
       {
       int n=in.nextInt();
       int x=in.nextInt();
       int k=0;
       tree root=null;
       for(int i=0;i<n;i++)
       {
           int v=in.nextInt();
           tree current=root;
           if(root==null)
           {
               root=new tree(v);
           }
           else
           {
               int s=0;
               while(s==0)
               if(v>current.getdata())
               {
                  if(current.getright()==null)
                  {
                      current.setright(new tree(v));
                      s++;
                  }
                  else
                      current=current.getright();
                  
               }
               else 
               {
                   if(v==current.getdata())
                   {
                       k++;
                       s++;
                   }
                   else if(current.getleft()==null)
                   {
                       current.setleft(new tree(v));
                       s++;
                   }
                   else
                       current=current.getleft();
                   
               }
           }
           
       }
      
       int w=n-k;
       if(w==x)
           System.out.println("Good");
       else if(w<x)
       System.out.println("Bad");
       else if(w>x)
           System.out.println("Average");
    }
    
    }
}
class tree
{
    int data;
    tree left;
    tree right;
    public tree(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public void setdata(int data)
    {
        this.data=data; 
    }
    public void setleft(tree left)
    {
        this.left=left;
        
    }
    public void setright(tree right)
    {
        this.right=right;
    }
    public int getdata()
    {
        return this.data;
    }
    public tree getleft()
    {
        return this.left;
    }
    public tree getright()
    {
        return this.right;
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