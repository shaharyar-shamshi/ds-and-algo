/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Hack5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int l=in.nextInt();
        int s=in.nextInt();
        int dist=(int) Math.pow(2,l-1);
        int total=(int) (Math.pow(2, l)-1);
        System.out.println(total);
        int same=total-dist;
        int sa=(same*(same-1))/2;
        int da=(dist*(dist-1))/2;
        int k=(s-sa-da)/total;
        
        int [] a=new int[dist];
        for(int i=0;i<dist;i++)
        {
            a[i]=k+1+i;
        }
        int []seg=new int[4*total];
        Hack5 h=new Hack5();
        h.build(seg, a, 1, a.length, 1);
        
        int query=in.nextInt();
        for(int i=0;i<query;i++)
        {
            System.out.print(i%2+" ");
            int rand=((int)Math.random())%total;
            if(rand!=0 )
            System.out.print(seg[rand]);
            else
                System.out.print(a[1]);
            System.out.println();
            
        }
        for(int i=0;i<query;i++)
        {
                
        int type=in.nextInt();
        if(type==0)
        {
           
            int val=in.nextInt();
            if(seg[1]==val)
                System.out.println("root");
            else
            {
                int n=1;
                while(seg[n]!=val)
                {
                    if(val>seg[n])
                    {
                        n=2*n+1;
                       // System.out.print("r");
                    }
                    else
                    {
                       n=2*n;
                       //System.out.print("l");
                    }
                    
                }
                //System.out.println();
            }
        }
        else
        {
            int val=in.nextInt();
            int g=val;
            int count=0;
            while(val!=0)
            {
                val=val/2;
                count++;
            }
            int u=(int)Math.pow(2,count-1);
            int diff=(int) Math.pow(2,l-count);
           
            int o=1;
            int b=1;
            int node=1;
            while(o!=u)
            {
                node=node*2;
                o=(int) Math.pow(2,b);
                b++;
                
            }
            int ans=seg[node]+(g-o)*diff;
           // System.out.println(ans);
           
        }
        }
        
    }
    void build(int []seg,int [] a,int s,int e,int node)
    {
        if(s==e)
        {
            seg[node]=a[s-1];
            return;
        }
        else
        {
        int m=(s+e)/2;
        build(seg,a,s,m,node*2);
        build(seg,a,m+1,e,node*2+1);
        seg[node]=(seg[node*2]+seg[node*2+1])/2;
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