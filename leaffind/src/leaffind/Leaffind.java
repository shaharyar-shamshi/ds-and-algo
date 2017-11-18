
package leaffind;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Leaffind {

    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
       tree root = null;
       {
           for(int i=0;i<7;i++)
           {
                 int s=0;
               int n=in.nextInt();
                 if(root==null)
                 {
                    root=new tree(n);
                 }
                 else
                 {
                    tree current=root;
                    while(s==0)
                    {
                     if(n>current.getdata())
                     {
                         if(current.getright()!=null)
                         {
                             current=current.getright();
                         }
                         else
                         {
                             current.setright(new tree(n));
                             s=1;
                         
                     }
                     }
                    else
                     {
                         if(current.getleft()!=null)
                         {
                             current=current.getleft();
                         }
                         else
                         {
                             current.setleft(new tree(n));
                             s++;
                         }
                     }
                    }
                 }
           }
       }
       Leaffind y=new Leaffind();
      int g= y.find(root);
      System.out.println(g);
    }
    public int find(tree root)
            
    {
       
        if(root!=null)
        {
            if(root.getright()==null&&root.getleft()==null)
               return 1;
           else 
     return   find(root.getleft())+find(root.getright());
          
}
     else
            return 0;
        
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
             return this.data ;
         }
         public tree getleft()
         {
             return this.left;
         }
          public tree getright()
          {
              return this.right;
          }
           public void setdata(int data)
           {
               this.data=data;
           }
           public void setleft(tree left)
           {
               this.left=left;
           }
           public void setright(tree right)
           {
                   this.right=right;
           }
}

