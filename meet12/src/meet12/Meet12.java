/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meet12;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Meet12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try
        {
        int p=in.nextInt();
        
        int q=in.nextInt();
        int r=in.nextInt();
        int s=in.nextInt();
        int t=in.nextInt();
        int u=in.nextInt();
        float x=(float) 0.5;
       double y=.0001;
        float a=(float) (p/exp(0.5));
        float b= (float) ((float)q*sin(0.5));
        float c=(float) ((float)r*cos(0.5));
        float d=(float) ((float)s*tan(0.5));
      float e=  (float) ((float)t*(pow(0.5,2)));
      float n=1;
      int g=0;
      while(g==0)
      {
          float ans=a+b+c+d+e+u;
      if(Float.valueOf(String.format("%.4f",ans))==y)
              
      {
          System.out.println(x);
          g++;
      }
      else if(Float.valueOf(String.format("%.4f",ans))>y)
      {
          x=(float) ((n+x)/2);
          
          
          a=(float) (p/exp(x));
         b= (float) ((float)q*sin(x));
         c=(float) ((float)r*cos(x));
         d=(float) ((float)s*tan(x));
       e=  (float) ((float)t*(pow(x,2)));
      }
      else
      {
         float temp=x;
        
         x=(n-x)/2;
          n=temp;
          a=(float) (p/exp(x));
         b= (float) ((float)q*sin(x));
         c=(float) ((float)r*cos(x));
         d=(float) ((float)s*tan(x));
       e=  (float) ((float)t*(pow(x,2)));
         
      }
      } 
}
        catch(Exception e)
                {
                    
                }
    }
}