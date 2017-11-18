/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack;

import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Hack {

    /**
     * @param args the command line arguments
     */
int max=0;
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int r=in.nextInt();
    int [] a=new int[n];
    for(int i=0;i<n;i++)
    {
       a[i]=in.nextInt();
    }
   
   int []sub=new int [r];
   int [] d=new int[r];
   Hack h=new Hack();
  h.subarray(a,n,sub,r,0,0,d,0);

   
    }
    void subarray(int a[],int n,int sub[],int r,int i,int j,int d[],int l)
    {
        if(j==r)
        {
            int k;
            int and=0;
             for(k=0;k<r;k++)
             {
                 System.out.print(sub[k]+" ");
                 if(and==0)
                 {
                      and=sub[k];
                            
                 }
                 else
                 {
                    and=and&sub[k];
                 }
                
                
             
             }
             
            
              System.out.println(and);
                     
            
           
             
              
        }
        else
        {
            if(i<n)
            {
                sub[j]=a[i];
                subarray(a,n,sub,r,i+1,j+1,d,l);
                subarray(a,n,sub,r,i+1,j,d,l);
                  
            }
        }
     
          
        
        
    }
    void sort(int d[],int x,int max)
    {
        for(int i=0;i<x;i++)
        {
            if(max<d[i])
                max=d[i];
            
        }
        System.out.println(max);
    }
    
}
