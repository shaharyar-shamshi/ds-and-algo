
package mirr;
import java.util.Scanner;
public class Mirr {

    
    public static void main(String[] args) {
        int n;
        int q;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        q=in.nextInt();
        int [] a=new int[2*n];
        a[0]=1;
        for(int i=1;i<2*n;i++)
            a[i]=-1;
          for(int i=1;i<n;i++)
          {
              int p=in.nextInt();
              int c=in.nextInt();
              char ch=in.next().charAt(0);
              for(int j=0;j<2*n;j++)
              {
                  if(a[j]==p)
                  {
                      if(ch=='R')
                          a[2*j+2]=c;
                      else if(ch=='L')
                          a[2*j+1]=c;
                      break;
                  }
                  
              }
          }
          for(int i=0;i<q;i++)
          {
              int f=0;
             int count=1;
              int k=in.nextInt();
              for(int j=0;j<2*n;j++)
              {
                  count++;
                  if(a[j]==k)
                      j=2*n+1;
              }
              for(int j=1;j<2*n;j=j*2)
              {
                  
                  if(count<=j)
                  {
                      f=j/2;
                      j=2*n+1;
                      
                      
                  }
                  
                      
              }
              System.out.println(a[3*f-count-1]);
              
          }
              
       
    }
    
}
