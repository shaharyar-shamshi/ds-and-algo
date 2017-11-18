/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Hack3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FastReader in=new FastReader();
       int test=in.nextInt();
       for(int j=0;j<test;j++)
       {
       int n=in.nextInt();
       int m=in.nextInt();
       tree root=null;
       for(int i=0;i<n;i++)
       {
           long v=in.nextLong();
           tree current=root;
           if(root==null)
           {
               root=new tree(v);
           }
           else
           {
               int s=0;
               while(s==0)
               {
                   if(v>current.getdata())
                   {
                       if(current.getright()==null)
                       {
                           current.setright(new tree(v));
                           s++;
                       }
                       else
                       {
                           current=current.getright();
                       }
                   }
                   else
                   {
                       if(current.getleft()==null)
                       {
                           current.setleft(new tree(v));
                           s++;
                       }
                       else
                       {
                           current=current.getleft();
                       }
                   }
               }
           }
           
       }
       for(int i=0;i<m;i++)
       {
           long d=in.nextLong();
           int found=0;
           int nf=0;
          tree current =root;
           while(found==0 && nf==0)
           {
               if(current.getdata()>d)
               {
                   if(current.getleft()==null)
                   {
                       nf++;
                       current.setleft(new tree(d));
                   }
                   else
                       current=current.getleft();
               }
                   else if(current.getdata()<d)
                   {
                      if(current.getright()==null)
                      {
                          nf++;
                          current.setright(new tree(d));
                      }
                      else 
                          current=current.getright();
                   }
               else
                       found++;
               }
           if(nf==1)
               System.out.println("NO");
           if(found==1)
               System.out.println("YES");
           }
       }
    }
    
}
class tree
{
    long data;
    tree left;
    tree right;
    public tree(long data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public long getdata()
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
    public void setleft(tree left)
    {
        this.left=left;
    }
    public void setright(tree right)
    {
        this.right=right;
    }
    public void setdata(int data)
    {
        this.data=data;
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