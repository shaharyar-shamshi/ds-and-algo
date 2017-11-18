
package mirror;
import java.util.Scanner;

/**
 *
 * @author shaharyar
 */
public class Mirror {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int q=in.nextInt();
        tree root=new tree(1);
        //tree current1=root;
        for(int i=1;i<t;i++)
        {
            int p=in.nextInt();
            int c=in.nextInt();
            char d=in.next().charAt(0);
           
            Mirror m=new Mirror();
           //  int h=m.height(root);
                m.find(root, c, p,d);
   
         
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
       this.left=left;
       this.right=right;
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
}