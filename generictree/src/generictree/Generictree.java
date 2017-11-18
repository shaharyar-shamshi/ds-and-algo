
package generictree;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Generictree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       tree root=null;
         for(int i=0;i<9;i++)
         {
             int s=0;
           tree  current=root;
             int p=in.nextInt();
             if(p==-1)
                 root=new tree(i);
             else
             {
                 while(s==0)
                 {
                    if(current.getdata()==p)
                    s++;
                    else if(current.getfirst().getdata()==p)
                    {
                        current=current.getfirst();
                        s++;
                    }
                    else
                    {
                        int t=0;
                        while(current.getnext()!=null||t==0)
                        {
                        current=current.getnext();
                                 if(current.getdata()==p)
                                 {
                                     t++;
                                     s++;
                                 }
                           
                                       
                                }
                    }
                    
                       
                 }
              if(current.getfirst()==null)       
                 current.setfirst(new tree(i));
                     else
              {
                     while(current.getnext()!=null)
                         current=current.getnext();
                     current.setnext(new tree(i));
              }
         }
         }
    }
    
}
class tree
{
    int data;
      tree firstchild;
        tree nextchild;
          public tree(int data)
          {
              this.data=data;
                this.firstchild=null;
                  this.nextchild=null;
          }
            public void setdata(int data)
            {
                this.data=data;
            }
            public void setfirst(tree first)
            {
                this.firstchild=first;
            }
            public void setnext(tree next)
            {
                this.nextchild=next;
            }
            public int getdata()
            {
                return this.data;
            }
            public tree getfirst()
            {
                return this.firstchild;
            }
            public tree getnext()
            {
                return this.nextchild;
            }
}
        