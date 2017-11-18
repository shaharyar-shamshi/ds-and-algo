
package levelorder;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Levelorder {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        tree root=null;
          for(int i=0;i<7;i++)
          {
              int s=0;
             tree current=root;
              int n=in.nextInt();
              if(root==null)
              {
                  root=new tree(n);
              }
              else
              {
              while(s==0)
              {
               if(n>current.getdata())
              {
                  if(current.getright()==null)
                  {
                      current.setright(new tree(n));
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
                       current.setleft(new tree(n));
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
          Levelorder x=new Levelorder();
          x.print(root);
       
    }
    int height(tree root)
    {
        if(root==null)
            return 0;
        else
        {
            int l=height(root.left);
             int r=height(root.right);
               if(l>r)
                   return (l+1);
               else
                   return (r+1);
        }
    }
      
    public void print(tree root)
    {
        
        tree current=root;
        int h=height(current);
        
        for(int i=1;i<=h;i++)
        {
            printlevel(current,i);
        }
    }
    public void printlevel(tree root,int level)
    {
        if(root==null)
            return;
       else if(level==1)
            System.out.println(root.getdata());
       else if(level>1)
        {
            printlevel(root.getleft(),level-1);
            printlevel(root.getright(),level-1);
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
            public int getdata()
            {
                return this.data;
            }
             public tree getright()
             {
                 return this.right;
             }
               public tree getleft()
               {
                   return this.left;
               }
               public void setdata(int data)
               {
               
                       this.data=data;
               }
               public void setright(tree right)
               {
               
                       this.right=right;
               }
               public void setleft(tree left)
               {
               
                       this.left=left;
               }
}
