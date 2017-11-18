/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.util.Arrays.sort;
import java.util.StringTokenizer;

/**
 *
 * @author shaharyar
 */
public class Aug3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastReader in=new FastReader();
        int test=in.nextInt();
        for(int h=0;h<test;h++)
        {
        int n=in.nextInt();
        int m=in.nextInt();
        int []exp=new int[n];
        int [] off=new int[m];
        int [] max=new int[m];
        for(int i=0;i<n;i++)
        {
            exp[i]=in.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            off[i]=in.nextInt();
            max[i]=in.nextInt();
        }
        int [][]qual=new int[n][m];
        for(int i=0;i<n;i++)
        {
            String s=in.next();
            for(int j=0;j<m;j++)
            {
                if(s.charAt(j)=='1')
                    qual[i][j]=off[j];
                else
                    qual[i][j]=-1;
            }
        }
      /*  for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(qual[i][j]+" ");
            }
            System.out.println();
        }*/
      int [] check=new int[m];
        int count=0;
        long total=0;
        for(int i=0;i<n;i++)
        {
            int find=exp[i];
           // System.out.println(exp[i]);
            
            int x=-1;
            
            for(int j=0;j<m;j++ )
            {
                if(find<=qual[i][j] && max[j]!=0)
                {
                    find=qual[i][j];
                    x=j;
                    
                    
                }
                
            }
           // System.out.println(x);
            if(x!=-1)
            {
              max[x]=max[x]-1;
               count++;
               total=total+qual[i][x];
               check[x]=-1;
            }
                
        }
        System.out.println(count);
        System.out.println(total);
        int f=0;
        for(int i=0;i<m;i++)
        {
            if(check[i]==-1)
                f++;
        }
        System.out.println(m-f);
        
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