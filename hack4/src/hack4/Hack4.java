/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Hack4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int n=in.nextInt();
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
        int min=in.nextInt();
        int max=in.nextInt();
        int s=0;
       int val=limb(root,min);
        int vax=limb(root,max);
        
        if(vax>val)
            System.out.println(vax);
        else
           System.out.println(val);
        
       }
   static int limb(tree root,int m)
    {
        int mini=root.getdata();
        int s=mini;
        tree current=root;
        while(current.getdata()!=m)
        {
            
            if(current.getdata()>m)
            {
                                
                
                    mini=current.getdata();
                 
                current=current.getleft();
                
            }
            else
            {
                                
                
                    mini=mini;
                 
                current=current.getright();
                
            }
        }
        
            
            if(m>mini)
                return m;
            else return mini;
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