
package maxtree;
import java.util.Scanner;
public class Maxtree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        tree root=null;
                for(int i=0;i<7;i++)
                {
                    int s=0;
                   int n=in.nextInt();
                    tree current=root;
                      if(root==null)
                      {
                          root=new tree(n);
                      }
                      else
                      {
                          while(s==0)
                          {
                             if(current.getdata()<n)
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
               
        
    }
    public void max(tree root)
    {
        if(root!=null)
        {
            max(root.getleft());
            max(root.getright());
            if()
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
