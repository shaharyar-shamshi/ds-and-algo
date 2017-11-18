/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package june2a;
import java.util.*;

/**
 *
 * @author shaharyar
 */
public class June2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int x=0;
       // Vector[][] s=new Vector[n][k];
       // int []visited=new int[k];
        Vector v=new Vector(n);
        for(int i=0;i<n;i++)
        {
            
            int r=in.nextInt();
            
            Vector<Integer> g=new Vector(r);
            for(int j=0;j<r;j++)
            
                g.addElement((Integer)in.nextInt());
            
            v.add(g);
        }
        System.out.println("answer");
        for(int i=0;i<v.size();i++)
        {
             
            int []visited=new int[k];
            Vector h=(Vector)v.get(i);
            for(int j=0;j<h.size();j++)
            {
                visited[(int)h.get(j)-1]=1;
                        
            }
            int []nv=new int[k-h.size()];
            int s=0;
            for(int j=0;j<k;j++)
            {
               if(visited[j]==0)
               {
                   nv[s]=j+1;
                   s++;
               }
               
        
            }
            
            
            if(s!=0)
            {
                int z=0;
            for(int j=0;j<n;j++)
            {
                for(int m=0;m<nv.length;m++)
                {
                  //  Integer d=<Int[m];
                if(h.contains((Integer)nv[m])) 
                  z++;
                }
                
                    
                
            }
            if(z==nv.length)
                x++;
            }
           else
            {
                x=x+n-1;
            }
        }
        System.out.println(x);
        
    }
    
}
