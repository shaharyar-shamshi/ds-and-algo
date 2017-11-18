
package binary;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       tree root = null;
    
        for(int i=0;i<5;i++)
       
       {
           int s=0;
            tree current=root;
           int t=in.nextInt();
           if(root==null)
           {
               root=new tree(t);
           }
           else
           {
           while(s==0)
           {
               if(t>current.getdata())
               {
                   if(current.getright()==null)
                   {
                       current.setright(new tree(t));
                       s=1;
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
                            current.setleft(new tree(t));
                            s=1;
                        }
                        else
                        {
                      current= current.getleft();
                        }
               }
           }
           
           
           
           }
           
              
           
       }
        Binary x=new Binary();
         int h=0;
          
              
         
              
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
              public void setright(tree right)
              {
                  this.right=right;
              }
               public void setleft(tree left)
               {
                   this.left=left;
               }
                 public void setdata(int data)
                 {
                     this.data=data;
                 }
}

